/**
 * 
 */
package com.itrsa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author alejandro_sandler
 *
 */
@Controller
@RequestMapping("/home")
public class Main {
	
	@RequestMapping(method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {
		model.addAttribute("mensaje", "HOOOlaaa");
		return "hello";
 
	}
}
