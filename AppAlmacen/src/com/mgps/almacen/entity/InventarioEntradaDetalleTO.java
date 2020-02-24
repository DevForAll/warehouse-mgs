package com.mgps.almacen.entity;

public class InventarioEntradaDetalleTO {
	private int idVenta;
	private InventarioEntradaTO inventarioEntradaTO;
	private ProductoTO productoTO;
	private float precioVenta;
	private int cantidad;
	private float importe;
	
	public InventarioEntradaDetalleTO() {	
	}

	public InventarioEntradaDetalleTO(int idVenta, InventarioEntradaTO inventarioEntradaTO, ProductoTO productoTO,
			float precioVenta, int cantidad, float importe) {
		this.idVenta = idVenta;
		this.inventarioEntradaTO = inventarioEntradaTO;
		this.productoTO = productoTO;
		this.precioVenta = precioVenta;
		this.cantidad = cantidad;
		this.importe = importe;
	}

	public int getIdVenta() {
		return idVenta;
	}

	public void setIdVenta(int idVenta) {
		this.idVenta = idVenta;
	}

	public InventarioEntradaTO getInventarioEntradaTO() {
		return inventarioEntradaTO;
	}

	public void setInventarioEntradaTO(InventarioEntradaTO inventarioEntradaTO) {
		this.inventarioEntradaTO = inventarioEntradaTO;
	}

	public ProductoTO getProductoTO() {
		return productoTO;
	}

	public void setProductoTO(ProductoTO productoTO) {
		this.productoTO = productoTO;
	}

	public float getPrecioVenta() {
		return precioVenta;
	}

	public void setPrecioVenta(float precioVenta) {
		this.precioVenta = precioVenta;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public float getImporte() {
		return importe;
	}

	public void setImporte(float importe) {
		this.importe = importe;
	}
	
}
