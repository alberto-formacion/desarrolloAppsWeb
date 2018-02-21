package com.ipartek.taller.domain;

import java.util.List;

public class Mecanico {
	
	int id;
	String nombre;
	List<Coche> cochesReparando;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public List<Coche> getCochesReparando() {
		return cochesReparando;
	}
	public void setCochesReparando(List<Coche> cochesReparando) {
		this.cochesReparando = cochesReparando;
	}

}
