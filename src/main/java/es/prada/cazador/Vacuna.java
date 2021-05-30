package es.prada.cazador;

import java.time.Instant;

public class Vacuna {

	private String nombre;
	private Instant fechaRenovacion;
	private Instant fechaPuesta;
	private boolean renovada = false;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Instant getFechaRenovacion() {
		return fechaRenovacion;
	}

	public void setFechaRenovacion(Instant fechaRenovacion) {
		this.fechaRenovacion = fechaRenovacion;
	}

	public Instant getFechaPuesta() {
		return fechaPuesta;
	}

	public void setFechaPuesta(Instant fechaPuesta) {
		this.fechaPuesta = fechaPuesta;
	}

	public boolean isRenovada() {
		return renovada;
	}

	public void setRenovada(boolean renovada) {
		this.renovada = renovada;
	}

	public Vacuna() {
		super();
	}

	public Vacuna(String nombre, Instant fechaRenovacion, Instant fechaPuesta) {
		super();
		this.nombre = nombre;
		this.fechaRenovacion = fechaRenovacion;
		this.fechaPuesta = fechaPuesta;
	}

	@Override
	public String toString() {
		return "Vacuna: " + getNombre() + ", Fecha Renovacion: " + getFechaRenovacion() + ", Fecha Puesta: "
				+ getFechaPuesta() + ", renovada: " + isRenovada();
	}

}
