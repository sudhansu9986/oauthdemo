package com.sudhansu.oauth.oauthdemo.data.repository;

import org.springframework.data.repository.CrudRepository;

import com.sudhansu.oauth.oauthdemo.data.entities.User;

public interface UserRepository extends CrudRepository<User, Integer > {
	
	User findByName(String name);

}
