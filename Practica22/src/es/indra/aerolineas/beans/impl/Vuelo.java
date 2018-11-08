/**
 * 
 */
package es.indra.aerolineas.beans.impl;

/**
 * @author josejarizav
 *
 *
 */
public class Vuelo {

	private String id;
	private String numeroVuelo;
	private String origen;
	private String destino;
	private int numeroPasajeros;
	private boolean disponible;
	private int fecha;
	

	public Vuelo() {
			}
	
	public Vuelo(String id) {
		this.id = id;		
	}

	public Vuelo(String id, String numeroVuelo, String origen, String destino, int numeroPasajeros, boolean disponible, int fecha) {
		super();
		this.id = id;
		this.numeroVuelo = numeroVuelo;
		this.origen = origen;
		this.destino = destino;
		this.numeroPasajeros = numeroPasajeros;
		this.disponible = disponible;
		this.fecha = fecha;
	}
	
	public Vuelo(String id, String numeroVuelo, int fecha) {
		this.id = id;
		this.numeroVuelo = numeroVuelo;
		this.fecha = fecha;
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the numeroVuelo
	 */
	public String getNumeroVuelo() {
		return numeroVuelo;
	}

	/**
	 * @param numeroVuelo the numeroVuelo to set
	 */
	public void setNumeroVuelo(String numeroVuelo) {
		this.numeroVuelo = numeroVuelo;
	}

	/**
	 * @return the origen
	 */
	public String getOrigen() {
		return origen;
	}

	/**
	 * @param origen the origen to set
	 */
	public void setOrigen(String origen) {
		this.origen = origen;
	}

	/**
	 * @return the destino
	 */
	public String getDestino() {
		return destino;
	}

	/**
	 * @param destino the destino to set
	 */
	public void setDestino(String destino) {
		this.destino = destino;
	}

	/**
	 * @return the numeroPasajeros
	 */
	public int getNumeroPasajeros() {
		return numeroPasajeros;
	}

	/**
	 * @param numeroPasajeros the numeroPasajeros to set
	 */
	public void setNumeroPasajeros(int numeroPasajeros) {
		this.numeroPasajeros = numeroPasajeros;
	}

	/**
	 * @return the disponible
	 */
	public boolean isDisponible() {
		return disponible;
	}

	/**
	 * @param disponible the disponible to set
	 */
	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}
	/**
	 * @return the fecha
	 */
	public int getFecha() {
		return fecha;
	}
	

	/**
	 * @param fecha the fecha to set
	 */
	public void setFecha(int fecha) {
		this.fecha = fecha;
	}

	@Override
	public String toString() {
		return "Vuelo [id=" + id + ", numeroVuelo=" + numeroVuelo + ", origen=" + origen + ", destino=" + destino
				+ ", numeroPasajeros=" + numeroPasajeros + ", disponible=" + disponible + "]";
	}

	
	
}
