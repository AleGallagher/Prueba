/**
 * 
 */
package com.itrsa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author alejandro_sandler
 *
 */
@Controller
@RequestMapping("/resultados")
public class Resultados {
	
	@RequestMapping(method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {
		model.addAttribute("mensaje", "Resultados");
		return "resultados";
 
	}

}