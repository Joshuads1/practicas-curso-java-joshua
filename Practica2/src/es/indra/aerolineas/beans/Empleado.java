/**
 * 
 */
package es.indra.aerolineas.beans;

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

}
