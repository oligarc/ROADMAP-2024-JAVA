package lanzador;
import entidades.*;

public class Lanzador {

	public static void main(String[] args) {
		
		/*Pila pila1 = new Pila();
		
		pila1.introducirElementos("mariconchis");
		pila1.introducirElementos("mariconchis2");
		pila1.introducirElementos("mariconchis3");
		pila1.verElementos();
		System.out.println("----------------------");
		pila1.eliminarElemento();
		pila1.verElementos();
		
		*/
		
		Cola impresora = new Cola("Katcher500", true, 200, 500);
		
		impresora.recargarImpresora(1000);
	}

}
