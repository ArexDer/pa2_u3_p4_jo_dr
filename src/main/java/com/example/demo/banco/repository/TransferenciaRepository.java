package com.example.demo.banco.repository;

import java.util.List;

import com.example.demo.banco.repository.modelo.Transferencia;

public interface TransferenciaRepository {
	
	public void ingresar(Transferencia transferencia);

	public void actualizar(Transferencia transferencia);

	public void eliminarPorId(Integer id);

	public Transferencia seleccionarPorId(Integer id);
	
	public List<Transferencia> seleccionarTransferenciasCta(String numCta);
	
	public List<Transferencia> reporteTotal();

}
