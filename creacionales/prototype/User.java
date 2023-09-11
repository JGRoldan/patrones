package prototype;

import java.util.Objects;

public class User implements Cloneable {
	private int edad;
	private String nombre;
	private String apellido;
	
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(apellido, other.apellido) && edad == other.edad && Objects.equals(nombre, other.nombre);
	}
	@Override
	public String toString() {
		return "Nombre: " + this.getNombre() +
				", "+"apellido: " + this.getApellido() + 
				", "+"edad: " + this.getEdad();
	}
	
	@Override
	protected User clone() {
		User cloneUser = new User();
		cloneUser.setApellido(this.getApellido());
		cloneUser.setNombre(this.getNombre());
		cloneUser.setEdad(this.getEdad());
		return cloneUser;
	}
}
