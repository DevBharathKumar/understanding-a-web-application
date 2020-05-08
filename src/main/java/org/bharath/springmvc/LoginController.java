package org.bharath.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController 
{
	@RequestMapping(value = "/login" , method=RequestMethod.GET)
	public String sendLoginJsp()
	{
		return "Login";
	}
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String processInformationFromLoginJsp(@RequestParam String name,@RequestParam("password") String pass,ModelMap map)
	{
		map.put("name", name);
		map.put("password", pass);
		return "welcome";
	}

}
