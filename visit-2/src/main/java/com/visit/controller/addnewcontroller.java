package com.visit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.visit.Service.addservice;
import com.visit.model.addnewplacemodel;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;




@RestController
@CrossOrigin("*")
public class addnewcontroller {
	
	@Autowired
	addservice adserv;
	
	@PostMapping("/addplace")
	public ResponseEntity<String> addMethod(@RequestBody addnewplacemodel places) {
		
		
		try {
		adserv.addMethod2(places);
		return ResponseEntity.ok("successfully added");
		  } 
		catch(Exception e)
		{
			return ResponseEntity.ok("NOT ADDED");		
			}
			
	}
	
	@GetMapping("/path")
	public List<addnewplacemodel> getMethod( ) {
		return adserv.getall();
	}
	
	

}
