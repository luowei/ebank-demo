package com.rootls.manage.repository;

import com.rootls.manage.model.SysCorpBank;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by luowei on 2014/9/12.
 */
public interface SysCorpBankRepository extends PagingAndSortingRepository<SysCorpBank,Integer> {

    SysCorpBank findById(Integer id);

    @Transactional
    @Modifying
//    @Query("update SysCorpBank set corpName=?1,corpBankAccount=?2," +
//            "corpOpeningBank=?3,corpCertPicture=?4,corpBankId=?5 where id=?6")
    @Query("update SysCorpBank set corpName=:aaa,corpBankAccount=:bbb," +
            "corpOpeningBank=:cccc,corpCertPicture=:corpCertPicture,corpBankId=:corpBankId where id=:id")
    Integer update(@Param("aaa")String corpName, @Param("bbb")String corpBankAccount, @Param("cccc")String corpOpeningBank,
                   @Param("corpCertPicture")String corpCertPicture, @Param("corpBankId")Integer corpBankId,@Param("id")Integer id);

    void deleteByCorpId(Integer corpoId);
}
