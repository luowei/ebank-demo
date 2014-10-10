package com.rootls.netbank.trade.jiaoyi;

import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

/**
 * Created by luowei on 2014/9/26.
 */
public interface Jh3Fc010Repository extends PagingAndSortingRepository<Jh3Fc010, Integer> {
    List<Jh3Fc010> findByMchNoAndCtrtNoAndPayPrdNo(String mchNo, String ctrtNo, String payPrdNo);
}
