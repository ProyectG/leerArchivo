package lectura_archivo;

import java.io.IOException;
import lectura_archivo.leer;

public class inicio {

	public static void main(String[] args) {
	
	@SuppressWarnings("unused")
	leer Archivo = new leer();
	try {
		leer.leerArchivo("prueba.txt");
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
	}

}
