package com.mgps.almacen.controller;

import java.util.List;

import com.mgps.almacen.dao.UnidadMedidaDAO;
import com.mgps.almacen.entity.UnidadMedidaTO;

public class UnidadMedidaBLL {

	
	
	UnidadMedidaDAO dao;

	  public UnidadMedidaBLL() {
	    dao = new UnidadMedidaDAO();
	  }


	  
	  
	  
	/// LISTAR 
		  public List<UnidadMedidaTO> 	 UnidadMedidaListar() throws Exception{
		    	return dao.readAll();
		    }
		    
		  	public UnidadMedidaTO UnidadMedidaBuscar(Object x) throws Exception{
		    	return dao.find(x);
		    }
	  
	  
	  
	    public int UnidadMedidaAdicionar(UnidadMedidaTO x) throws Exception {
	        return dao.create(x);
	    }

	  
	    public int UnidadMedidActualizar(UnidadMedidaTO x) throws Exception {
			return dao.update(x);
		}
	    
	    
}
