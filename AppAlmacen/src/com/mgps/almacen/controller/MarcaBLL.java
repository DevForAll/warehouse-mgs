package com.mgps.almacen.controller;



import java.util.List;

import com.mgps.almacen.dao.MarcaDAO;
import com.mgps.almacen.entity.MarcaTO;


public class MarcaBLL {
	
	
	
	MarcaDAO dao;

	  public MarcaBLL() {
	    dao = new MarcaDAO();
	  }


	  public List<MarcaTO> 	MarcaListar() throws Exception{
	    	return dao.readAll();
	    }
	    
	  	public MarcaTO MarcaBuscar(Object x) throws Exception{
	    	return dao.find(x);
	    }

	  
	  
	  
	    public int MarcaAdicionar(MarcaTO x) throws Exception {
	        return dao.create(x);
	    }

	    
	    public int MarcaActualizar(MarcaTO x) throws Exception {
			return dao.update(x);
		}
	  

}
