package com.sudhansu.oauth.oauthdemo.data.entities;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
//import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.security.core.GrantedAuthority;
@Entity
@Table(name="role")
public class Role implements GrantedAuthority{
	@Id
	private Integer id;
	@NotEmpty
	private String name;
	
	@ManyToMany(mappedBy="roles")
	private Set<User> users;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<User> getUsers() {
		return users;
	}

	public void setUsers(Set<User> users) {
		this.users = users;
	}

	@Override
	public String getAuthority() {
		return name;
	}

}
