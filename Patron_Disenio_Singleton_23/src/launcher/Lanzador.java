package launcher;
import entidades.*;

public class Lanzador {

	public static void main(String[] args) {
		
		//Singleton se utiliza para asegurarse de que no se utiliza más de una instancia de una clase
		//Para la codificación de este patrón se hace que el constructor de la clase sea privado, así
		//nadie tiene acceso para poder crearlo y ganas el control sobre crear nuevas instancias
		
		//Para poder crearlo harás un método que comprobará si ya existe una instancia de la clase
		//de no ser así, crea uno nuevo antes de devolverlo
		
		//El resumen de singleton vendría siendo que se encapsula el proceso de creación de instancias de una
		//clase de forma global
		
		Coche coche1 = Coche.getInstance();
		
		System.out.println("Modelo del coche 1:  " +coche1.getModelo());
		System.out.println("Matrícula del coche 1:  " +coche1.getMatricula());
		
		Coche coche2 = Coche.getInstance();
		
		System.out.println("Modelo del coche 2:  " +coche2.getModelo());
		System.out.println("Matrícula del coche 2: " +coche2.getMatricula());

		System.out.println("_______________________________");
		
		if(coche1==coche2) {
			System.out.println("Ambos apuntan a la misma instancia. Singleton conseguido.");
		}else {
			System.out.println("Singleton fallido.");
		}
		
		System.out.println("_____________________");
		
		SesionUsuario usuario1 = SesionUsuario.getInstance(1, "elpepe", "juan", "elpepjua@gmail.com");
		System.out.println(usuario1.recuperDatosUsuario());
		
		SesionUsuario usuario2 = SesionUsuario.getInstance(3, "elpepito", "juanito", "elpepitojuanito@gmail.com");
		System.out.println(usuario2.recuperDatosUsuario());
		
		usuario1.borrarDatosSesion();
		System.out.println(usuario1.recuperDatosUsuario());
		
	}

}
