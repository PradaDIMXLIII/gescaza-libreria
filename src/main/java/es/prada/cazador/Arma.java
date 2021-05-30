package es.prada.cazador;

public class Arma {

	private String guia;
	private String nombre;
	private String descripcion;
	private String calibre;

	public String getGuia() {
		return guia;
	}

	public void setGuia(String guia) {
		this.guia = guia;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getCalibre() {
		return calibre;
	}

	public void setCalibre(String calibre) {
		this.calibre = calibre;
	}

	public Arma() {

	}

	public Arma(String guia, String nombre, String descripcion, String calibre) {
		super();
		this.guia = guia;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.calibre = calibre;
	}

	@Override
	public String toString() {
		return "Arma: " + getGuia() + " " + getNombre() + ", Descripcion: " + getDescripcion() + ", Calibre: "
				+ getCalibre();
	}

}
