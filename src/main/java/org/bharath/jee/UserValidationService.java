package org.bharath.jee;

import org.springframework.stereotype.Service;

@Service
public class UserValidationService {
	
	public boolean isValidUser(String name,String password)
	{
		if(name.equals("admin") && password.equals("password"))
			return true;
		
		return false;
	}

}
