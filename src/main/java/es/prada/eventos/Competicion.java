package es.prada.eventos;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Collection;

import es.prada.cazador.Persona;


public class Competicion extends Evento {

	private String nombre;
	private String inscripcion;
	private int puesto;
	private int ranking;
	private Collection<String> mejoras;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getInscripcion() {
		return inscripcion;
	}

	public void setInscripcion(String inscripcion) {
		this.inscripcion = inscripcion;
	}

	public int getPuesto() {
		return puesto;
	}

	public void setPuesto(int puesto) {
		this.puesto = puesto;
	}

	public int getRanking() {
		return ranking;
	}

	public void setRanking(int ranking) {
		this.ranking = ranking;
	}

	public Collection<String> getMejoras() {
		return mejoras;
	}

	public void setMejoras(Collection<String> mejoras) {
		this.mejoras = mejoras;
	}

	public Competicion() {
		super();
		this.mejoras = new ArrayList<String>();
	}

	public Competicion(String nombre, Instant fechaEvento, String lugar, String ciudad, String horaEvento,
			Persona personaInvitada, TipoEvento tipoEvento, String inscripcion) {
		super(fechaEvento, lugar, ciudad, horaEvento, personaInvitada, tipoEvento);
		this.inscripcion = inscripcion;
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return super.toString() + "\nCompeticion: " + getNombre() + ", Inscripcion: " + getInscripcion() + ", Puesto: "
				+ getPuesto() + ", Ranking: " + getRanking() + ", Mejoras: " + getMejoras();
	}

	public void addMejora(String mejora) {
		this.getMejoras().add(mejora);
	}

	@Override
	public boolean addComentarios(String comentario) {
		return this.getComentarios().add(comentario);
	}

}
