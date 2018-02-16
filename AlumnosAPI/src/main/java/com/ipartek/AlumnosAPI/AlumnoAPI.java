package com.ipartek.AlumnosAPI;

import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.ipartek.AlumnosAPI.dao.AlumnoDAO;
import com.ipartek.AlumnosAPI.domain.Alumno;

@Path("alumnos")
public class AlumnoAPI {
	
	AlumnoDAO alumnoDAO = new AlumnoDAO();
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Alumno> getAlumnos(){
		return alumnoDAO.getAlumnos();
	}
	
	@GET
	@Path("{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Alumno getAlumnoById(@PathParam("id") int id) {
		return alumnoDAO.getAlumnoById(id);
	}
	
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	public String addAlumno(Alumno alumno) {
		int nfilasCreadas = alumnoDAO.addAlumno(alumno);
		if(nfilasCreadas>0) {
			return "Alumno creado";
		}else {
			return "El alumno no ha podido introducirse en la BD";
		}
		
	}
	
	@PUT
	@Produces(MediaType.APPLICATION_JSON)
	public String updateAlumno (Alumno alumno) {
		int nfilasModificadas = alumnoDAO.updateAlumno(alumno);
		if(nfilasModificadas>0) {
			return "Alumno Modificado";
		}else{
			return "El alumno no ha podido modificarse en la BD";
		}
		
	}
	
	@DELETE
	@Path("{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public String deleteAlumno (@PathParam("id") int id) {
		int nfilasElimindas = alumnoDAO.deleteAlumno(id);
		if(nfilasElimindas>0) {
			return "Alumno Borrado";
		}else{
			return "El alumno no ha podido borrarse en la BD";
		}
	}

}
