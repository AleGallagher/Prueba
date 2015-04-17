/**
 * 
 */
package com.itrsa.model;

/**
 * @author alejandro_sandler
 *
 */
public class Equipo {
String nombre;
String pais;
Integer numero;

public Equipo()
{}

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
 * @return the pais
 */
public String getPais() {
	return pais;
}

/**
 * @param pais the pais to set
 */
public void setPais(String pais) {
	this.pais = pais;
}

/**
 * @return the numero
 */
public Integer getNumero() {
	return numero;
}

/**
 * @param numero the numero to set
 */
public void setNumero(Integer numero) {
	this.numero = numero;
}


}
