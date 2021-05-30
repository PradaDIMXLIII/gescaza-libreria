package es.prada.eventos;

import java.time.Instant;

import es.prada.cazador.Persona;

public class OcioCultural extends Evento {

	private String nombre;
	private Persona acompanante;
	private String valoracion;
	private Boolean repetir;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Persona getAcompanante() {
		return acompanante;
	}

	public void setAcompanante(Persona acompanante) {
		this.acompanante = acompanante;
	}

	public String getValoracion() {
		return valoracion;
	}

	public void setValoracion(String valoracion) {
		this.valoracion = valoracion;
	}

	public Boolean getRepetir() {
		return repetir;
	}

	public void setRepetir(Boolean repetir) {
		this.repetir = repetir;
	}

	public OcioCultural() {
		super();
	}

	public OcioCultural(String nombre, Instant fechaEvento, String lugar, String ciudad, String horaEvento,
			Persona personaInvitada, TipoEvento tipoEvento) {
		super(fechaEvento, lugar, ciudad, horaEvento, personaInvitada, tipoEvento);
		this.nombre = nombre;
	}

	@Override
	public boolean addComentarios(String comentario) {
		return this.getComentarios().add(comentario);
	}

	@Override
	public String toString() {
		return super.toString() + "\nOcioCultural: " + getNombre() + ", Acompañante: " + getAcompanante()
				+ ", Valoracion: " + getValoracion() + ", Repetir: " + getRepetir();
	}

}
