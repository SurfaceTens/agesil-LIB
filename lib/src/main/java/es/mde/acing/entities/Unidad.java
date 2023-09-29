package es.mde.acing.entities;

import java.util.List;

public interface Unidad {

	String getNombre();

	String getZona();

	String getComandancia();

	List<Usuario> getUsuarios();

}