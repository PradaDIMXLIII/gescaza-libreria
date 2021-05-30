package es.prada.cazador;

import java.util.ArrayList;
import java.util.Collection;

public class NucleoCinologico {

	private String numRegistro;
	private String nombre;
	private Collection<Animal> animales;

	public String getNumRegistro() {
		return numRegistro;
	}

	public void setNumRegistro(String numRegistro) {
		this.numRegistro = numRegistro;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Collection<Animal> getAnimales() {
		return animales;
	}

	public void setAnimales(Collection<Animal> animales) {
		this.animales = animales;
	}

	public NucleoCinologico() {
		super();
		this.animales = new ArrayList<Animal>();
	}

	public NucleoCinologico(String numRegistro, String nombre, Collection<Animal> animales) {
		super();
		this.numRegistro = numRegistro;
		this.nombre = nombre;
		this.animales = animales;
	}

	@Override
	public String toString() {
		return "NumRegistro: " + getNumRegistro() + ", Nombre: "
				+ getNombre() + "\n" + getAnimales();
	}

	public void addAnimal(Animal animal) {
		getAnimales().add(animal);
	}

}
