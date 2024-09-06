package entidades;

public final class SesionUsuario {
	
	private static SesionUsuario instancia;
	private int id;
	private String username;
	private String nombre;
	private String mail;
	
	private SesionUsuario(int v_id,String v_username,String v_nombre,String v_mail) {
		
		this.id=v_id;
		this.username=v_username;
		this.nombre=v_nombre;
		this.mail=v_mail;

	}
	
	public static SesionUsuario getInstance(int id,String username,String nombre,String mail) {
		
		if(instancia==null) {
			instancia = new SesionUsuario(id, username, nombre, mail);
		}
		
		return instancia;
	}
	
	public void borrarDatosSesion() {
		
		instancia = null; //Con esto lo que hemos hecho es que la instancia sea eliminada y ya no apunte 
		//por lo que la próxima vez que llamemos a getInstance no tendremos una instanciación definida
		
		//el problema que tenemos aquí es que se siguen almacenando los valores de nuestro anterior usuario
		//hasta que el recolector de basura lo elimine, que no es inmediato. Si lo queremos hacer inmediato
		//lo podemos hacer manualmente
		
		this.id=0;
		this.username=null;
		this.nombre=null;
		this.mail=null;
		
	}
	
	public String recuperDatosUsuario() {
		return "SesionUsuario [id=" + id + ", username=" + username + ", nombre=" + nombre + ", mail=" + mail + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	
	
	
}
