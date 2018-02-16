package com.ipartek.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AccesoDB {
	protected static Connection conexion = null;
	protected static PreparedStatement ps = null;
	protected static ResultSet rs = null;
	
	protected static void crearConexion() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/colegio", "root", "root");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	protected static void cerrarConexion() {
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
