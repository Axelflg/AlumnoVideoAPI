package com.api.alumno.repository;

import java.util.ArrayList;
import java.util.List;

import com.api.alumno.model.Alumno;

public class AlumnoRepositoryImpl implements AlumnoRepository{
	
	private static List<Alumno> alumnos = new ArrayList<>();
	
	static {
		Alumno axel = new Alumno("Axel Flores", "API Developer", "axelflores.afg@gmail.com");
		alumnos.add(axel);
	}

	@Override
	public Alumno addAlumno(Alumno alumno) {
		// TODO Auto-generated method stub
		alumnos.add(alumno);
		return alumno;
	}

	@Override
	public List<Alumno> getAlumnos() {
		// TODO Auto-generated method stub
		return alumnos;
	}

}
