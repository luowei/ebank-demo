package com.rootls.manage.repository;

import com.rootls.manage.model.Bank;
//import org.springframework.data.repository.NoRepositoryBean;

/**
 * Created by luowei on 2014/8/20.
 */
//@NoRepositoryBean
public interface BankRepository {

    Bank findById(Integer id);
}
