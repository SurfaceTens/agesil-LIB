package es.mde.acing.entities;

import java.util.List;

public class IncidenciaDeficienciaImpl extends IncidenciaImpl implements IncidenciaDeficiencia {
	// Atributos Hijos
	private List<Incumplimientos> incumplimientos;
	private boolean notificadoSABAS;

	// Discriminador
	public static enum Incumplimientos {
		Polvo, Cristaleria, Mobiliario, Acabados, Suelo, Vaciado_De_Papeleras, Falta_De_Material, Desorden
	}

	@Override
	public List<Incumplimientos> getIncumplimientos() {
		return incumplimientos;
	}

	public void setIncumplimientos(List<Incumplimientos> incumplimientos) {
		this.incumplimientos = incumplimientos;
	}

	@Override
	public boolean isNotificadoSABAS() {
		return notificadoSABAS;
	}

	public void setNotificadoSABAS(boolean notificadoSABAS) {
		this.notificadoSABAS = notificadoSABAS;
	}
	
	

}
