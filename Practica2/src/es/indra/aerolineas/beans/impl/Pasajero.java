/**
 * 
 */
package es.indra.aerolineas.beans.impl;

/**
 * @author josejarizav
 *
 *
 */
public class Pasajero extends Persona {
	
	
	private Vuelo[] vuelos;

	public Vuelo[] getVuelos() {
		return vuelos;
	}

	public void setVuelos(Vuelo[] vuelos) {
		this.vuelos = vuelos;
	}

	@Override
	public String soliciarInformacion() {
		// TODO Auto-generated method stub
		return "";
	}
	
	

}
