package es.prada.cazador;

import java.time.Instant;

public class TarjetaInvCaza {

	private String nombre;
	private String cotoCaza;
	private Instant fechaVencimiento;
	private int numInvitaciones;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCotoCaza() {
		return cotoCaza;
	}

	public void setCotoCaza(String cotoCaza) {
		this.cotoCaza = cotoCaza;
	}

	public Instant getFechaVencimiento() {
		return fechaVencimiento;
	}

	public void setFechaVencimiento(Instant fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}

	public int getNumInvitaciones() {
		return numInvitaciones;
	}

	public void setNumInvitaciones(int numInvitaciones) {
		this.numInvitaciones = numInvitaciones;
	}

	public TarjetaInvCaza() {

	}

	@Override
	public String toString() {
		return "TarjetaInvCaza: " + getNombre() + ", Coto Caza: " + getCotoCaza() + ", Fecha Vencimiento: "
				+ getFechaVencimiento() + ", NumInvitaciones: " + getNumInvitaciones();
	}

	public boolean comprobarTarjeta() {
		return this.numInvitaciones > 0;
	}

	public void invitar() {
		if (this.numInvitaciones > 0) {
			this.numInvitaciones--;
		} else {
			this.numInvitaciones = 0;
		}
	}

}
