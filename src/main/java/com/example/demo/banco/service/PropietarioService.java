package com.example.demo.banco.service;

import com.example.demo.banco.repository.modelo.Propietario;

public interface PropietarioService {
	
	public void agregar(Propietario propietario);

	public void actualizar(Propietario propietario);

	public void borrarPorId(Integer id);

	public Propietario seleccionarPorId(Integer id);

}
