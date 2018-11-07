/**

 * 
 */
package es.indra.aerolineas.sevices;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import javax.swing.text.StyledEditorKit.ForegroundAction;

import es.indra.aerolineas.exceptions.ErrorLecturaDeVuelosException;

/**
 * @author P.era-1
 *
 */
public class ReadJFile {
	
	int a = 10;
 
	public List<String> retornarVuelos() throws ErrorLecturaDeVuelosException {
		
		List<String> contenido = new ArrayList<>();
		
		Path path = Paths.get("C:/Users/P.era-1/repositorios/CursoJava/practicas-curso-java-joshua/vuelos.txt");
		
		//List<String> contenido = null;
		
		try {
			

			contenido = Files.readAllLines(path);
			//System.out.println(contenido);
			//return contenido;
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			throw new ErrorLecturaDeVuelosException("fallo letendo el archivo",e);
			
		} finally {
		System.out.println("finalizada lectura de archivos");

	}
		return contenido;
	}
	
	public List<String> retornarVuelospropagandoError() {
		Path path = Paths.get("C:/Users/P.era-1/repositorios/CursoJava/practicas-curso-java-joshua/vuelos.txt");
		
		List<String> contenido = null;
		return contenido;
	}


}