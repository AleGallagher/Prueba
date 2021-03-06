/**
 * 
 */
package com.itrsa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.ModelAndView;

import com.itrsa.model.Equipo;
import com.itrsa.validation.EquipoValidation;

/**
 * @author alejandro_sandler
 *
 */
@Controller
@RequestMapping("/grupo")
public class Grupo {
	
	EquipoValidation val;
	
	@RequestMapping(method = RequestMethod.GET)
	public String initForm(ModelMap model){
		
		Equipo equi = new Equipo();

		equi.setNombre("Equipo 1");
		equi.setNumero(123456);
		equi.setPais("Argentina");
		model.addAttribute("equipo", equi);
		
		return "grupo1";
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public ModelAndView processSubmit(@ModelAttribute("equipo") Equipo equi,BindingResult result, SessionStatus status) {
 
		val= new EquipoValidation();
		val.validate(equi, result);
		if(result.hasErrors())
			return new ModelAndView("grupo1");
		else {
			status.setComplete();
		return new ModelAndView("grupo3","equipo",equi);
		}
	} 
	
	
	
	
	
	
	
	@RequestMapping(value="/grupo1",method = RequestMethod.GET)
	public String grupo1(ModelMap model) {
		model.addAttribute("mensaje", "Grupo1");
		return "hello";
 
	}
	
	@RequestMapping(value="/grupo3",method = RequestMethod.GET)
	public String grupo2(ModelMap model) {
		model.addAttribute("mensaje", "Grupo2");
		return "grupo3";
 
	}
}
