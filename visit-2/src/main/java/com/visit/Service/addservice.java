package com.visit.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.visit.model.addnewplacemodel;
import com.visit.repo.addplacerepo;

@Service
public class addservice {
	
	@Autowired
	addplacerepo addrepo;

	public addnewplacemodel addMethod2(addnewplacemodel places) {
		// TODO Auto-generated method stub
		return addrepo.save(places);
	}

	public List<addnewplacemodel> getall() {
		// TODO Auto-generated method stub
		return addrepo.findAll();
	}

}