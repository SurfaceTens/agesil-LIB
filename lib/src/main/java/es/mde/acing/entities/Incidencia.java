package es.mde.acing.entities;

import java.time.LocalDate;
import java.util.List;

import es.mde.acing.entities.IncidenciaImpl.TipoIncidencia;

public interface Incidencia {

	TipoIncidencia getTipo();

	String getEstado();

	String getDescripcion();

	LocalDate getFechaInicio();

	LocalDate getFechaFin();

	LocalDate getFechaComunicacion();

	List<Incidencia> getIncidencias();

	Usuario getUsuario();

	Receptor getReceptor();

}