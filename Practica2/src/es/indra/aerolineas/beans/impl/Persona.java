/**

 * 
 */
package es.indra.aerolineas.beans.impl;

/**
 * @author P.era-1
 *
 */
//abstract no deja crear un objeto de esta clase
public abstract class Persona {
	protected String nombre;
	protected String dni;
	protected String apellido;
	protected int id;
	
	public abstract String soliciarInformacion();
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public String getNombre() {
		return nombre.toUpperCase();
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	

}
