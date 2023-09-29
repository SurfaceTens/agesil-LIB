package es.mde.acing.entities;

import es.mde.acing.entities.IncidenciaDependenciaImpl.Cambios;

public interface IncidenciaDependencia {

	Cambios getCambioSolicitado();

	double getMetrosCuadrados();

}