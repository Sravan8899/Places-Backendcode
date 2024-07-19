package com.visit.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.visit.model.loginmodel;

public interface loginrepo extends JpaRepository<loginmodel, String> {

	static void persist(loginmodel details) {
		// TODO Auto-generated method stub
		
	}

	
		
	

}
