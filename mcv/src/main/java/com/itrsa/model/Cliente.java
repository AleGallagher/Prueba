/**
 * 
 */
package com.itrsa.model;

import java.util.Date;

/**
 * @author alejandro_sandler
 *
 */
public class Cliente {
String nombre;
String apellido;
Date fechaNac;
Integer idProvincia;
Integer idCiudad;
Integer idUsuario;

public Cliente()
{
}


/**
 * @return the idUsuario
 */
public Integer getIdUsuario() {
	return idUsuario;
}


/**
 * @param idUsuario the idUsuario to set
 */
public void setIdUsuario(Integer idUsuario) {
	this.idUsuario = idUsuario;
}


/**
 * @return the nombre
 */
public String getNombre() {
	return nombre;
}

/**
 * @param nombre the nombre to set
 */
public void setNombre(String nombre) {
	this.nombre = nombre;
}

/**
 * @return the apellido
 */
public String getApellido() {
	return apellido;
}

/**
 * @param apellido the apellido to set
 */
public void setApellido(String apellido) {
	this.apellido = apellido;
}

/**
 * @return the fechaNac
 */
public Date getFechaNac() {
	return fechaNac;
}

/**
 * @param fechaNac the fechaNac to set
 */
public void setFechaNac(Date fechaNac) {
	this.fechaNac = fechaNac;
}

/**
 * @return the idProvincia
 */
public Integer getIdProvincia() {
	return idProvincia;
}

/**
 * @param idProvincia the idProvincia to set
 */
public void setIdProvincia(Integer idProvincia) {
	this.idProvincia = idProvincia;
}

/**
 * @return the idCiudad
 */
public Integer getIdCiudad() {
	return idCiudad;
}

/**
 * @param idCiudad the idCiudad to set
 */
public void setIdCiudad(Integer idCiudad) {
	this.idCiudad = idCiudad;
}


}
