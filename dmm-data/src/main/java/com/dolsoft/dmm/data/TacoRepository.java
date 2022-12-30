package com.dolsoft.dmm.data;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.dolsoft.dmm.domain.Taco;

public interface TacoRepository 
	extends PagingAndSortingRepository<Taco, Long> {

}
