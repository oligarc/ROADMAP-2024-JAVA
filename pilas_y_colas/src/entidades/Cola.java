package entidades;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Cola {
	
	private Queue listaDocumentos;
	Scanner sc;
	
	
	public Cola() {
		
		//Queue no se puede instanciar directax en Java porque es una interfaz, se utiliza el LinkedList
		listaDocumentos = new LinkedList<String>();
		sc = new Scanner(System.in);
		
	}
	
	public void verMenu() {
		
		System.out.println("Introduce documentos a imprimir.");
		System.out.println("La palabra 'imprimir' imprimirá el contenido.");
		System.out.println("'Salir' para terminar la ejecución.");
	}
	
	public void opciones() {
		
		verMenu();
		String opcion = sc.nextLine().toLowerCase();
		
		switch (opcion) {
		case "imprimir":
			imprimirDocumento();
			break;
			
		case "salir":
			salirDelPrograma();
			break;
			
		default:
			aniadirDocumentos(opcion);
			break;
		}
	}
	
	public void aniadirDocumentos(String opcion) {
		
		listaDocumentos.add(opcion);
		System.out.println("Documento " + opcion + " añadido con éxito.");
		opciones();
	}
	
	public void imprimirDocumento() {
		
		if(listaDocumentos.isEmpty()) {
			System.out.println("No hay documentos a imprimir.");
		}else {
			System.out.println("Imprimiendo " +listaDocumentos.poll());
		}
		
		opciones();
	}
	
	public void salirDelPrograma() {
		System.out.println("Saliendo del programa...");
		System.exit(1);
	}

}
