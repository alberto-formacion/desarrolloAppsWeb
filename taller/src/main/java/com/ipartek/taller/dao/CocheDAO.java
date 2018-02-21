package com.ipartek.taller.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ipartek.taller.domain.Coche;
import com.mysql.jdbc.Statement;

public class CocheDAO extends AccesoDB{

	public Coche addCoche(Coche coche) {
		crearConexion();
		
		try {
			ps = conexion.prepareStatement("INSERT INTO coches (matricula, marca, modelo, color, clientes_id) VALUES (?,?,?,?,?)",Statement.RETURN_GENERATED_KEYS);
			ps.setString(1, coche.getMatricula());
			ps.setString(2, coche.getMarca());
			ps.setString(3, coche.getModelo());
			ps.setString(4, coche.getColor());
			ps.setInt(5, coche.getCliente().getId());
			
			ps.executeUpdate();
			
			rs = ps.getGeneratedKeys();
			
			if(rs.next()) {
				coche.setId(rs.getInt(1));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			cerrarConexion();
		}
		
		
		return coche;
	}

	public List<Coche> getCochesByIdCliente(int id) {
		List<Coche> coches = new ArrayList<Coche>();
		crearConexion();
		
		try {
			ps = conexion.prepareStatement("SELECT id, matricula, marca, modelo, color FROM coches WHERE clientes_id = ?");
			ps.setInt(1, id);
			rs = ps.executeQuery();
			
			while (rs.next()) {
				Coche c = new Coche();
				c.setId(rs.getInt(1));
				c.setMatricula(rs.getString(2));
				c.setMarca(rs.getString(3));
				c.setModelo(rs.getString(4));
				c.setColor(rs.getString(5));
				
				coches.add(c);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			cerrarConexion();
		}
		
		return coches;
	}

}
