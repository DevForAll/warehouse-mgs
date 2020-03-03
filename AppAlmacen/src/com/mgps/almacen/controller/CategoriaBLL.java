package com.mgps.almacen.controller;

import java.util.List;

import com.mgps.almacen.dao.CategoriaDAO;
import com.mgps.almacen.entity.CategoriaTO;


public class CategoriaBLL {

	CategoriaDAO dao;

	public CategoriaBLL() {
		dao = new CategoriaDAO();
	}

	//	METODOS DEL NEGOCIO
    public List<CategoriaTO> CategoriaListar() throws Exception{
    	return dao.readAll();
    }
	
    public CategoriaTO CategoriaBuscar(Object x) throws Exception{
    	return dao.find(x);
    }
    
public List<CategoriaTO> CategoriaListar2(Object o,int op ) throws Exception{
		
		return dao.readAll(o,op);
	}
    
    
    public List<CategoriaTO> CategoriaListarXNombre() throws Exception{
    	return dao.readAllBuscar();
    }
	    
    public CategoriaTO CategoriaBuscarXNombre(Object x) throws Exception{
    	return dao.findA(x);
    }
	
    
    
    
    public int CategoriaAdicionar(CategoriaTO x) throws Exception {
        return dao.create(x);
    }

	public int CategoriaActualizar(CategoriaTO x) throws Exception {
		return dao.update(x);
	}
}
