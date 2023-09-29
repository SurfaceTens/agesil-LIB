package es.mde.acing.entities;

import java.util.List;

public class UnidadImpl implements Unidad {

	// Atributos (sin ID)
	private String nombre;
	private String zona;
	private String comandancia;

	// Relaciones
	private List<Usuario> usuarios;

	@Override
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String getZona() {
		return zona;
	}

	public void setZona(String zona) {
		this.zona = zona;
	}

	@Override
	public String getComandancia() {
		return comandancia;
	}

	public void setComandancia(String comandancia) {
		this.comandancia = comandancia;
	}

	@Override
	public List<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

}
