package com.api.alumno.model;

public class Alumno {
	private String nombreCompleto;
	private String carrera;
	private String correo;
	
	public Alumno() {
	}
	
	public Alumno(String nombreCompleto, String carrera, String correo) {
		this.nombreCompleto = nombreCompleto;
		this.carrera = carrera;
		this.correo = correo;
	}

	public String getNombreCompleto() {
		return nombreCompleto;
	}

	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}

	public String getCarrera() {
		return carrera;
	}

	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}
}
