package com.mgps.almacen.entity;

import java.util.Date;

public class InventarioSalidaTO {
	private int cod;
	private int ordenCompra;
	private Date fecha;
	private UsuarioTO usuarioTO;
	private ProveedorTO proveedorTO;
	private ProductoTO productoTO;
	private float preTotal;
	
	public InventarioSalidaTO() {
	}

	public InventarioSalidaTO(int cod, int ordenCompra, Date fecha, UsuarioTO usuarioTO, ProveedorTO proveedorTO,
			ProductoTO productoTO, float preTotal) {
		this.cod = cod;
		this.ordenCompra = ordenCompra;
		this.fecha = fecha;
		this.usuarioTO = usuarioTO;
		this.proveedorTO = proveedorTO;
		this.productoTO = productoTO;
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

	public ProveedorTO getProveedorTO() {
		return proveedorTO;
	}

	public void setProveedorTO(ProveedorTO proveedorTO) {
		this.proveedorTO = proveedorTO;
	}

	public ProductoTO getProductoTO() {
		return productoTO;
	}

	public void setProductoTO(ProductoTO productoTO) {
		this.productoTO = productoTO;
	}

	public float getPreTotal() {
		return preTotal;
	}

	public void setPreTotal(float preTotal) {
		this.preTotal = preTotal;
	}
	
}
