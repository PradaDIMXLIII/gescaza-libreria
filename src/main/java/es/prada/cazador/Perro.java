package es.prada.cazador;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Collection;

public class Perro extends Animal {

	private String chip;
	private Collection<Vacuna> vacunas;

	public String getChip() {
		return chip;
	}

	public void setChip(String chip) {
		this.chip = chip;
	}

	public Collection<Vacuna> getVacunas() {
		return vacunas;
	}

	public void setVacunas(Collection<Vacuna> vacunas) {
		this.vacunas = vacunas;
	}

	public Perro() {
		super();
		this.vacunas = new ArrayList<Vacuna>();
	}

	public Perro(String raza, String sexo, Instant fechaNacimiento, String tipoAnimal, String valoracion,
			Boolean operativo, NivelAdiestramiento nivelAdiestramiento, String idPerro, String chip) {
		super(raza, sexo, fechaNacimiento, tipoAnimal, valoracion, operativo, nivelAdiestramiento);
		this.chip = chip;
	}

	@Override
	public String toString() {
		return super.toString() + "Perro: " + ", Chip: " + getChip() + "\n Vacunas: " + getVacunas();
	}

	@Override
	public void valorarAnimal(String nuevaValoracion) {
		this.setValoracion(nuevaValoracion);

	}

	public void addVacuna(Vacuna vacuna) {
		getVacunas().add(vacuna);
	}

}
