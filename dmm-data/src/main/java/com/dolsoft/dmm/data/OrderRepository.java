package com.dolsoft.dmm.data;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

import com.dolsoft.dmm.domain.TacoOrder;
import com.dolsoft.dmm.domain.User;

public interface OrderRepository 
extends CrudRepository<TacoOrder, Long> {

	  List<TacoOrder> findByUserOrderByPlacedAtDesc(
	          User user, Pageable pageable);

}
