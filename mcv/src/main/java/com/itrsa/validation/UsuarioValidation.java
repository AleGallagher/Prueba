/**
 * 
 */
package com.itrsa.validation;

import java.util.regex.Pattern;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.itrsa.model.Equipo;
import com.itrsa.model.Usuario;

/**
 * @author alejandro_sandler
 *
 */
public class UsuarioValidation implements Validator {
	String specialMail = "!#$%^&*?¡¿()/{};+";
	String patternMail = ".*[" + Pattern.quote(specialMail) + "].*";
	
	public boolean supports(Class clazz) {
		//just validate the Customer instances
		return Equipo.class.isAssignableFrom(clazz);
	}

	public void validate(Object target, Errors errors) {			
		
		Usuario usua = (Usuario)target;
		validarExpresion(usua.getMail(),patternMail);
	}

	boolean validarExpresion(String var, String expresion)
	{
		if(var.matches(expresion))
		{
			return false;
		}
		 return true;
	}
}
