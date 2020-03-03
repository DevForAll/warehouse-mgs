package com.mgps.almacen.controller;

import java.util.List;

import com.mgps.almacen.dao.ProductoDAO;
import com.mgps.almacen.entity.ProductoTO;;

public class ProductoBLL {

	
	ProductoDAO dao;

	  public ProductoBLL() {
	    dao = new ProductoDAO();
	  }


	  public List<ProductoTO> 	ProductoListar() throws Exception{
	    	return dao.readAll();
	    }
	    
	  	public ProductoTO ProductoBuscar(Object x) throws Exception{
	    	return dao.find(x);
	    }

	  
	  
	  
	    public int ProductoAdicionar(ProductoTO x) throws Exception {
	        return dao.create(x);
	    }

	    
	    public int ProductoActualizar(ProductoTO x) throws Exception {
			return dao.update(x);
		}
	
}
