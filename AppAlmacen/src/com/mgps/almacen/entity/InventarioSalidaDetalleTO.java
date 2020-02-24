package com.mgps.almacen.entity;

public class InventarioSalidaDetalleTO {
	private int idInventarioSalidaDetalleVenta;
	private int cod;
	private ProductoTO productoTO;
	private float precioVenta;
	private int cantidad;
	private float importe;
	
	public InventarioSalidaDetalleTO() {
	}

	public InventarioSalidaDetalleTO(int idInventarioSalidaDetalleVenta, int cod, ProductoTO productoTO,
			float precioVenta, int cantidad, float importe) {
		this.idInventarioSalidaDetalleVenta = idInventarioSalidaDetalleVenta;
		this.cod = cod;
		this.productoTO = productoTO;
		this.precioVenta = precioVenta;
		this.cantidad = cantidad;
		this.importe = importe;
	}

	public int getIdInventarioSalidaDetalleVenta() {
		return idInventarioSalidaDetalleVenta;
	}

	public void setIdInventarioSalidaDetalleVenta(int idInventarioSalidaDetalleVenta) {
		this.idInventarioSalidaDetalleVenta = idInventarioSalidaDetalleVenta;
	}

	public int getCod() {
		return cod;
	}

	public void setCod(int cod) {
		this.cod = cod;
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
