package com.dolsoft.dmm.data;

import org.springframework.data.repository.CrudRepository;

import com.dolsoft.dmm.domain.User;

public interface UserRepository extends CrudRepository<User, Long> {

	  User findByUsername(String username);

}
