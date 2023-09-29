package es.mde.acing.entities;

import java.util.List;

public interface Usuario {

	String getRol();

	String getNombre();

	String getClave();

	List<Incidencia> getIncidencias();

	Unidad getUnidad();

}