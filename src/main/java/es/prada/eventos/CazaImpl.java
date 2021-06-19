package es.prada.eventos;

import java.time.Instant;
import java.util.Collection;
import java.util.Map;

import es.prada.cazador.Animal;
import es.prada.cazador.Persona;


public class CazaImpl extends Evento implements Caza {

	private TipoCaza tipoCaza;
	private String precinto;
	private String trofeo;
	private Map<String, ZonaCaza> zonasMarcadas;
	private Collection<Animal> animalesCaza;

	public TipoCaza getTipoCaza() {
		return tipoCaza;
	}

	public void setTipoCaza(TipoCaza tipoCaza) {
		this.tipoCaza = tipoCaza;
	}

	public String getPrecinto() {
		return precinto;
	}

	public void setPrecinto(String precinto) {
		this.precinto = precinto;
	}

	public String getTrofeo() {
		return trofeo;
	}

	public void setTrofeo(String trofeo) {
		this.trofeo = trofeo;
	}

	public Map<String, ZonaCaza> getZonasMarcadas() {
		return zonasMarcadas;
	}

	public void setZonasMarcadas(Map<String, ZonaCaza> zonasMarcadas) {
		this.zonasMarcadas = zonasMarcadas;
	}

	public Collection<Animal> getAnimalesCaza() {
		return animalesCaza;
	}

	public void setAnimalesCaza(Collection<Animal> animalesCaza) {
		this.animalesCaza = animalesCaza;
	}

	public CazaImpl() {
		super();
	}

	public CazaImpl(TipoCaza tipoCaza, String precinto, Instant fechaEvento, String lugar, String ciudad, String horaEvento,
			Persona personaInvitada, TipoEvento tipoEvento) {
		super(fechaEvento, lugar, ciudad, horaEvento, personaInvitada, tipoEvento);
		this.tipoCaza = tipoCaza;
		this.precinto = precinto;
	}

	@Override
	public String toString() {
		return super.toString() + "\n" + getTipoCaza() + ", Precinto: " + getPrecinto() + ", Trofeo: " + getTrofeo()
				+ ", ZonasMarcadas: " + getZonasMarcadas() + ", AnimalesCaza: " + getAnimalesCaza();
	}

	@Override
	public void addAnimalesCaza(Animal animal) {
		this.getAnimalesCaza().add(animal);
	}

	@Override
	public void addZonaMarcada(String id, ZonaCaza zona) {
		this.getZonasMarcadas().put(id, zona);
	}

	@Override
	public boolean addComentarios(String comentario) {
		return this.getComentarios().add(comentario);
	}

}
