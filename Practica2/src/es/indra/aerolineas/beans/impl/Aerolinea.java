/**
 * 
 */
package es.indra.aerolineas.beans.impl;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import es.indra.aerolineas.beans.IAerolinea;
import es.indra.aerolineas.sevices.*;

/**
 * @author josejarizav
 *
 *
 */
public class Aerolinea implements IAerolinea {

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

	// public Vuelo[] consultarVuelos(String origen) {
	// return this.vuelos;
	// }
	// public Vuelo[] consultarVuelos(String origen, String destino) {
	// return this.vuelos;
	// }

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * es.indra.aerolineas.beans.impl.IAerolinea#consultarVuelos(java.lang.String)
	 */
	@Override
	public void consultarVuelos(String origen) {
		System.out.println("metodo de 1 parametro:".concat(origen));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * es.indra.aerolineas.beans.impl.IAerolinea#consultarVuelos(java.lang.String,
	 * java.lang.String)
	 */
//	@Override
//	public void consultarVuelos(String origen, String destino) {
//		System.out.println("metodo de 2 parametro:%s y %s");
//
//	}
	//prueba----------------------------------------------
	public void consultarVuelos(String origen, String destino) {
	
		ReadJFile r = new ReadJFile();
		List<String> lista = r.retornarVuelos();
		

	}
	//prueba-----------------------------------------------------
	/*
	 * (non-Javadoc)
	 * 
	 * @see es.indra.aerolineas.beans.impl.IAerolinea#anularVuelos(java.lang.String)
	 */
	@Override
	public void anularVuelos(String... vuelos) {
		System.out.println("numero de vuelos a anular:" + vuelos.length);

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public Vuelo[] getVuelos() {
		return vuelos;
	}

	public void setVuelos(Vuelo[] vuelos) {
		this.vuelos = vuelos;
	}

}
