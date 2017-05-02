package lectura_archivo;

import java.io.IOException;
import java.util.HashMap;

import lectura_archivo.leer;

public class inicio {

	public static void main(String[] args) {
	
	@SuppressWarnings("unused")
	leer Archivo = new leer();
	HashMap<Integer,String> resultado = null;
	try {
		resultado = leer.leerArchivo("prueba.txt");
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		System.out.println("No se ha encontrado ningun archivo.");
	}
		
	
	if(resultado == null)
	{
		//Hacer algo? que, no se me ocurre.
	}
	else
	{
		System.out.println(resultado);
	}	
	
	}

}
