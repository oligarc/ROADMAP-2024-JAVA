package entidades;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entidades.Contacto;

public class Funciones {

	private static Scanner sc = new Scanner(System.in);
	private static List<Contacto> listaContactos = new ArrayList<Contacto>();

	public static void verMenu() {

		System.out.println("Elige una de las siguientes opciones.");
		System.out.println("1: Inserta un nuevo contacto.");
		System.out.println("2: Borra un contacto.");
		System.out.println("3: Busca un contacto.");
		System.out.println("4: Actualiza un contacto.");
		System.out.println("5: Mostrar todos los contactos.");
		System.out.println("6: Borrar toda la agenda.");
		System.out.println("7: Salir.");

	}

	public static void pedirOpcion() {

		verMenu();
		int opcion = sc.nextInt();

		if (opcion >= 1 && opcion <= 7) {

			switch (opcion) {

			case 1:
				
				aniadirContactoOpcion();
				break;

			case 2:
				borrarContactoOpcion();
				break;

			case 3:
				buscarContactoOpcion();
				break;

			case 4:
				actualizaContactoOpcion();
				break;

			case 5:
				mostrarAgendaCompleta();
				break;

			case 6:
				borrarAgendaCompleta();
				break;

			case 7:
				System.out.println("Saliendo del programa...");
				break;
			}

		} else {
			System.out.println("Ingrese un número entre 1 y 7.");
			pedirOpcion();
		}

	}

	public static void aniadirContactoOpcion() {
		
		sc.nextLine(); //Limpiamos el buffer por si queremos introducir el nombre con apellidos
		
		System.out.println("Introduce el nombre completo: ");
		String nombreContacto = sc.nextLine();
		
		System.out.println("Introduce su teléfono: ");
		int telefonoContacto = sc.nextInt();
		
		Contacto contacto = new Contacto(nombreContacto, telefonoContacto);
		listaContactos.add(contacto);
		System.out.println("Contacto añadido con éxito.");
		
		pedirOpcion();
	}
	
	public static void borrarContactoOpcion() {
		
		sc.nextLine();
		boolean contactoEncontrado=false;
		
		System.out.println("Introduce el nombre del contacto que deseas borrar: ");
		String nombreContacto = sc.nextLine();
		
		for (Contacto contacto : listaContactos) {
			
			if(contacto.getName().toLowerCase().equals(nombreContacto.toLowerCase())) {
				listaContactos.remove(contacto);
				contactoEncontrado=true;
				System.out.println("Contacto eliminado con éxito.");
				break;
			}
		}
		if(!contactoEncontrado) {
			System.out.println("Contacto no encontrado.");
		}
		pedirOpcion();
		
	}
	
	public static void buscarContactoOpcion() {
		
		sc.nextLine();
		System.out.println("Introduce el nombre del contacto a buscar: ");
		String nombreContacto = sc.nextLine();
		int numeroContacto=0;
		boolean encontrado=false;
		
		for (Contacto contacto : listaContactos) {
			
			if(contacto.getName().toLowerCase().equals(nombreContacto.toLowerCase())) {
				numeroContacto=contacto.getPhone();
				encontrado=true;
			}
		}
		
		if(encontrado) {
			System.out.println(nombreContacto +" , teléfono: " +numeroContacto);
		}else {
			System.out.println("Contacto no encontrado.");
		}
		
		pedirOpcion();
	}
	
	public static void actualizaContactoOpcion() {
		
		sc.nextLine();
		System.out.println("Introduzca el nombre del contacto que quiera actualizar: ");
		String nombreContacto = sc.nextLine();
		int nuevoTelefono=0;
		boolean encontrado = false;
		
		for (Contacto contacto : listaContactos) {
			
			if(contacto.getName().toLowerCase().equals(nombreContacto.toLowerCase())) {
				System.out.println("Introduce su nuevo número de teléfono: ");
				nuevoTelefono = sc.nextInt();
				contacto.setPhone(nuevoTelefono);
				encontrado=true;
			}
		}
		if(encontrado) {
			System.out.println("El nuevo número de teléfono de " +nombreContacto + " es el " +nuevoTelefono);
		}else {
			System.out.println("Contacto no encontrado.");
		}
		
		pedirOpcion();
	}
	
	public static void borrarAgendaCompleta() {
		
		System.out.println("Borrando agenda completa...");
		listaContactos.clear();
		pedirOpcion();
	}
	
	public static void mostrarAgendaCompleta() {
		
		for (Contacto contacto : listaContactos) {
			System.out.println(contacto.toString());
		}
		
		pedirOpcion();
	}

	public static void aniadirContacto(Contacto contacto) {
		listaContactos.add(contacto);
		System.out.println("Contacto añadido con éxito.");
	}

	public static void borrarContacto(Contacto contacto) {
		listaContactos.remove(contacto);
		System.out.println("Contacto eliminado con éxito.");
	}

	public static void actualizarContacto(Contacto contacto, int newPhone) {
		contacto.setPhone(newPhone);
		System.out.println("Contacto actualizado con éxito.");
	}

	public static void consultarContacto(String nombreContacto) {

		int numeroContacto = 0;
		boolean contactoEncontrado = false;
		for (Contacto contacto : listaContactos) {

			if (contacto.getName().toLowerCase().equals(nombreContacto.toLowerCase())) {
				numeroContacto = contacto.getPhone();
				contactoEncontrado = true;
			}
		}

		if (contactoEncontrado) {
			System.out.println("El contacto con nombre " + nombreContacto + " le pertenece el número de teléfono "
					+ numeroContacto);
		} else {
			System.out.println("Contacto no encontrado.");
		}

	}

	public static List<Contacto> listadoContactos() {
		return listaContactos;
	}

}
