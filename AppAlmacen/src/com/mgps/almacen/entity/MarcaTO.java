package com.mgps.almacen.entity;

public class MarcaTO {
	private int idMarca;
	private String nombre;
	private String descripcion;
	
	public MarcaTO() {
	}

	public MarcaTO(int idMarca, String nombre, String descripcion) {
		this.idMarca = idMarca;
		this.nombre = nombre;
		this.descripcion = descripcion;
	}

	public int getIdMarca() {
		return idMarca;
	}

	public void setIdMarca(int idMarca) {
		this.idMarca = idMarca;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

}
