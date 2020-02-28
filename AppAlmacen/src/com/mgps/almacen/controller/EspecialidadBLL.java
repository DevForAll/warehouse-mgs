package com.mgps.almacen.controller;

import java.util.List;

import com.mgps.almacen.dao.EspecialidadDAO;
import com.mgps.almacen.entity.CategoriaTO;
import com.mgps.almacen.entity.EspecialidadTO;

public class EspecialidadBLL {

	
	EspecialidadDAO dao;

	  public EspecialidadBLL() {
	    dao = new EspecialidadDAO();
	  }

	  	public List<EspecialidadTO> 	EspecialidadListar() throws Exception{
	    	return dao.readAll();
	    }
	    
	  	public EspecialidadTO EspecialidadBuscar(Object x) throws Exception{
	    	return dao.find(x);
	    }

	    public int EspecialidadAdicionar(EspecialidadTO x) throws Exception {
	        return dao.create(x);
	    }

	    
	    public int  EspecialidadActualizar(EspecialidadTO x) throws Exception {
			return dao.update(x);
		}
	
}
