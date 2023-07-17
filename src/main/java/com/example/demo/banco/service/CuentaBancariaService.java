package com.example.demo.banco.service;

import com.example.demo.banco.repository.modelo.CuentaBancaria;

public interface CuentaBancariaService {
	
	public void guardar(CuentaBancaria cuenta);

	public void actualizar(CuentaBancaria cuenta);
	
	public void borrar(Integer numero);

	public CuentaBancaria seleccionar(Integer numero);
	
	public CuentaBancaria buscarporNumeroCuenta(String num);

}
