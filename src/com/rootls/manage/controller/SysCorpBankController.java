package com.rootls.manage.controller;

import com.rootls.manage.model.SysCorpBank;
import com.rootls.manage.model.SysCorporation;
import com.rootls.manage.repository.SysCorpBankRepository;
import com.rootls.manage.repository.SysCorporationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

/**
 * Created by luowei on 2014/9/12.
 */
@Controller
@RequestMapping("/corpbank")
public class SysCorpBankController {

    @Autowired
    SysCorpBankRepository sysCorpBankRepository;
    @Autowired
    SysCorporationRepository sysCorporationRepository;

    @RequestMapping("/list")
    public String pageSysCorpBank(Model model){

        Page<SysCorpBank> page = sysCorpBankRepository.findAll(new PageRequest(0,3,new Sort("id")));

        return "corpbank/list";
    }

    @ResponseBody
    @RequestMapping("/save")
    public SysCorpBank saveSysCorpBank(Model model,SysCorpBank sysCorpBank){

        sysCorpBank.setCorpTime(String.valueOf(new Date().getTime()/1000));

        SysCorpBank corpBank = sysCorpBankRepository.save(sysCorpBank);

        return corpBank;

//        return "corpbank/list";
    }

    @RequestMapping("/toAdd")
    public String toAdd(Model model,SysCorpBank corpo /*Integer id*/){

        SysCorporation sysCorpo =  sysCorporationRepository.findByCorporationId(corpo.getCorpId());

        corpo.setCorpName(sysCorpo.getCorporationName());

        model.addAttribute("corpo",corpo);
        return "bank/signe";
    }

    @RequestMapping("/toEdit")
    public String toEdit(Model model,Integer id){

        SysCorpBank corpo = sysCorpBankRepository.findById(id);

        model.addAttribute("corpo",corpo);
        return "bank/editSigne";
    }

    @ResponseBody
    @RequestMapping(value="/update")
    public SysCorpBank update(SysCorpBank corpo){

//        SysCorpBank corpoOld = sysCorpBankRepository.findById(corpo.getId());
//        corpo.setCorpTime(corpoOld.getCorpTime());

         sysCorpBankRepository.update(corpo.getCorpName(),corpo.getCorpBankAccount(),
                corpo.getCorpOpeningBank(),corpo.getCorpCertPicture(),corpo.getCorpBankId(),corpo.getId());

        return corpo;
    }

    @ResponseBody
    @RequestMapping("/deleteById")
    public String deleteById(Integer id){
        sysCorpBankRepository.delete(id);
        return "ok";
    }

    @ResponseBody
    @RequestMapping("/deleteByCorpoId")
    public String deleteByCorpoId(Integer corpoId){
        sysCorpBankRepository.deleteByCorpId(corpoId);
        return "ok";
    }

}
