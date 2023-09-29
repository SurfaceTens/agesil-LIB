package es.mde.acing.entities;

import java.util.List;

import es.mde.acing.entities.IncidenciaDependenciaImpl.Cambios;

public interface IncidenciaDependencia {

	List<Cambios> getCambios();

	double getMetrosCuadrados();

}