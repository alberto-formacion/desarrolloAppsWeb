package com.ipartek.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ipartek.domain.Alumno;

public class AlumnoDAO extends AccesoDB{

	public int addAlumno(Alumno nAlumno) {
		
		crearConexion();
		
		try {
			ps = conexion.prepareStatement("insert into alumnos (nombre, apellidos, direccion, telefono, email) VALUES (?,?,?,?,?)");
			ps.setString(1, nAlumno.getNombre());
			ps.setString(2, nAlumno.getApellidos());
			ps.setString(3, nAlumno.getDireccion());
			ps.setString(4, nAlumno.getTelefono());
			ps.setString(5, nAlumno.getEmail());
			
			int filasModificadas = ps.executeUpdate();
			return filasModificadas;
		} catch (SQLException e) {
			e.printStackTrace();
			return -1;
		} finally {
			cerrarConexion();
		}
		
	}

	public List<Alumno> getAlumnos() {
		crearConexion();
		
		List<Alumno> alumnos = new ArrayList<Alumno>();
		
		try {
			ps = conexion.prepareStatement("Select id,nombre,apellidos,email,direccion,telefono from alumnos");
			rs = ps.executeQuery();
			while(rs.next()) {
				alumnos.add(new Alumno(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(6),rs.getString(5)));
			}
			return alumnos;
		} catch (SQLException e) {
			e.printStackTrace();
			return alumnos;
		}finally {
			cerrarConexion();
		}
	}

	public Alumno getAlumnoById(int id) {
		crearConexion();
		
		try {
			ps = conexion.prepareStatement("Select id,nombre,apellidos,email,direccion,telefono from alumnos where id = ?");
			ps.setInt(1, id);
			
			rs = ps.executeQuery();
			if(rs.next()) {
				return new Alumno(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(6),rs.getString(5));
			}
			return new Alumno();
		} catch (SQLException e) {
			e.printStackTrace();
			return new Alumno();
		}finally {
			cerrarConexion();
		}
	}

	public int updateAlumno(Alumno uAlumno) {
		crearConexion();
		
		try {
			ps = conexion.prepareStatement("UPDATE alumnos SET nombre = ?, apellidos = ?, email = ?, direccion = ?, telefodo = ? WHERE id = ?");
			ps.setString(1, uAlumno.getNombre());
			ps.setString(2, uAlumno.getApellidos());
			ps.setString(3, uAlumno.getEmail());
			ps.setString(4, uAlumno.getDireccion());
			ps.setString(5, uAlumno.getTelefono());
			ps.setInt(6, uAlumno.getId());
			
			int filasModificadas = ps.executeUpdate();
			
			return filasModificadas;
		} catch (SQLException e) {
			e.printStackTrace();
			return -1;
		}
	}

	public int deleteAlumno(int id) {
		crearConexion();
		
		try {
			ps = conexion.prepareStatement("DELETE FROM alumnos WHERE id = ?");
			ps.setInt(1, id);
			
			return ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			return -1;
		}finally {
			cerrarConexion();
		}
	}

}
