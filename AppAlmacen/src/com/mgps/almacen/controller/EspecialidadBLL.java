package com.mgps.almacen.controller;

import com.mgps.almacen.dao.EspecialidadDAO;
import com.mgps.almacen.entity.EspecialidadTO;

public class EspecialidadBLL {

	
	EspecialidadDAO dao;

	  public EspecialidadBLL() {
	    dao = new EspecialidadDAO();
	  }


	    public int EspecialidadAdicionar(EspecialidadTO x) throws Exception {
	        return dao.create(x);
	    }

	    
	    public int  EspecialidadActualizar(EspecialidadTO x) throws Exception {
			return dao.update(x);
		}
	
}
