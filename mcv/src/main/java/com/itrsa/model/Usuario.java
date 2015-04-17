/**
 * 
 */
package com.itrsa.model;

/**
 * @author alejandro_sandler
 *
 */
public class Usuario {

	public Usuario()
	{}
	
	String nombre;
	String mail;
	String pass;
	
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
	 * @return the mail
	 */
	public String getMail() {
		return mail;
	}
	/**
	 * @param mail the mail to set
	 */
	public void setMail(String mail) {
		this.mail = mail;
	}
	
}
