package com.mgps.almacen.entity;

import java.util.Date;

public class ProductoTO {
	private int idproducto;
	private String descripcion;
	private CategoriaTO categoriaTO;
	private MarcaTO marcaTO;
	private UnidadMedidaTO unidadMedidoTO;
	private String ubicacion;
	private float precioCompra;
	private int stock;
	private int minStock;
	private String vencimiento;
	private Date fechaVen;
	
	public ProductoTO() {
	}

	public ProductoTO(int idproducto, String descripcion, CategoriaTO categoriaTO, MarcaTO marcaTO,
			UnidadMedidaTO unidadMedidoTO, String ubicacion, float precioCompra, int stock, int minStock,
			String vencimiento, Date fechaVen) {
		this.idproducto = idproducto;
		this.descripcion = descripcion;
		this.categoriaTO = categoriaTO;
		this.marcaTO = marcaTO;
		this.unidadMedidoTO = unidadMedidoTO;
		this.ubicacion = ubicacion;
		this.precioCompra = precioCompra;
		this.stock = stock;
		this.minStock = minStock;
		this.vencimiento = vencimiento;
		this.fechaVen = fechaVen;
	}

	public int getIdproducto() {
		return idproducto;
	}

	public void setIdproducto(int idproducto) {
		this.idproducto = idproducto;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public CategoriaTO getCategoriaTO() {
		return categoriaTO;
	}

	public void setCategoriaTO(CategoriaTO categoriaTO) {
		this.categoriaTO = categoriaTO;
	}

	public MarcaTO getMarcaTO() {
		return marcaTO;
	}

	public void setMarcaTO(MarcaTO marcaTO) {
		this.marcaTO = marcaTO;
	}

	public UnidadMedidaTO getUnidadMedidoTO() {
		return unidadMedidoTO;
	}

	public void setUnidadMedidoTO(UnidadMedidaTO unidadMedidoTO) {
		this.unidadMedidoTO = unidadMedidoTO;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public float getPrecioCompra() {
		return precioCompra;
	}

	public void setPrecioCompra(float precioCompra) {
		this.precioCompra = precioCompra;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public int getMinStock() {
		return minStock;
	}

	public void setMinStock(int minStock) {
		this.minStock = minStock;
	}

	public String getVencimiento() {
		return vencimiento;
	}

	public void setVencimiento(String vencimiento) {
		this.vencimiento = vencimiento;
	}

	public Date getFechaVen() {
		return fechaVen;
	}

	public void setFechaVen(Date fechaVen) {
		this.fechaVen = fechaVen;
	}

}
