package es.prada.eventos;

import java.util.ArrayList;
import java.util.List;

public class Agenda {

	private String anyo;
	private String nombre;
	private List<Evento> eventos;

	public String getAnyo() {
		return anyo;
	}

	public void setAnyo(String anyo) {
		this.anyo = anyo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Evento> getEventos() {
		return eventos;
	}

	public void setEventos(List<Evento> eventos) {
		this.eventos = eventos;
	}

	public Agenda() {
		super();
		this.eventos = new ArrayList<Evento>();
	}

	public Agenda(String anyo, String nombre) {
		super();
		this.anyo = anyo;
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Agenda " + getAnyo() + getNombre() + ", Eventos " + getEventos() + "]";
	}

	public void addEvento(Evento evento) {
		this.getEventos().add(evento);
	}

}
