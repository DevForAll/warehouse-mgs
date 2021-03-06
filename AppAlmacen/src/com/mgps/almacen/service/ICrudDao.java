package com.mgps.almacen.service;

import java.util.List;

public interface ICrudDao <T> {
	
	int create(T t) throws Exception;

	int update(T t) throws Exception;

	int delete(T t) throws Exception;

	T find(Object t) throws Exception;

	T findA(Object t) throws Exception;
	
	List<T> readAll() throws Exception;
	
	List<T> readAllBuscar() throws Exception;

	List<T> readAll(Object t, int op) throws Exception;
}
