package com.biznomy.application.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.biznomy.application.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long>{
	
	Role findByRole(String role);

}
