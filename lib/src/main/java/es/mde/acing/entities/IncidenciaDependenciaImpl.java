package es.mde.acing.entities;

import java.util.List;

public class IncidenciaDependenciaImpl extends IncidenciaImpl implements IncidenciaDependencia {
	// Atributos Hijos
	private Cambios cambioSolicitado;
	private double metrosCuadrados;

	// Discriminador
	public static enum Cambios {
		Alta, Baja, ActualizacionSuperficie
	}

	@Override
	public Cambios getCambioSolicitado() {
		return cambioSolicitado;
	}

	public void setCambioSolicitado(Cambios cambioSolicitado) {
		this.cambioSolicitado = cambioSolicitado;
	}

	@Override
	public double getMetrosCuadrados() {
		return metrosCuadrados;
	}

	public void setMetrosCuadrados(double metrosCuadrados) {
		this.metrosCuadrados = metrosCuadrados;
	}

}
