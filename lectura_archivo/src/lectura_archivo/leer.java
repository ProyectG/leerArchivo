package lectura_archivo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class leer {
	
	 public static void leerArchivo(String archivo) throws FileNotFoundException, IOException {
	        String cadena;
	        FileReader f = new FileReader(archivo);
	        BufferedReader b = new BufferedReader(f);
	        while((cadena = b.readLine())!=null) {
	            System.out.println(cadena);
	        }
	        b.close();
	    }

}
