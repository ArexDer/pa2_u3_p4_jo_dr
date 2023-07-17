package com.example.demo.repository;


import com.example.demo.repository.modelo.ObraGris;

public interface ObraGrisRepository {
	
public void ingresar(ObraGris obraGris);
	
	public void actualizar(ObraGris obraGris);
	
	public void eliminarPorId(Integer id);
	
	public ObraGris seleccionarPorId(Integer id);

}
