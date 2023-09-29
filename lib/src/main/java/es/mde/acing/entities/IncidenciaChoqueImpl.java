package es.mde.acing.entities;

import java.util.List;

public class IncidenciaChoqueImpl extends IncidenciaImpl implements IncidenciaChoque {
	// Atributos Hijos
	private List<Trabajos> trabajos;

	// Discriminador
	public static enum Trabajos {
		Desinfeccion, Desratizacion, Desinsectacion
	}

	@Override
	public List<Trabajos> getTrabajos() {
		return trabajos;
	}

	public void setTrabajos(List<Trabajos> trabajos) {
		this.trabajos = trabajos;
	}

}
