package es.prada.cazador;

import java.time.Instant;

public class Seguro {

	private Poliza poliza;
	private Persona tomador;

	public Poliza getPoliza() {
		return poliza;
	}

	public void setPoliza(Poliza poliza) {
		this.poliza = poliza;
	}

	public Persona getTomador() {
		return tomador;
	}

	public void setTomador(Persona tomador) {
		this.tomador = tomador;
	}

	public Seguro() {
		super();
	}

	public Seguro(Poliza poliza, Persona tomador) {
		super();
		this.poliza = poliza;
		this.tomador = tomador;
	}

	@Override
	public String toString() {
		return "Seguro [Poliza: " + getPoliza() + ", Tomador: " + getTomador() + "]";
	}

	public boolean isCaducado() {
		Instant ahora = Instant.now();
		return ahora.isAfter(this.getPoliza().getFechaCaducidad());
	}

}
