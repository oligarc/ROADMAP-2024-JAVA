package entidades;

import java.util.Scanner;
import java.util.Stack;

public class Pila {
	
	//Para utilizar el manejo de la clase Stack en Java no haré el ejercicio como me gustaría
	//Ya que eso sería utilizar un array o una lista.
	
	private Stack<String> listaWebs;
	private Scanner sc;
	
	public Pila() {
		
		listaWebs = new Stack<String>();
		sc = new Scanner(System.in);
		
	}
	
	public void mostrarMenu() {
		
		System.out.println("Escribe adelante para visitar el último sitio web navegado.");
		System.out.println("Escribe atrás para regresar al anterior.");
		System.out.println("Escribe salir para terminar el programa.");
		System.out.println("Cualquier otra entrada será tomada como una nueva página web.");
	}
	
	public void pedirOpcion() {
		
		mostrarMenu();
		
		String opcion = sc.nextLine().toLowerCase();

		switch (opcion) {

		case "adelante":
			opcionAdelante();
			break;

		case "atras":
			
			opcionAtras();
			break;

		case "salir":
			
			opcionSalir();
			break;

		default:
			
			opcionAniadirWeb(opcion);
			break;
		}

	}
	
	public void opcionAdelante() {
		
		if(listaWebs.isEmpty()) {
			System.out.println("No hay sitios webs a los que regresar.");
		}else {
			System.out.println("Navegando a " +listaWebs.peek());
		}
		
		pedirOpcion();
		
	}
	
	public void opcionAtras() {
		
		if(listaWebs.isEmpty()) {
			System.out.println("No hay más sitios webs.");
		}else {
			System.out.println("Regresando a " +listaWebs.pop());
		}
		
		pedirOpcion();
	}
	
	public void opcionSalir() {
		
		System.out.println("Saliendo del programa...");
		System.exit(1);
	}
	
	public void opcionAniadirWeb(String opcion) {
		
		listaWebs.add(opcion);
		System.out.println(opcion + " añadido con éxito.");
		pedirOpcion();
	}
		
	}

