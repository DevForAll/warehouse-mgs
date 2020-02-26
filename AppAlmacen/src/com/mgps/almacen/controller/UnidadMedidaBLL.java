package com.mgps.almacen.controller;

import com.mgps.almacen.dao.UnidadMedidaDAO;
import com.mgps.almacen.entity.UnidadMedidaTO;

public class UnidadMedidaBLL {

	
	
	UnidadMedidaDAO dao;

	  public UnidadMedidaBLL() {
	    dao = new UnidadMedidaDAO();
	  }


	    public int UnidadMedidaAdicionar(UnidadMedidaTO x) throws Exception {
	        return dao.create(x);
	    }

	  
}
