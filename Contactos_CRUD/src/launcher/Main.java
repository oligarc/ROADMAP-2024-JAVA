package launcher;
import java.util.ArrayList;
import java.util.List;

import entidades.*;

public class Main {

	public static void main(String[] args) {
		
		Contacto contacto1 = new Contacto("Oliver", 635259849);
		Contacto contacto2 = new Contacto("Paloma", 698471245);
		List <Contacto> listaContactos = new ArrayList<Contacto>();
		
		//Funciones.aniadirContacto(contacto1);
		//Funciones.aniadirContacto(contacto2);
		//Funciones.borrarContacto(contacto2);
		//Funciones.actualizarContacto(contacto1, 632147841);
		//Funciones.consultarContacto("pepe");
		
		//Funciones.verMenu();
		Funciones.pedirOpcion();
		
		//listaContactos = Funciones.listadoContactos();
		//System.out.println(listaContactos);
		
		
		

	}

}
