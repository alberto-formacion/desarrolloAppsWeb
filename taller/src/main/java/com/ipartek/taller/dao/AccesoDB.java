package com.ipartek.taller.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AccesoDB {
	protected Connection conexion = null;
	protected PreparedStatement ps = null;
	protected ResultSet rs = null;
	
	protected void crearConexion() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/taller", "root", "root");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	protected void cerrarConexion() {
		try {
			if(rs!=null) {
				rs.close();
			}
			
			if(ps!=null) {
				ps.close();
			}
			
			if(conexion!=null) {
				conexion.close();
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
