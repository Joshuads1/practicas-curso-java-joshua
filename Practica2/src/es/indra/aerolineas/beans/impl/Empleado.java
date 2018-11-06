/**
 * 
 */
package es.indra.aerolineas.beans.impl;

/**
 * @author P.era-1
 *
 */
public class Empleado extends Persona {
	//indica sobreescritura
	@Override
	public String getNombre() {
		return nombre;
	}

	@Override
	public String soliciarInformacion() {
		// TODO Auto-generated method stub
		return "";
	}

}
