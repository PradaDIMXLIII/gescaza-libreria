package es.prada.cazador;

import java.time.Instant;

public class Poliza {

	private String compania;
	private String descripcion;
	private Instant fechaCaducidad;
	private Instant fechaInicio;
	private String cobertura;

	public String getCompania() {
		return compania;
	}

	public void setCompania(String compania) {
		this.compania = compania;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Instant getFechaCaducidad() {
		return fechaCaducidad;
	}

	public void setFechaCaducidad(Instant fechaCaducidad) {
		this.fechaCaducidad = fechaCaducidad;
	}

	public Instant getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(Instant fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public String getCobertura() {
		return cobertura;
	}

	public void setCobertura(String cobertura) {
		this.cobertura = cobertura;
	}

	public Poliza() {
		super();
	}

	public Poliza(String compania, String descripcion, Instant fechaCaducidad, Instant fechaInicio, String cobertura) {
		super();
		this.compania = compania;
		this.descripcion = descripcion;
		this.fechaCaducidad = fechaCaducidad;
		this.fechaInicio = fechaInicio;
		this.cobertura = cobertura;
	}

	@Override
	public String toString() {
		return "Poliza " + getCompania() + " descripcion: " + getDescripcion() + ", Fecha Inicio: " + getFechaInicio()
				+ ", Fecha Caducidad: " + getFechaCaducidad() + ", Cobertura: " + getCobertura();
	}

	public void renovarPoliza(String cobertura, Instant fechainicio, Instant fechaCaducidad) {
		this.setCobertura(cobertura);
		this.setFechaInicio(fechainicio);
		this.setFechaCaducidad(fechaCaducidad);
	}

}
