package com.mgps.almacen.entity;

public class EmpleadoTO {
	private int idEmpleado;
	private String apellido;
	private String nombre;
	private String email;
	private String dni;
	
	public EmpleadoTO() {
	}

	public EmpleadoTO(int idEmpleado, String apellido, String nombre, String email, String dni) {
		this.idEmpleado = idEmpleado;
		this.apellido = apellido;
		this.nombre = nombre;
		this.email = email;
		this.dni = dni;
	}

	public int getIdEmpleado() {
		return idEmpleado;
	}

	public void setIdEmpleado(int idEmpleado) {
		this.idEmpleado = idEmpleado;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}
	
}