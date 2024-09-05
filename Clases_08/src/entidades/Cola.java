package entidades;

import java.util.LinkedList;
import java.util.Queue;

public class Cola {
	
	private Queue<String> listaElementos;
	private String modelo;
	private boolean aColor;
	private int numeroFolios;
	private int capacidadMaxima;
	
	public Cola(String v_modelo,boolean v_aColor,int v_numeroFolios,int v_capacidadMaxima) {
		
		listaElementos = new LinkedList<String>();
		this.modelo=v_modelo;
		this.aColor=v_aColor;
		this.numeroFolios=v_numeroFolios;
		this.capacidadMaxima=v_capacidadMaxima;
		
	}
	
	public void introducirElemento(String elemento) {
		listaElementos.add(elemento);
		System.out.println(elemento + " añadido con éxito.");
	}
	
	public void imprimirElemento() {
		
		if(listaElementos.isEmpty()) {
			System.out.println("No hay documentos para imprimir.");
		}else {
			System.out.println("Imprimiendo " +listaElementos.remove() + " ...");
			this.numeroFolios-=1;
			System.out.println(numeroFolios);
		}
		
	}
	
	public void recargarImpresora(int numeroFoliosRecarga) {
		
		final int espacioDisponible = this.capacidadMaxima - this.numeroFolios;
		int foliosSobrantes = 0;
		
		
		if(numeroFoliosRecarga>=espacioDisponible) {
			this.numeroFolios=this.capacidadMaxima;
			foliosSobrantes = numeroFoliosRecarga-espacioDisponible;
			System.out.println("Sobran " +foliosSobrantes + " folios.");
			
		}else {
			this.numeroFolios+=numeroFoliosRecarga;
			System.out.println("La impresora cuenta ahora con " +getNumeroFolios() + " folios.");
		}
		
	}
	
	public void verTodaLaCola() {
		
		if(!listaElementos.isEmpty()) {
			for (String elemento : listaElementos) {
				System.out.println(elemento);
			}
		}else {
			System.out.println("No hay documentos.");
		}
		
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public boolean isaColor() {
		return aColor;
	}

	public void setaColor(boolean aColor) {
		this.aColor = aColor;
	}

	public int getNumeroFolios() {
		return numeroFolios;
	}

	public void setNumeroFolios(int numeroFolios) {
		this.numeroFolios = numeroFolios;
	}

	public int getCapacidadMaxima() {
		return capacidadMaxima;
	}

	public void setCapacidadMaxima(int capacidadMaxima) {
		this.capacidadMaxima = capacidadMaxima;
	}
	
	
	
	

}
