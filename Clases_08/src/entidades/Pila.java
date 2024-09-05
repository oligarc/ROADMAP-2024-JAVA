package entidades;

import java.util.Stack;

public class Pila {
	
	private Stack<String> listaElementos;
	
	public Pila() {
		listaElementos = new Stack<String>();
	}
	
	public void introducirElementos(String elemento) {
		
		listaElementos.push(elemento);
		System.out.println(elemento + " añadido con éxito.");
		
	}
	
	public void eliminarElemento() {
		
		if(listaElementos.isEmpty()) {
			System.out.println("No hay elementos para eliminar");
		}else {
			System.out.println(listaElementos.pop() + " eliminado con éxito.");
		}
	}
	
	public void verElementos() {
		
		if(listaElementos.size()==0) {
			System.out.println("No existen elementos en el stack.");
		}else {
			
			for (String elemento : listaElementos) {
				System.out.println(elemento);
			}
		}
		
	}
	
	public Stack <String> listaElementos(){
		return listaElementos;
	}
	
	

}
