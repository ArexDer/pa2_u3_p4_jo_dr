package com.example.demo.universidad.repository;

import com.example.demo.universidad.repository.modelo.Estudiante;

public interface EstudianteRepository {

	public void insertar(Estudiante estudiante);
	
	public Estudiante buscarPorCedula(String cedula);
}
