package es.prada.cazador;

import java.time.Instant;

public class Vehiculo {

	private Instant fechaItv;
	private String matricula;
	private Seguro seguro;
	private String marca;
	private String modelo;
	private boolean operativo;

	public Instant getFechaItv() {
		return fechaItv;
	}

	public void setFechaItv(Instant fechaItv) {
		this.fechaItv = fechaItv;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public Seguro getSeguro() {
		return seguro;
	}

	public void setSeguro(Seguro seguro) {
		this.seguro = seguro;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public boolean isOperativo() {
		return operativo;
	}

	public void setOperativo(boolean operativo) {
		this.operativo = operativo;
	}

	public Vehiculo() {
		super();
	}

	public Vehiculo(Instant fechaItv, String matricula, Seguro seguro, String marca, String modelo, boolean operativo) {
		super();
		this.fechaItv = fechaItv;
		this.matricula = matricula;
		this.seguro = seguro;
		this.marca = marca;
		this.modelo = modelo;
		this.operativo = operativo;
	}

	@Override
	public String toString() {
		return "Vehiculo: " + getMarca() + " " + getModelo() + getMatricula() + " ITV: " + getFechaItv() + "Seguro: "
				+ getSeguro() + ", Operativo: " + isOperativo();
	}

}
