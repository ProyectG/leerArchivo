package lectura_archivo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class leer {
	
	 @SuppressWarnings("null")
	public static HashMap<String,String> leerArchivo(String archivo) throws FileNotFoundException, IOException {
	        String cadena;
	        int contador=1;
	        HashMap<String,String> resultado = null;
	        try
	        {
	        FileReader f = new FileReader(archivo);
	        BufferedReader b = new BufferedReader(f);
	        while((cadena = b.readLine())!=null) {
	            System.out.println(cadena);
	        	resultado.put("Linea "+contador,cadena);
	        	contador++;
	        }
	        b.close();
	        }
	        catch(Exception e)
	        {
	        	e.printStackTrace();
	        }
	        return resultado;
	    }
	 

}
