/**
 * 
 */
package es.indra.aerolineas.coleccionesmap;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

import es.indra.aerolineas.beans.impl.Vuelo;

/**
 * @author Joshua
 *
 */
public class MapaBillete {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		
		Map<Integer, Vuelo> mapabillete = new TreeMap<Integer, Vuelo>();
		File listaVuelos = new File("C:\\listaVuelos.txt");
		 try {
		      FileReader fr = new FileReader(listaVuelos);
		      BufferedReader br = new BufferedReader(fr);
		 
		      String linea;
		  	  String[] vueloCadena = null;
		      
		      while((linea = br.readLine()) != null) {
		        //System.out.println(linea);
		      for (int i = 0; i < listaVuelos.length(); i++) {
					if (br.readLine() != null) {
						vueloCadena = br.readLine().split(" ");
					}
					Vuelo v = new Vuelo();
					
					v.setOrigen(vueloCadena[0]);
					v.setDestino(vueloCadena[1]);
					v.setDisponible(Boolean.parseBoolean(vueloCadena[2]));
					v.setFecha(Integer.parseInt(vueloCadena[3]));
					v.setId(vueloCadena[4]);
					v.setNumeroPasajeros(Integer.parseInt(vueloCadena[5]));
					v.setNumeroVuelo(vueloCadena[6]);
					
					
					mapabillete.put(i, v);
					mapabillete.get(i).toString();
				}
		    
		      }
		      
		    } catch (FileNotFoundException e) {
		    	System.out.println("Fichero no encontrado");
		    	e.printStackTrace();
		    } catch (IOException e) {
		    	System.out.println("Error de lectura/escritura");
				e.printStackTrace();
			}
		
		
		Iterator it = mapabillete.keySet().iterator();
		
		System.out.println(mapabillete.get(0).toString());
		
		
		// TODO Auto-generated method stub

	}

}
