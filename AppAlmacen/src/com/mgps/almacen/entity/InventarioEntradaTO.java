package com.mgps.almacen.entity;

import java.util.Date;

public class InventarioEntradaTO {
	private int inventarioCod;
	private String inventarioOrdenCompra;
	private Date inventarioFecha;
	private UsuarioTO usuarioTO;
	private ProveedorTO proveedorTO;
	private ProductoTO productoTO;
	private int preTotal;
	
	public InventarioEntradaTO() {
	}

	public InventarioEntradaTO(int inventarioCod, String inventarioOrdenCompra, Date inventarioFecha,
			UsuarioTO usuarioTO, ProveedorTO proveedorTO, ProductoTO productoTO, int preTotal) {
		this.inventarioCod = inventarioCod;
		this.inventarioOrdenCompra = inventarioOrdenCompra;
		this.inventarioFecha = inventarioFecha;
		this.usuarioTO = usuarioTO;
		this.proveedorTO = proveedorTO;
		this.productoTO = productoTO;
		this.preTotal = preTotal;
	}

	public int getInventarioCod() {
		return inventarioCod;
	}

	public void setInventarioCod(int inventarioCod) {
		this.inventarioCod = inventarioCod;
	}

	public String getInventarioOrdenCompra() {
		return inventarioOrdenCompra;
	}

	public void setInventarioOrdenCompra(String inventarioOrdenCompra) {
		this.inventarioOrdenCompra = inventarioOrdenCompra;
	}

	public Date getInventarioFecha() {
		return inventarioFecha;
	}

	public void setInventarioFecha(Date inventarioFecha) {
		this.inventarioFecha = inventarioFecha;
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

	public int getPreTotal() {
		return preTotal;
	}

	public void setPreTotal(int preTotal) {
		this.preTotal = preTotal;
	}

}
