/**
 * 
 */
package es.indra.aerolineas.beans;

/**
 * @author josejarizav
 *
 *
 */
public class Aerolinea {
	
	private int id;
	private String nombre;
	private Vuelo[] vuelos = new Vuelo[10];
	

	
	public Aerolinea() {	
	}
	
	

	/**
	 * @param id
	 * @param nombre
	 * @param vuelos
	 */
	public Aerolinea(int id, String nombre, Vuelo[] vuelos) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.vuelos = vuelos;
	}

	//public Vuelo[] consultarVuelos(String origen) {
	//	return this.vuelos;
	//}
	//public Vuelo[] consultarVuelos(String origen, String destino) {
		//return this.vuelos;
	//}
	
	
	public void consultarVuelos(String origen) {
	System.out.println("metodo de 1 parametro:".concat(origen));
	}
	public void consultarVuelos(String origen, String destino) {
		System.out.println("metodo de 2 parametro:%s y %s");
	
	}
	public void anularVuelos(String... vuelos) {
		System.out.println("numero de vuelos a anular:" + vuelos.length);
		
	}
	
			
			
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Vuelo[] getVuelos() {
		return vuelos;
	}

	public void setVuelos(Vuelo[] vuelos) {
		this.vuelos = vuelos;
	}

	
	
	

}
