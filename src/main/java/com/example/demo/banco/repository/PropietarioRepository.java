package com.example.demo.banco.repository;

import com.example.demo.banco.repository.modelo.CuentaBancaria;
import com.example.demo.banco.repository.modelo.Propietario;

public interface PropietarioRepository {
	
	public void ingresar(Propietario propietario);

	public void actualizar(Propietario propietario);

	public void eliminarPorId(Integer id);

	public Propietario seleccionarPorId(Integer id);

}
