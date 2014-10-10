package com.rootls.netbank.trade.sign;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by luowei on 2014/9/24.
 */
public interface Jh3Fc001Repository extends PagingAndSortingRepository<Jh3Fc001, Integer> {
    List<Jh3Fc001> findByCorpId(int corpId);

    @Modifying
    @Transactional
    @Query("update Jh3Fc001 set mbrSts=0 where id=?1")
    Integer updateSignStatus(int id);
}
