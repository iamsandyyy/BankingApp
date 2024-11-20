package com.example.bank_project.entity;

import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String username;
	public void setUsername(String username) {
		this.username = username;
	  }
	
	  public void setPassword(String password) {
		this.password = password;
	  }
	
	  public void setRoles(Set<Role> roles) {
		this.roles = roles; 
	  }

    // Additional fields
    private String password;
    private Set<Role> roles;

}