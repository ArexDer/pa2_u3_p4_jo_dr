package com.example.demo.repository;

import com.example.demo.repository.modelo.Obra;

public interface ObraRepository {
	
	public void ingresar(Obra obra);

	public void actualizar(Obra obra);

	public void eliminarPorId(Integer id);

	public Obra seleccionarPorId(Integer id);

}


