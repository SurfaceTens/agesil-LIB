package es.mde.acing.entities;

import java.time.LocalDate;
import java.util.List;

public class IncidenciaImpl implements Incidencia {

	// Atributos (sin ID)
	private String estado;
	private String descripcion;
	private LocalDate fechaInicio;
	private LocalDate fechaFin;
	private LocalDate fechaComunicacion;

	// Discriminador
	public static enum TipoIncidencia {
		DeficienciaServicio, LimpiezaChoque, CambiosDependencia, Ninguna
	}

	// Relaciones
	private List<Incidencia> incidencias;
	private Usuario usuario;
	private Receptor receptor;

	@Override
	public TipoIncidencia getTipo() {
		return TipoIncidencia.Ninguna;
	}

	@Override
	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	@Override
	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Override
	public LocalDate getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(LocalDate fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	@Override
	public LocalDate getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(LocalDate fechaFin) {
		this.fechaFin = fechaFin;
	}

	@Override
	public LocalDate getFechaComunicacion() {
		return fechaComunicacion;
	}

	public void setFechaComunicacion(LocalDate fechaComunicacion) {
		this.fechaComunicacion = fechaComunicacion;
	}

	@Override
	public List<Incidencia> getIncidencias() {
		return incidencias;
	}

	public void setIncidencias(List<Incidencia> incidencias) {
		this.incidencias = incidencias;
	}

	@Override
	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	@Override
	public Receptor getReceptor() {
		return receptor;
	}

	public void setReceptor(Receptor receptor) {
		this.receptor = receptor;
	}

}
