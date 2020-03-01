package com.mgps.almacen.entity;

public class EmpleadoTO {
	private int idEmpleado;
	private String apellido;
	private String nombre;
	private String email;
	private String dni;
	private EspecialidadTO especialidad;
	private int CODEspecialidad;
	
	public EmpleadoTO() {
	}
	public EmpleadoTO(int idEmpleado, String apellido, String nombre, String email, String dni, int CODEspecialidad
			,EspecialidadTO especialidad) {
		this.idEmpleado = idEmpleado;
		this.apellido = apellido;
		this.nombre = nombre;
		this.email = email;
		this.dni = dni;
		this.especialidad = especialidad;
		this.CODEspecialidad = CODEspecialidad;
	}
	public int getCODEspecialidad() {
		return CODEspecialidad;
	}
	public void setCODEspecialidad(int cODEspecialidad) {
		CODEspecialidad = cODEspecialidad;
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
	public EspecialidadTO getEspecialidad() {
		return especialidad;
	}
	public void setEspecialidad(EspecialidadTO especialidad) {
		this.especialidad = especialidad;
	}
	
}
