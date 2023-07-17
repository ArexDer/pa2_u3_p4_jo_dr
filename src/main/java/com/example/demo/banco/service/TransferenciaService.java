package com.example.demo.banco.service;

import java.math.BigDecimal;
import java.util.List;

import com.example.demo.banco.repository.modelo.Transferencia;

public interface TransferenciaService {
	
	public void agregar(Transferencia transferencia);

	public void actualizar(Transferencia transferencia);

	public void borrarPorId(Integer id);

	public Transferencia seleccionarPorId(Integer id);
	
	public void transferenciaOrigenDestino(String CuentaOrigen, String CuentaDestino, BigDecimal cantidad);
	
	public List<Transferencia> buscarTransferenciasCta(String numCta);
	
	 public List<Transferencia> reporte();
	

}
