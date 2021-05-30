package es.prada.eventos;

public class Punto {

	private String coordLatitud;
	private String coordLongitud;

	public String getCoordLatitud() {
		return coordLatitud;
	}

	public void setCoordLatitud(String coordLatitud) {
		this.coordLatitud = coordLatitud;
	}

	public String getCoordLongitud() {
		return coordLongitud;
	}

	public void setCoordLongitud(String coordLongitud) {
		this.coordLongitud = coordLongitud;
	}

	public Punto() {
		super();
	}

	public Punto(String coordLatitud, String coordLongitud) {
		super();
		this.coordLatitud = coordLatitud;
		this.coordLongitud = coordLongitud;
	}

	@Override
	public String toString() {
		return "Punto: " + ", CoordLatitud: " + getCoordLatitud() + ", CoordLongitud: " + getCoordLongitud();
	}

}
