package entidades;

public class Contacto {
	
	private String name;
	private int phone;
	
	public Contacto(String v_name,int v_phone) {
		
		this.name=v_name;
		this.phone=v_phone;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}
	
	@Override
	public String toString() {
		return "Contacto [name=" + name + ", phone=" + phone + "]";
	}
	
}
