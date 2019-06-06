package com.api.alumno;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.api.alumno.model.Alumno;
import com.api.alumno.repository.AlumnoRepository;
import com.api.alumno.repository.AlumnoRepositoryImpl;

@Path("/alumno")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class AlumnoAPI {
	
	AlumnoRepository repository = new AlumnoRepositoryImpl();
	
	/**
	 * Guarda un alumno
	 * @param alumno
	 * @return Alumno object de alumno guardado
	 */
	@POST
	public Alumno addAlumno(Alumno alumno) {
		return repository.addAlumno(alumno);
	}
	
	/**
	 * Obtiene la lista de todos los alumnos
	 * @return List de alumnos
	 */
	@GET
	public List<Alumno> getAlumnos() {
		return repository.getAlumnos();
	}
}
