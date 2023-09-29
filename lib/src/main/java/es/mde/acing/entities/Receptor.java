package es.mde.acing.entities;

import java.util.List;

public interface Receptor {

	String getNombre();

	String getCorreo();

	int getTelefono();

	List<Incidencia> getIncidencias();

}