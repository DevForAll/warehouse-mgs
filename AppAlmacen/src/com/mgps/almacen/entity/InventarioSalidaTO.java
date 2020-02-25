package com.mgps.almacen.entity;

import java.util.Date;

public class InventarioSalidaTO {
	private int cod;
	private int ordenCompra;
	private Date fecha;
	private UsuarioTO usuarioTO;
	private EmpleadoTO empleadoTO;
	private float preTotal;
	
	public InventarioSalidaTO() {
	}

	public InventarioSalidaTO(int cod, int ordenCompra, Date fecha, UsuarioTO usuarioTO, EmpleadoTO empleadoTO,
			float preTotal) {
		this.cod = cod;
		this.ordenCompra = ordenCompra;
		this.fecha = fecha;
		this.usuarioTO = usuarioTO;
		this.empleadoTO = empleadoTO;
		this.preTotal = preTotal;
	}

	public int getCod() {
		return cod;
	}
	public void setCod(int cod) {
		this.cod = cod;
	}
	public int getOrdenCompra() {
		return ordenCompra;
	}
	public void setOrdenCompra(int ordenCompra) {
		this.ordenCompra = ordenCompra;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public UsuarioTO getUsuarioTO() {
		return usuarioTO;
	}
	public void setUsuarioTO(UsuarioTO usuarioTO) {
		this.usuarioTO = usuarioTO;
	}
	public EmpleadoTO getEmpleadoTO() {
		return empleadoTO;
	}
	public void setEmpleadoTO(EmpleadoTO empleadoTO) {
		this.empleadoTO = empleadoTO;
	}
	public float getPreTotal() {
		return preTotal;
	}
	public void setPreTotal(float preTotal) {
		this.preTotal = preTotal;
	}
	
}
