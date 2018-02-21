package com.ipartek.taller.domain;

import java.util.List;

public class Coche {
	
	private int id;
	private String matricula, marca, modelo, color;
	Cliente cliente;
	List<Mecanico> mecanicos;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public List<Mecanico> getMecanicos() {
		return mecanicos;
	}
	public void setMecanicos(List<Mecanico> mecanicos) {
		this.mecanicos = mecanicos;
	}

}
