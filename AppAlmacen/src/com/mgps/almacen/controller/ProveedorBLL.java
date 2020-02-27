package com.mgps.almacen.controller;

import com.mgps.almacen.dao.ProveedorDAO;
import com.mgps.almacen.entity.ProveedorTO;

public class ProveedorBLL {

	
	
	
	
	ProveedorDAO dao;

	  public ProveedorBLL() {
	    dao = new ProveedorDAO();
	  }


	    public int ProveedorAdicionar(ProveedorTO x) throws Exception {
	        return dao.create(x);
	    }

	  
	    public int ProveedorActualizar(ProveedorTO x) throws Exception {
			return dao.update(x);
		}
	    
	    
	    
}
