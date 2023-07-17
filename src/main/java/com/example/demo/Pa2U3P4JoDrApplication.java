package com.example.demo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.banco.repository.modelo.CuentaBancaria;
import com.example.demo.banco.repository.modelo.Propietario;
import com.example.demo.banco.repository.modelo.Transferencia;
import com.example.demo.banco.service.CuentaBancariaService;
import com.example.demo.banco.service.TransferenciaService;

//
@SpringBootApplication
public class Pa2U3P4JoDrApplication implements CommandLineRunner {

	@Autowired
	private CuentaBancariaService bancariaService;
	
	@Autowired
	private TransferenciaService service;
	
	public static void main(String[] args) {
		SpringApplication.run(Pa2U3P4JoDrApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		//1.-CREAR DOS CUENTAS BANCARIAS.
		CuentaBancaria cta_1 = new CuentaBancaria();
		CuentaBancaria cta_2 = new CuentaBancaria();
		
		Propietario propietario_1 = new Propietario();
		Propietario propietario_2 = new Propietario();
		
		
		propietario_1.setNombre("Diego");
		propietario_1.setApellido("Rivas");
		propietario_1.setCedula("0011");
		
		cta_1.setNumero("123");
		cta_1.setSaldo(new BigDecimal(357.22));
		cta_1.setTipo("Ahorros");
		cta_1.setPropietario(propietario_1);
		this.bancariaService.guardar(cta_1);
		//-------------------------------------------------
		propietario_2.setNombre("Pablo");
		propietario_2.setApellido("Simbania");
		propietario_2.setCedula("9955");
		
		cta_2.setNumero("666");
		cta_2.setSaldo(new BigDecimal(140.22));
		cta_2.setTipo("Ahorros");
		cta_2.setPropietario(propietario_2);
		this.bancariaService.guardar(cta_2);
		
		
	
		//2.- REALIZAR UNA TRANSFERENCIA ENTRE CUENTAS
		System.out.println("PASO 2");
		this.service.transferenciaOrigenDestino("123", "666", new BigDecimal(35.12));
		
		
		//3.- LISTADO DE TRASNFERENCIAS
		System.out.println("°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°");
		this.service.reporte().forEach(System.out::println);
			
		
		

		
		
		

	}

}
