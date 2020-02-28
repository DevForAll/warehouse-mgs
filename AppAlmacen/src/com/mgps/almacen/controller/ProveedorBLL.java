package com.mgps.almacen.controller;

import java.util.List;

import com.mgps.almacen.dao.ProveedorDAO;
import com.mgps.almacen.entity.ProveedorTO;

public class ProveedorBLL {

	
	
	
	
	ProveedorDAO dao;

	  public ProveedorBLL() {
	    dao = new ProveedorDAO();
	  }


	  
	  
	  
/// LISTAR 
	  public List<ProveedorTO> 	ProveedorListar() throws Exception{
	    	return dao.readAll();
	    }
	    
	  	public ProveedorTO ProveedorBuscar(Object x) throws Exception{
	    	return dao.find(x);
	    }

	  
	  
	    public int ProveedorAdicionar(ProveedorTO x) throws Exception {
	        return dao.create(x);
	    }

	  
	    public int ProveedorActualizar(ProveedorTO x) throws Exception {
			return dao.update(x);
		}
	    
	    
	    
}
