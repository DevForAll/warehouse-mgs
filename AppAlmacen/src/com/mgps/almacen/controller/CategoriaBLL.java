package com.mgps.almacen.controller;

import com.mgps.almacen.dao.CategoriaDAO;
import com.mgps.almacen.entity.CategoriaTO;

public class CategoriaBLL {

	CategoriaDAO dao;

	public CategoriaBLL() {
		dao = new CategoriaDAO();
	}

	//	METODOS DEL NEGOCIO
    public int CategoriaAdicionar(CategoriaTO x) throws Exception {
        return dao.create(x);
    }

	public int CategoriaActualizar(CategoriaTO x) throws Exception {
		return dao.update(x);
	}
}
