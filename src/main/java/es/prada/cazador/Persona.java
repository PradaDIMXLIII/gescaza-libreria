package es.prada.cazador;

import java.time.Instant;

public abstract class Persona {

	private String nombre;
	private String apellidos;
	private String dni;
	private Instant fechaNacimiento;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public Instant getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Instant fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public abstract long getEdad();

	public Persona() {
		super();
	}

	public Persona(String nombre, String apellidos, String dni, Instant fechaNacimiento) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.fechaNacimiento = fechaNacimiento;
	}

	@Override
	public String toString() {
		return getNombre() + " " + getApellidos() + " " + getDni() + "\nFecha Nacimiento: " + getFechaNacimiento();
	}

}
