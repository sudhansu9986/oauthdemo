package com.sudhansu.oauth.oauthdemo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.sudhansu.oauth.oauthdemo.data.entities.User;
import com.sudhansu.oauth.oauthdemo.data.repository.UserRepository;

@Service
public class CustomUserDetailsService implements UserDetailsService {
	
	@Autowired
	UserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String name) throws UsernameNotFoundException {
		User user = userRepository.findByName(name);
		return new org.springframework.security.core.userdetails.User(user.getName(),user.getPassword(),user.getRoles());
	}

}
