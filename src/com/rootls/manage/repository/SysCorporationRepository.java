package com.rootls.manage.repository;

import com.rootls.manage.model.SysCorporation;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created by luowei on 2014/9/19.
 */
public interface SysCorporationRepository extends PagingAndSortingRepository<SysCorporation,Integer> {

    SysCorporation findByCorporationId(Integer id);

//    SysCorporation findByCorporationId(Integer id);

}
