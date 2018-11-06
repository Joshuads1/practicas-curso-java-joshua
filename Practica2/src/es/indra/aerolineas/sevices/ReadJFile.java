/**

 * 
 */
package es.indra.aerolineas.sevices;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

/**
 * @author P.era-1
 *
 */
public class ReadJFile {
	
	int a = 10;

	public List<String> retornarVuelos() {
		Path path = Paths.get("/repos/CursoJava/vuelos.txt");
		
		List<String> contenido = null;
		
		try {

			contenido = Files.readAllLines(path);
			return contenido;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return contenido;

	}

	public static void main(String[] args) {
		ReadJFile r = new ReadJFile();
		r.retornarVuelos();
	}
}