package com.kce.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.kce.model.Validate;

@Controller
public class ValidateController {
	@RequestMapping(value="/",method=RequestMethod.GET)
	public ModelAndView doStart()
	{
		return new ModelAndView("sample");
	}
	@RequestMapping(value="/val",method=RequestMethod.GET)
	public ModelAndView doVal(@ModelAttribute Validate val,Map<String,String> map)
	{
		if(val.getUsername().equals(val.getPassword()))	
		{
	     
			return new ModelAndView("success");
			 
		}
		else
		{
			return new ModelAndView("fails");
	   
		}
}
}