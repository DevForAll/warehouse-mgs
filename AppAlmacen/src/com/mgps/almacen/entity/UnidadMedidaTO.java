package com.mgps.almacen.entity;

public class UnidadMedidaTO {
	private int cod;
	private String descripcion;
	private String descripcionCorta;
	private String codigoSunat;
	
	public UnidadMedidaTO() {
	}

	public UnidadMedidaTO(int cod, String descripcion, String descripcionCorta, String codigoSunat) {
		this.cod = cod;
		this.descripcion = descripcion;
		this.descripcionCorta = descripcionCorta;
		this.codigoSunat = codigoSunat;
	}

	public int getCod() {
		return cod;
	}

	public void setCod(int cod) {
		this.cod = cod;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getDescripcionCorta() {
		return descripcionCorta;
	}

	public void setDescripcionCorta(String descripcionCorta) {
		this.descripcionCorta = descripcionCorta;
	}

	public String getCodigoSunat() {
		return codigoSunat;
	}

	public void setCodigoSunat(String codigoSunat) {
		this.codigoSunat = codigoSunat;
	}
	
}
