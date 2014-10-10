package com.rootls.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by luowei on 2014/8/15.
 */
@Controller
@RequestMapping("/user")
public class AdminController {

    @Autowired
    AdminRepository adminRepository;

    @RequestMapping(value = "/index")
    public String index(){
        return "index";
    }
}
