package es.prada.cazador;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Collection;

public abstract class Animal {

	private String raza;
	private String sexo;
	private Instant fechaNacimiento;
	private String tipoAnimal;
	private String valoracion;
	private Boolean operativo;
	private Collection<String> observaciones;
	private NivelAdiestramiento nivelAdiestramiento;

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public Instant getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Instant fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getTipoAnimal() {
		return tipoAnimal;
	}

	public void setTipoAnimal(String tipoAnimal) {
		this.tipoAnimal = tipoAnimal;
	}

	public String getValoracion() {
		return valoracion;
	}

	public void setValoracion(String valoracion) {
		this.valoracion = valoracion;
	}

	public Boolean getOperativo() {
		return operativo;
	}

	public void setOperativo(Boolean operativo) {
		this.operativo = operativo;
	}

	public Collection<String> getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(Collection<String> observaciones) {
		this.observaciones = observaciones;
	}

	public NivelAdiestramiento getNivelAdiestramiento() {
		return nivelAdiestramiento;
	}

	public void setNivelAdiestramiento(NivelAdiestramiento nivelAdiestramiento) {
		this.nivelAdiestramiento = nivelAdiestramiento;
	}

	public Animal() {
		super();
		this.observaciones = new ArrayList<String>();
	}

	public Animal(String raza, String sexo, Instant fechaNacimiento, String tipoAnimal, String valoracion,
			Boolean operativo, NivelAdiestramiento nivelAdiestramiento) {
		super();
		this.raza = raza;
		this.sexo = sexo;
		this.fechaNacimiento = fechaNacimiento;
		this.tipoAnimal = tipoAnimal;
		this.valoracion = valoracion;
		this.operativo = operativo;
		this.nivelAdiestramiento = nivelAdiestramiento;
	}

	@Override
	public String toString() {
		return "Raza: " + getRaza() + ", Sexo: " + getSexo() + ", Fecha Nacimiento: " + getFechaNacimiento()
				+ ", Tipo Animal: " + getTipoAnimal() + "\n Valoracion: " + getValoracion() + ", Operatividad: "
				+ getOperativo() + ", Nivel Adiestramiento: " + getNivelAdiestramiento() + "\n Observaciones: "
				+ getObservaciones();
	}

	public void addObservaciones(String observacion) {
		getObservaciones().add(observacion);
	}

	public abstract void valorarAnimal(String nuevaValoracion);

}
