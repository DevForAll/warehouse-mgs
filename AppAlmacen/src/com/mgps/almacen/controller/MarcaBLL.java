package com.mgps.almacen.controller;



import com.mgps.almacen.dao.MarcaDAO;
import com.mgps.almacen.entity.MarcaTO;


public class MarcaBLL {
	
	
	
	MarcaDAO dao;

	  public MarcaBLL() {
	    dao = new MarcaDAO();
	  }


	    public int MarcaAdicionar(MarcaTO x) throws Exception {
	        return dao.create(x);
	    }

	    
	    public int MarcaActualizar(MarcaTO x) throws Exception {
			return dao.update(x);
		}
	  

}
