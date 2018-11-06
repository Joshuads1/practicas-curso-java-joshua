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

	public void retornarVuelos() {
		Path path = Paths.get("/repos/CursoJava/vuelos.txt");
		try {

			List<String> contenido = Files.readAllLines(path);
			System.out.println(contenido);;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		ReadJFile r = new ReadJFile();
		r.retornarVuelos();
	}
}