package es.mde.acing.entities;

import java.util.List;

import es.mde.acing.entities.IncidenciaDeficienciaImpl.Incumplimientos;

public interface IncidenciaDeficiencia {

	List<Incumplimientos> getIncumplimientos();

	boolean isNotificadoSABAS();

}