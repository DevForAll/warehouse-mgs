package com.mgps.almacen.entity;

import java.util.Date;

public class ProductoTO {
	private int idproducto;
	private String descripcion;
	private CategoriaTO categoriaTO;
	private MarcaTO marcaTO;
	private int Codigo;
	private UnidadMedidaTO unidadMedidoTO;
	private String ubicacion;
	private double precioCompra;
	private int stock;
	private int minStock;
	private String ven;
	private Date fechaVen;
	//private Date fechaVen;
	
	
	public ProductoTO() {
	}

	public ProductoTO(int idproducto, String descripcion, CategoriaTO categoriaTO, MarcaTO marcaTO,
			int Codigo,	UnidadMedidaTO unidadMedidoTO, String ubicacion, double precioCompra, int stock, int minStock,
			String ven, Date fechaVen) {
		this.idproducto = idproducto;
		this.descripcion = descripcion;
		this.categoriaTO = categoriaTO;
		this.marcaTO = marcaTO;
		this.Codigo = Codigo;
		this.unidadMedidoTO = unidadMedidoTO;
		this.ubicacion = ubicacion;
		this.precioCompra = precioCompra;
		this.stock = stock;
		this.minStock = minStock;
		this.ven = ven;
		this.fechaVen = fechaVen;
	}

	public int getIdproducto() {
		return idproducto;
	}

	public int getCodigo() {
		return Codigo;
	}

	public void setCodigo(int codigo) {
		Codigo = codigo;
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

	public double getPrecioCompra() {
		return precioCompra;
	}

	public void setPrecioCompra(double precioCompra) {
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

	public String getVen() {
		return ven;
	}

	public void setVen(String ven) {
		this.ven = ven;
	}

	public Date getFechaVen() {
		return fechaVen;
	}

	public void setFechaVen(Date fechaVen) {
		this.fechaVen = fechaVen;
	}

}
