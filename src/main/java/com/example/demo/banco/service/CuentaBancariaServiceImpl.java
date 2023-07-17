package com.example.demo.banco.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.banco.repository.CuentaBancariaRepository;
import com.example.demo.banco.repository.modelo.CuentaBancaria;

@Service
public class CuentaBancariaServiceImpl implements CuentaBancariaService {

	@Autowired
	private CuentaBancariaRepository bancariaRepository;
	
	@Override
	public void guardar(CuentaBancaria cuenta) {
		// TODO Auto-generated method stub
		this.bancariaRepository.ingresar(cuenta);
	}

	@Override
	public void actualizar(CuentaBancaria cuenta) {
		// TODO Auto-generated method stub
		this.bancariaRepository.actualizar(cuenta);
		
	}

	@Override
	public void borrar(Integer numero) {
		// TODO Auto-generated method stub
		this.bancariaRepository.eliminarPorId(numero);
		
	}

	@Override
	public CuentaBancaria seleccionar(Integer numero) {
		// TODO Auto-generated method stub
		return this.bancariaRepository.seleccionarPorId(numero);
	}

	@Override
	public CuentaBancaria buscarporNumeroCuenta(String num) {
		// TODO Auto-generated method stub
		return this.bancariaRepository.buscarporNumeroCuenta(num);
	}

}
