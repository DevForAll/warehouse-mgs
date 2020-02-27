package com.mgps.almacen.controller;

import com.mgps.almacen.dao.EmpleadosDAO;
import com.mgps.almacen.entity.EmpleadoTO;

public class EmpleadosBLL {

	
	EmpleadosDAO dao;

	public EmpleadosBLL() {
		dao = new EmpleadosDAO();
	}

	//	METODOS DEL NEGOCIO
    public int EmpleadosAdicionar(EmpleadoTO x) throws Exception {
        return dao.create(x);
    }

	public int  EmpleadosActualizar(EmpleadoTO x) throws Exception {
		return dao.update(x);
	}
	
}
