package com.ipartek.taller.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ipartek.taller.domain.Cliente;
import com.mysql.jdbc.Statement;

public class ClienteDAO extends AccesoDB{

	public Cliente addCliente(Cliente cliente) {
		crearConexion();
		
		try {
			ps = conexion.prepareStatement("INSERT INTO clientes (nombre,apellidos,direccion,telefono) VALUES (?,?,?,?)", Statement.RETURN_GENERATED_KEYS);
			ps.setString(1, cliente.getNombre());
			ps.setString(2, cliente.getApellidos());
			ps.setString(3, cliente.getDireccion());
			ps.setString(4, cliente.getTelefono());
			
			ps.executeUpdate();
			rs = ps.getGeneratedKeys();
			
			if(rs.next()) {
				cliente.setId(rs.getInt(1));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			cerrarConexion();
		}
		return cliente;
	}

	public List<Cliente> getClientes() {
		List<Cliente> clientes = new ArrayList<Cliente>();
		
		crearConexion();
		
		try {
			ps = conexion.prepareStatement("SELECT id, nombre, apellidos, direccion, telefono from clientes");
			rs = ps.executeQuery();
			
			while(rs.next()) {
				Cliente c = new Cliente();
				
				c.setId(rs.getInt(1));
				c.setNombre(rs.getString(2));
				c.setApellidos(rs.getString(3));
				c.setDireccion(rs.getString(4));
				c.setTelefono(rs.getString(5));
				
				clientes.add(c);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			cerrarConexion();
		}
		
		return clientes;
	}

	public Cliente getClienteById(int id) {
		Cliente cliente = new Cliente();
		crearConexion();
		
		try {
			ps = conexion.prepareStatement("SELECT id, nombre, apellidos, direccion, telefono FROM clientes WHERE id = ?");
			ps.setInt(1, id);
			
			rs = ps.executeQuery();
			
			if(rs.next()) {
				cliente.setId(rs.getInt(1));
				cliente.setNombre(rs.getString(2));
				cliente.setApellidos(rs.getString(3));
				cliente.setDireccion(rs.getString(4));
				cliente.setTelefono(rs.getString(5));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			cerrarConexion();
		}
		
		return cliente;
	}

	public void deleteCliente(int id) {
		crearConexion();
		
		try {
			ps = conexion.prepareStatement("DELETE FROM clientes where id = ?");
			ps.setInt(1, id);
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			cerrarConexion();
		}
	}

	public Cliente updateCliente(Cliente cliente) {
		crearConexion();
		
		try {
			ps = conexion.prepareStatement("UPDATE clientes SET nombre = ?, apellidos = ?, direccion = ?, telefono = ? WHERE id = ?");
			ps.setString(1, cliente.getNombre());
			ps.setString(2, cliente.getApellidos());
			ps.setString(3, cliente.getDireccion());
			ps.setString(4, cliente.getTelefono());
			ps.setInt(5, cliente.getId());
			
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			cerrarConexion();
		}
		
		return cliente;
	}

}
