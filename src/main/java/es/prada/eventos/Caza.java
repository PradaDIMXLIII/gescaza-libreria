package es.prada.eventos;

import es.prada.cazador.Animal;

public interface Caza {

	void addAnimalesCaza(Animal animal);

	void addZonaMarcada(String id, ZonaCaza zona);

}