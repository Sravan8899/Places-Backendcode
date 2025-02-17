package com.visit.controller;

import org.springframework.web.bind.annotation.RestController;

import com.visit.Service.loginservice;
import com.visit.model.loginmodel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@CrossOrigin("*")
public class logincontroller {
	
	@Autowired
	loginservice logservice;
	
	@PostMapping("/add/user")
	public ResponseEntity<String> adduser1(@RequestBody loginmodel details) {
		
		System.out.print(details.getPass1());
		try {
		 logservice.adduser2(details);
		 return ResponseEntity.ok("successfully inserted");	
		}
		catch(Exception e)
		{
			return ResponseEntity.ok("not inserted");	
	    }
	}
	
	@GetMapping("now")
	public Boolean details1(@RequestParam String user, String pass)
	{
		return logservice.gedetails2(user, pass);
	}
	
	@GetMapping("/delete")
	public String deletemethod(@RequestBody loginmodel param) {
		
		return logservice.deletemethod2(param);
		
	}
	
	
	

}
