package com.soturno.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Table(name = "user")
@Entity
@Getter
@Setter
public class User {
	
	@Id
	@GeneratedValue
	@Column(name ="id")
	private Long id;
	
	@Column(name ="first_name")
	private String firstName;
	
	@Column(name ="last_name")
	private String lastName;
	
	@Column(name ="email")
	private String email;
	
	@Column(name ="username")
	private String username;
	
	@Column(name ="password")
	private String password;
	
	@OneToMany(mappedBy = "user", fetch = FetchType.EAGER)
	private Set<Roles> roles;

}
