package com.example.demo.banco.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.support.TransactionSynchronizationManager;

import com.example.demo.banco.repository.CuentaBancariaRepository;
import com.example.demo.banco.repository.modelo.CuentaBancaria;

@Service
public class CuentaBancariaServiceImpl implements CuentaBancariaService {

	@Autowired
	private CuentaBancariaRepository bancariaRepository;
	
	@Autowired
	private IPruebaService iPruebaService;
	
	@Override
	//@Transactional
	public void guardar(CuentaBancaria cuenta) {
		// TODO Auto-generated method stub
		//this.bancariaRepository.ingresar(cuenta);
		
		System.out.println("Service "+TransactionSynchronizationManager.isActualTransactionActive());
		//this.bancariaRepository.insertar(propietario);
		//this.prueba();
		//this.iPruebaService.prueba();
		//this.iPruebaService.prueba2();
		//this.iPruebaService.pruebaSuports();
		//this.iPruebaService.pruebaNotSupported();
		//this.iPruebaService.pruebaRequired();
		this.iPruebaService.pruebaRequiresNew();
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
