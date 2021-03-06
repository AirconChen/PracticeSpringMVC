package com.fpg.ec.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping("/hello")
public class HelloSpringMVC {
	
	
	@RequestMapping(value="/print", method=RequestMethod.GET)
	public String printHello(){
		return "hello";
	}
	
	
	@RequestMapping("/print/{name}")
	public String printHello2(@PathVariable("name") String iName){
		System.out.println("iName:"+iName);
		return "hello";
	}

}
