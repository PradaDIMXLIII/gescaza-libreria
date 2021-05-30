package es.prada.cazador;

import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Collection;

public class Cazador extends Persona {

	private int numSocio;
	private NucleoCinologico nucleoCinologico;
	private String cotoCaza;
	private String clubDeportivo;
	private Collection<TarjetaInvCaza> tarjetas;
	private Collection<Arma> armas;
	private String observaciones;

	public int getNumSocio() {
		return numSocio;
	}

	public void setNumSocio(int numSocio) {
		this.numSocio = numSocio;
	}

	public NucleoCinologico getNucleoCinologico() {
		return nucleoCinologico;
	}

	public void setNucleoCinologico(NucleoCinologico nucleoCinologico) {
		this.nucleoCinologico = nucleoCinologico;
	}

	public String getCotoCaza() {
		return cotoCaza;
	}

	public void setCotoCaza(String cotoCaza) {
		this.cotoCaza = cotoCaza;
	}

	public String getClubDeportivo() {
		return clubDeportivo;
	}

	public void setClubDeportivo(String clubDeportivo) {
		this.clubDeportivo = clubDeportivo;
	}

	public Collection<TarjetaInvCaza> getTarjetas() {
		return tarjetas;
	}

	public void setTarjetas(Collection<TarjetaInvCaza> tarjetas) {
		this.tarjetas = tarjetas;
	}

	public Collection<Arma> getArmas() {
		return armas;
	}

	public void setArmas(Collection<Arma> armas) {
		this.armas = armas;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	public Cazador() {
		super();
		this.tarjetas = new ArrayList<TarjetaInvCaza>();
		this.armas = new ArrayList<Arma>();
	}

	public Cazador(String nombre, String apellidos, String dni, Instant fechaNacimiento, int numSocio,
			NucleoCinologico nucleoCinologico, String cotoCaza, String clubDeportivo) {
		super(nombre, apellidos, dni, fechaNacimiento);
		this.numSocio = numSocio;
		this.nucleoCinologico = nucleoCinologico;
		this.cotoCaza = cotoCaza;
		this.clubDeportivo = clubDeportivo;
	}

	@Override
	public String toString() {
		return super.toString() + "\nCazador " + ", NumSocio: " + getNumSocio() + ", getEdad()=" + getEdad()
				+ ", CotoCaza: " + getCotoCaza() + ", ClubDeportivo: " + getClubDeportivo() + ", Tarjetas: "
				+ getTarjetas() + ", Armas: " + getArmas();
	}

	public void addArma(Arma arma) {
		getArmas().add(arma);
	}

	public void adTarjetaInvCaza(TarjetaInvCaza tarjeta) {
		getTarjetas().add(tarjeta);
	}

	@Override
	public long getEdad() {
		return calcularEdad(this.getFechaNacimiento());
	}

	private long calcularEdad(Instant nacimiento) {
		Instant ahora = Instant.now();
		return ChronoUnit.YEARS.between(nacimiento, ahora);
	}

}
