package es.mde.acing.entities;

import java.util.List;

public class IncidenciaDependenciaImpl extends IncidenciaImpl implements IncidenciaDependencia {
	// Atributos Hijos
	private List<Cambios> cambios;
	private double metrosCuadrados;

	// Discriminador
	public static enum Cambios {
		Alta, Baja, ActualizacionSuperficie
	}

	@Override
	public List<Cambios> getCambios() {
		return cambios;
	}

	public void setCambios(List<Cambios> cambios) {
		this.cambios = cambios;
	}

	@Override
	public double getMetrosCuadrados() {
		return metrosCuadrados;
	}

	public void setMetrosCuadrados(double metrosCuadrados) {
		this.metrosCuadrados = metrosCuadrados;
	}

}
