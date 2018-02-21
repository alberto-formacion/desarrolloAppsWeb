package com.ipartek.taller.service;

import java.util.ArrayList;
import java.util.List;

import com.ipartek.taller.dao.ClienteDAO;
import com.ipartek.taller.dao.CocheDAO;
import com.ipartek.taller.domain.Cliente;
import com.ipartek.taller.domain.Coche;

public class ClienteService {
	
	ClienteDAO clienteDAO = new ClienteDAO();
	CocheDAO cocheDAO = new CocheDAO();

	public Cliente addCliente(Cliente cliente) {
		Cliente respuesta = clienteDAO.addCliente(cliente);
		
		respuesta.setCoches(cliente.getCoches());
		
		if(respuesta.getCoches() != null && respuesta.getCoches().size()>0) {
			List<Coche> coches = new ArrayList<Coche>();
			for(Coche coche: respuesta.getCoches()) {
				coche.setCliente(respuesta);
				Coche c = cocheDAO.addCoche(coche);
				c.setCliente(null);
				coches.add(c);
			}
			respuesta.setCoches(coches);
		}
		
		return respuesta;
		
	}

	public List<Cliente> getClientes() {
		List<Cliente> clientes = clienteDAO.getClientes();
		
		for(Cliente c : clientes) {
			List<Coche> cochesCliente = cocheDAO.getCochesByIdCliente(c.getId());
			c.setCoches(cochesCliente);
		}
		
		return clientes;
	}

	public Cliente getClienteById(int id) {
		Cliente cliente = clienteDAO.getClienteById(id);
		List<Coche> cochesCliente = cocheDAO.getCochesByIdCliente(cliente.getId());

		cliente.setCoches(cochesCliente);
		
		return cliente;
	}

	public Cliente deleteCliente(int id) {
		Cliente cliente = clienteDAO.getClienteById(id);
		
		if(cliente.getId()!=0) {
			clienteDAO.deleteCliente(cliente.getId());
		}
		
		return cliente;
	}

	public Cliente updateCliente(Cliente cliente) {
		return clienteDAO.updateCliente(cliente);
	}

}
