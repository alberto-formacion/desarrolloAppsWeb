package com.ipartek.taller.api;

import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.ipartek.taller.domain.Cliente;
import com.ipartek.taller.service.ClienteService;

@Path("clientes")
public class ClienteAPI {
	
	ClienteService clienteService = new ClienteService();
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Cliente> getClientes() {
		return clienteService.getClientes();
	}
	
	@GET
	@Path("{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Cliente getCliente(@PathParam("id") int id) {
		return clienteService.getClienteById(id);
	}
	
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	public Cliente addCliente(Cliente cliente) {
		return clienteService.addCliente(cliente);
	}
	
	@PUT
	@Produces(MediaType.APPLICATION_JSON)
	public Cliente updateCliente(Cliente cliente) {
		return clienteService.updateCliente(cliente);
	}
	
	@DELETE
	@Path("{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Cliente deleteCliente(@PathParam("id") int id) {
		return clienteService.deleteCliente(id);
	}

}
