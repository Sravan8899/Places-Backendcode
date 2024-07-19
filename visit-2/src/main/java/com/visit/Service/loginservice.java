package com.visit.Service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.visit.model.loginmodel;
import com.visit.repo.loginrepo;



@Service
@CrossOrigin("*")
public class loginservice {
	@Autowired
	loginrepo logrepo;
	
	
	public ResponseEntity<String> adduser2(loginmodel details) {
		
		       logrepo.save(details);
		 return ResponseEntity.ok("success");
				 
		
		
	}

	public Boolean gedetails2(String user, String pass) {
		
	  String use1=user;
	  String pass1=pass;
	
	Boolean set =false;
	
	try {
		
	loginmodel temp=logrepo.findById(use1).get();
	
	if(use1.contentEquals(temp.getUser1())  && (pass1.contentEquals(temp.getPass1())))
	{
		set=true;
		
	}
 }
	
	catch(Exception e)
	{
		
	set=false;
	
	}
	if(set)
	{
	return true;
	}
	else
	{
		
	return false;
	}
}

	public String deletemethod2(loginmodel param) {
		
		
		
		String param3="Not deleted";
		try {
			loginmodel param2=logrepo.findById(param.getUser1()).get();
			System.out.print(param2);
		if(param.getUser1().contentEquals(param2.getUser1())) 
		{
			logrepo.deleteById(param.getUser1());
			param3="Success";
			
		}
		}
		catch(Exception e)
		{
			param3="Not deleted";
		}
		
		return param3;
	}

	

	
}