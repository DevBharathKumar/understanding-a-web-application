package webapp;

public class UserValidationService {
	
	public boolean isValidUser(String name,String password)
	{
		if(name.equals("admin") && password.equals("password"))
			return true;
		
		return false;
	}

}
