package com.rootls.manage.repository;

import com.rootls.manage.model.Bank;
//import org.springframework.data.jdbc.query.QueryDslJdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by luowei on 2014/8/20.
 */
@Repository
@Transactional
public class QueryBankRepository implements BankRepository {

//    private QueryDslJdbcTemplate qdslTemplate;

    @Override
    public Bank findById(Integer id) {

        return null;
    }
}
