package com.niit;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

	@RequestMapping(value = {"/","/home"})
	public String m1()
	{
		return "index";
	}
	@RequestMapping("/contact")
	public String m2()
	{
		return "contactus";
	}
	@RequestMapping("/aboutus")
	public String m3()
	{
		return "aboutus";
	}
}
