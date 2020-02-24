package com.mgps.almacen.entity;

public class ProveedorTO {
	private int idProveedor;
	private String razonSocial;
	private String direccion;
	private String ruc;
	private String telefono;
	
	public ProveedorTO() {
	}
	
	public ProveedorTO(int idProveedor, String razonSocial, String direccion, String ruc, String telefono) {
		this.idProveedor = idProveedor;
		this.razonSocial = razonSocial;
		this.direccion = direccion;
		this.ruc = ruc;
		this.telefono = telefono;
	}
	
	public int getIdProveedor() {
		return idProveedor;
	}
	public void setIdProveedor(int idProveedor) {
		this.idProveedor = idProveedor;
	}
	public String getRazonSocial() {
		return razonSocial;
	}
	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getRuc() {
		return ruc;
	}
	public void setRuc(String ruc) {
		this.ruc = ruc;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
}
