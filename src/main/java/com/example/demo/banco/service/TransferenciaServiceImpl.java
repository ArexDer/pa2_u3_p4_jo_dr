package com.example.demo.banco.service;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.banco.repository.TransferenciaRepository;
import com.example.demo.banco.repository.modelo.CuentaBancaria;
import com.example.demo.banco.repository.modelo.Transferencia;

@Service
public class TransferenciaServiceImpl implements TransferenciaService {

	@Autowired
	private TransferenciaRepository transferenciaRepository;

	@Autowired
	private CuentaBancariaService bancariaService;

	@Override
	public void agregar(Transferencia transferencia) {
		// TODO Auto-generated method stub
		this.transferenciaRepository.ingresar(transferencia);
	}

	@Override
	public void actualizar(Transferencia transferencia) {
		// TODO Auto-generated method stub
		this.transferenciaRepository.actualizar(transferencia);
	}

	@Override
	public void borrarPorId(Integer id) {
		// TODO Auto-generated method stub
		this.transferenciaRepository.eliminarPorId(id);

	}

	@Override
	public Transferencia seleccionarPorId(Integer id) {
		// TODO Auto-generated method stub
		return this.transferenciaRepository.seleccionarPorId(id);
	}

	@Override
	public void transferenciaOrigenDestino(String ctaOrigen, String ctaDestino, BigDecimal cantidad) {
		// TODO Auto-generated method stub
		System.out.println("ORIGEN");
		CuentaBancaria cuentaOrigen = this.bancariaService.buscarporNumeroCuenta(ctaOrigen);
		System.out.println(this.bancariaService.buscarporNumeroCuenta(ctaOrigen));

		System.out.println("DESTINO");
		CuentaBancaria cuentaDestino = this.bancariaService.buscarporNumeroCuenta(ctaDestino);
		System.out.println(this.bancariaService.buscarporNumeroCuenta(ctaDestino));

		BigDecimal saldo = cuentaOrigen.getSaldo();

		/*
		 * Valor de retorno: este método puede devolver los siguientes valores:
		 * 
		 * 0 : si el valor de este BigDecimal es igual al del objeto BigDecimal pasado
		 * como parámetro. 
		 * 1 : si el valor de este BigDecimal es mayor que el del objeto
		 * BigDecimal pasado como parámetro. 
		 * -1 : si el valor de este BigDecimal es
		 * menor que el del objeto BigDecimal pasado como parámetro.
		 */

		if (cantidad.compareTo(saldo) <= 0) {
			// CREO una variable de trasnferencia
						Transferencia transAux = new Transferencia();
						transAux.setCuenta(cuentaOrigen);
						transAux.setCuentaDestino(cuentaDestino);

						transAux.setFecha(LocalDate.of(2023, 07, 14));

						transAux.setMonto(cantidad);

						List<Transferencia> listaTrans = new ArrayList<>();
						listaTrans.add(transAux);

						BigDecimal saldoNuevoOrigen = cuentaOrigen.getSaldo();
						BigDecimal saldoNuevoDestino = cuentaDestino.getSaldo();

						cuentaOrigen.setSaldo(saldoNuevoOrigen.subtract(cantidad));
						cuentaOrigen.setTransferencias(listaTrans);
						cuentaDestino.setSaldo(saldoNuevoDestino.add(cantidad));
						this.bancariaService.actualizar(cuentaDestino);

						this.bancariaService.actualizar(cuentaOrigen);
			
		} else {

			System.out.println("SU SALDO ES INSUFICIENTE PARA REALIZAR LA PETICION");

		}

	}

	

	

	@Override
	public List<Transferencia> buscarTransferenciasCta(String numCta) {
		// TODO Auto-generated method stub
		return this.transferenciaRepository.seleccionarTransferenciasCta(numCta);
	}
	
	@Override
	public List<Transferencia> reporte() {
		// TODO Auto-generated method stub
		System.out.println("DETALLE DE TRANSFERENCIAS");
		 return this.transferenciaRepository.reporteTotal();
	}

}
