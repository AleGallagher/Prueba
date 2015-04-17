/**
 * 
 */
package com.itrsa.validation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.regex.Pattern;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.itrsa.model.Cliente;
import com.itrsa.model.Equipo;

/**
 * @author alejandro_sandler
 *
 */
public class ClienteValidation implements Validator {

	private SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
	String special = "!@#$%^&*¿?¡()_/{}-;+";
	String pattern = ".*[" + Pattern.quote(special) + "].*";
	String validarNumerico= ".*\\d+.*";
		
	public boolean supports(Class clazz) {
		//just validate the Customer instances
		return Equipo.class.isAssignableFrom(clazz);
	}
	
	public void validate(Object target, Errors errors) {
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "nombre", "required.nombreCliente", "El campo es obligatorio");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "epellido", "required.apellidoCliente", "El campo es obligatorio");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "fechaNac", "required.fechaCliente", "El campo es obligatorio");
	
		Cliente cli= (Cliente)target;
		if(!validarFecha(cli.getFechaNac()))
		{
			errors.rejectValue("password", "formatoInvalido.fecha");
		}
		
		
	}
	
	public boolean validarFecha(Date fecha)
	{
		if(fecha.after(Calendar.getInstance().getTime()) )
			  return false;
		
		
		Date fechaMinima;
		try {
			fechaMinima = formatoFecha.parse("01/01/1000");
			if(fecha.before(fechaMinima))
				  return false;
		} catch (ParseException e) {
			
			e.getMessage();
		}
		
	return true;
	}
}
