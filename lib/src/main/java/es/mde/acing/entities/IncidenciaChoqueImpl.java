package es.mde.acing.entities;

public class IncidenciaChoqueImpl extends IncidenciaImpl implements IncidenciaChoque {
	// Atributos Hijos
	private Trabajos trabajoSolicitado;

	// Discriminador
	public static enum Trabajos {
		Desinfeccion, Desratizacion, Desinsectacion
	}

	@Override
	public Trabajos getTrabajoSolicitado() {
		return trabajoSolicitado;
	}

	public void setTrabajoSolicitado(Trabajos trabajoSolicitado) {
		this.trabajoSolicitado = trabajoSolicitado;
	}

}
