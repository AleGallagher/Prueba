/**
 * 
 */
package com.itrsa.validation;
import org.springframework.stereotype.Component;
import org.springframework.validation.Validator;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;

import com.itrsa.model.Equipo;
/**
 * @author alejandro_sandler
 *
 */
@Component
public class EquipoValidation implements Validator{
	
	
	public boolean supports(Class clazz) {
		//just validate the Customer instances
		return Equipo.class.isAssignableFrom(clazz);
	}
	
	
	public void validate(Object target, Errors errors) {			
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "nombre","required.nombre", "El campo es obligatorio");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "pais", "required.pais","El campo es requerido");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "numero", "required.numero","El campo es requerido");	
	}

}

