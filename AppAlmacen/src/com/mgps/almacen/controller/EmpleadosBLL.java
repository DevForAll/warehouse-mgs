package com.mgps.almacen.controller;

import java.util.List;

import com.mgps.almacen.dao.EmpleadosDAO;
import com.mgps.almacen.entity.CategoriaTO;
import com.mgps.almacen.entity.EmpleadoTO;

public class EmpleadosBLL {

	
	EmpleadosDAO dao;

	public EmpleadosBLL() {
		dao = new EmpleadosDAO();
	}

	
	 public List<EmpleadoTO> EmpleadosListar() throws Exception{
	    	return dao.readAll();
	    }
		
	    public EmpleadoTO EmpleadosBuscar(Object x) throws Exception{
	    	return dao.find(x);
	    }
	
	
	//	METODOS DEL NEGOCIO
    public int EmpleadosAdicionar(EmpleadoTO x) throws Exception {
        return dao.create(x);
    }

	public int  EmpleadosActualizar(EmpleadoTO x) throws Exception {
		return dao.update(x);
	}
	
}
