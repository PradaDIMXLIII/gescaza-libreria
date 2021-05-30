package es.prada.eventos;

import java.util.ArrayList;
import java.util.Collection;

public class ZonaCaza {

	private String localidad;
	private String nombre;
	private String provincia;
	private Collection<String> observaciones;
	private Collection<Punto> puntosImportantes;
	private Collection<Punto> itinerarioCaza;
	private Collection<Punto> coordLimitesZona;

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public Collection<String> getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(Collection<String> observaciones) {
		this.observaciones = observaciones;
	}

	public Collection<Punto> getPuntosImportantes() {
		return puntosImportantes;
	}

	public void setPuntosImportantes(Collection<Punto> puntosImportantes) {
		this.puntosImportantes = puntosImportantes;
	}

	public Collection<Punto> getItinerarioCaza() {
		return itinerarioCaza;
	}

	public void setItinerarioCaza(Collection<Punto> itinerarioCaza) {
		this.itinerarioCaza = itinerarioCaza;
	}

	public Collection<Punto> getCoordLimitesZona() {
		return coordLimitesZona;
	}

	public void setCoordLimitesZona(Collection<Punto> coordLimitesZona) {
		this.coordLimitesZona = coordLimitesZona;
	}

	public ZonaCaza() {
		super();
		this.coordLimitesZona = new ArrayList<Punto>();
		this.itinerarioCaza = new ArrayList<Punto>();
		this.puntosImportantes = new ArrayList<Punto>();
		this.observaciones = new ArrayList<String>();
	}

	public ZonaCaza(String nombre, String localidad, String provincia) {
		super();
		this.nombre = nombre;
		this.localidad = localidad;
		this.provincia = provincia;
	}

	@Override
	public String toString() {
		return "ZonaCaza: " + getNombre() + " " + getProvincia() + ", Puntos Importantes: " + getPuntosImportantes()
				+ ", Itinerario Caza: " + getItinerarioCaza() + ", CoordLimitesZona: " + getCoordLimitesZona()
				+ ", Observaciones: " + getObservaciones();
	}

	public void addComentarios(String comentario) {
		this.getObservaciones().add(comentario);
	}

	public void addPuntoIntinerario(Punto punto) {
		this.getItinerarioCaza().add(punto);
	}

	public void addPuntoImportante(Punto punto) {
		this.getPuntosImportantes().add(punto);
	}

	public void addPuntoCoordLimites(Punto punto) {
		this.getCoordLimitesZona().add(punto);
	}

}
