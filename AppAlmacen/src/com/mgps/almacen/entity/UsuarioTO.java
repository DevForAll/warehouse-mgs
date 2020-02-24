package com.mgps.almacen.entity;

public class UsuarioTO {
	
	private int idUsuario;
	private String nombreApellidos;
	private String login;
	private String password;
	private String icono;
	private String nombreIcono;
	private String correo;
	private String rol;
	private String estado;

	public   UsuarioTO() {	
	}
	
	public UsuarioTO(Integer idUsuario, String nombreApellidos, String login, String password, String icono,
			String nombreIcono, String correo, String rol, String estado) {
//		super();
		this.idUsuario = idUsuario;
		this.nombreApellidos = nombreApellidos;
		this.login = login;
		this.password = password;
		this.icono = icono;
		this.nombreIcono = nombreIcono;
		this.correo = correo;
		this.rol = rol;
		this.estado = estado;
	}

	public Integer getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getNombreApellidos() {
		return nombreApellidos;
	}

	public void setNombreApellidos(String nombreApellidos) {
		this.nombreApellidos = nombreApellidos;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getIcono() {
		return icono;
	}

	public void setIcono(String icono) {
		this.icono = icono;
	}

	public String getNombreIcono() {
		return nombreIcono;
	}

	public void setNombreIcono(String nombreIcono) {
		this.nombreIcono = nombreIcono;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getRol() {
		return rol;
	}

	public void setRol(String rol) {
		this.rol = rol;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
}
