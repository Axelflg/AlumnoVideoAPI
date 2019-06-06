package com.api.alumno.repository;

import java.util.List;

import com.api.alumno.model.Alumno;

public interface AlumnoRepository {
	
	public Alumno addAlumno(Alumno alumno);
	public List<Alumno> getAlumnos(); 

}
