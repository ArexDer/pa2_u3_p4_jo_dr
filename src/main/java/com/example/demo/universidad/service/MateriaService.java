package com.example.demo.universidad.service;

import com.example.demo.universidad.repository.modelo.Materia;

public interface MateriaService {

	public void agregar(Materia materia);
	
	public Materia buscarPorCodigo(String codigo);
	
}
