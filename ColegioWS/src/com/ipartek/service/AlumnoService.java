package com.ipartek.service;

import java.util.List;

import com.ipartek.dao.AlumnoDAO;
import com.ipartek.domain.Alumno;

public class AlumnoService {
	
	AlumnoDAO alumnoDAO = new AlumnoDAO();

	public String addAlumno(String nombre, 
			String apellidos, 
			String email, 
			String direccion, 
			String telefono) {
		Alumno nAlumno = new Alumno(nombre,apellidos,email,telefono,direccion);
		
		int filasModificadas = alumnoDAO.addAlumno(nAlumno);
		
		if(filasModificadas>0) {
			return "Usuario creado";
		}else {
			return "Fallo al crear el Usuario";
		}
		
	}
	
	public Alumno[] getAlumnos() {
		List<Alumno> alumnos = alumnoDAO.getAlumnos();
		return alumnos.toArray(new Alumno[alumnos.size()]);
	}
	
	public Alumno getAlumnoById(int id) {
		return alumnoDAO.getAlumnoById(id);
	}
	
	public String updateAlumno(int id,
			String nombre, 
			String apellidos, 
			String email, 
			String direccion, 
			String telefono) {
		Alumno uAlumno = new Alumno(id, nombre, apellidos, email, telefono, direccion);
		
		int filasModificadas = alumnoDAO.updateAlumno(uAlumno);
		
		if(filasModificadas>0) {
			return "Alumno modificado";
		}else if(filasModificadas == 0) {
			return "No hay un alumno con ese ID";
		}else {
			return "No se ha podido modificar";
		}
		
	}
	
	public String deleteAlumno(int id) {
		int filasModificadas = alumnoDAO.deleteAlumno(id);
		
		if(filasModificadas > 0) {
			return "Alumno borrado";
		}else {
			return "No hay alumnos con ese ID";
		}
		
		
	}
}
