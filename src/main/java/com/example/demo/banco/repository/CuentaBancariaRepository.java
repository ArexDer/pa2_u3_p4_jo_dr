package com.example.demo.banco.repository;

import com.example.demo.banco.repository.modelo.CuentaBancaria;
import com.example.demo.repository.modelo.Arquitecto;

public interface CuentaBancariaRepository {
	
	public void ingresar(CuentaBancaria cuentaBancaria);

	public void actualizar(CuentaBancaria cuentaBancaria);

	public void eliminarPorId(Integer id);

	public CuentaBancaria seleccionarPorId(Integer id);
	
	public CuentaBancaria buscarporNumeroCuenta(String num);

}
