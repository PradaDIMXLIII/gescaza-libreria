package es.prada.eventos;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Collection;

import es.prada.cazador.Persona;


public abstract class Evento {

	private Instant fechaEvento;
	private String lugar;
	private String ciudad;
	private String horaEvento;
	private es.prada.cazador.Persona personaInvitada;
	private Collection<String> comentarios;
	private TipoEvento tipoEvento;

	public TipoEvento getTipoEvento() {
		return tipoEvento;
	}

	public void setTipoEvento(TipoEvento tipoEvento) {
		this.tipoEvento = tipoEvento;
	}

	public Instant getFechaEvento() {
		return fechaEvento;
	}

	public void setFechaEvento(Instant fechaEvento) {
		this.fechaEvento = fechaEvento;
	}

	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getHoraEvento() {
		return horaEvento;
	}

	public void setHoraEvento(String horaEvento) {
		this.horaEvento = horaEvento;
	}

	public Persona getPersonaInvitada() {
		return personaInvitada;
	}

	public void setPersonaInvitada(Persona personaInvitada) {
		this.personaInvitada = personaInvitada;
	}

	public Collection<String> getComentarios() {
		return comentarios;
	}

	public Evento() {
		super();
		this.comentarios = new ArrayList<String>();
	}

	public Evento(Instant fechaEvento, String lugar, String ciudad, String horaEvento, Persona personaInvitada,
			TipoEvento tipoEvento) {
		super();
		this.fechaEvento = fechaEvento;
		this.lugar = lugar;
		this.ciudad = ciudad;
		this.horaEvento = horaEvento;
		this.personaInvitada = personaInvitada;
		this.tipoEvento = tipoEvento;
	}

	@Override
	public String toString() {
		return "Evento: " + getTipoEvento() + getFechaEvento() + getLugar() + getCiudad() + getHoraEvento()
				+ "\n PersonaInvitada: " + getPersonaInvitada();
	}

	public abstract boolean addComentarios(String comentario);

}
