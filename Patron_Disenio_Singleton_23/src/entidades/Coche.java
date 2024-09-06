package entidades;

public final class Coche {
	
	//Vamos a imaginar que sólo quisiéramos un objeto de la clase coche
	
	private static Coche instancia;
	private String modelo;
	private String matricula;
	
	private Coche(String v_modelo,String v_matricula) {
		
		this.modelo=v_modelo;
		this.matricula=v_matricula;
	}
	
	public static Coche getInstance() { //Crucial que este método sea estático para que sólo pueda ser llamado
		//Desde Coche y no creando instancias de coche
		
		if(instancia == null) {
			instancia = new Coche("KIA STONIC", "7548LIV"); //Ejemplo absurdo pero para que se vea
		}
		
		return instancia;
		
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	
	
	

}
