package TO;

import java.util.Date;

public class TOusuario {
	
	private int idUsuarios;
	private String usuario;
	private String clave;
	private String tipoUsuario;
	private String nombres;
	private String apellidos;
	private String identificacion;
	private String direccion;
	private String telefono;
	private String correo;
	private String genero;
	private Date fecha;
	
	//Constructores
	
	public TOusuario(int idUsuarios, String usuario, String clave, String tipoUsuario, String nombres, String apellidos,
			String identificacion, String direccion, String telefono, String correo, String genero, Date fecha) {
		super();
		this.idUsuarios = idUsuarios;
		this.usuario = usuario;
		this.clave = clave;
		this.tipoUsuario = tipoUsuario;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.identificacion = identificacion;
		this.direccion = direccion;
		this.telefono = telefono;
		this.correo = correo;
		this.genero = genero;
		this.fecha = fecha;
	}
	
	public TOusuario(int idUsuarios, String usuario, String clave, String tipoUsuario, String nombres, String apellidos,
			String identificacion, String correo, String genero, Date fecha) {
		super();
		this.idUsuarios = idUsuarios;
		this.usuario = usuario;
		this.clave = clave;
		this.tipoUsuario = tipoUsuario;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.identificacion = identificacion;
		this.correo = correo;
		this.genero = genero;
		this.fecha = fecha;
	}
	
	//Getters y Setters
	public int getIdUsuarios() {
		return idUsuarios;
	}
	
	public void setIdUsuarios(int idUsuarios) {
		this.idUsuarios = idUsuarios;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getClave() {
		return clave;
	}
	public void setClave(String clave) {
		this.clave = clave;
	}
	public String getTipoUsuario() {
		return tipoUsuario;
	}
	public void setTipoUsuario(String tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getIdentificacion() {
		return identificacion;
	}
	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	
	
}