package es.mde.acing.entities;

import java.time.LocalDate;
import java.util.List;

public class IncidenciaImpl {

	// Atributos (sin ID)
	private String estado;
	private String descripcion;
	private LocalDate fechaInicio;
	private LocalDate fechaFin;
	private LocalDate fechaComunicacion;

	// Discriminador
	public static enum TipoIncidencia {
		DeficienciaServicio, LimpiezaChoque, CambiosDependencia
	}

	// Relaciones
//	private List<Incidencia> incidencias;
//	private Usuario usuario;
//	private Receptor receptor;

}
