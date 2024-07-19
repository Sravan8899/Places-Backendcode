package com.visitController;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
public class LoginuserController {
	
	@GetMapping("/adduser")
	public Boolean getMethodName() 
	{
		
		return true;
	}
	

}
