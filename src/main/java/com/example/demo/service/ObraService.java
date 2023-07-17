package com.example.demo.service;

import com.example.demo.repository.modelo.Obra;

public interface ObraService {

	public void agregar(Obra obra);

	public void actualizar(Obra obra);

	public void borrarPorId(Integer id);

	public Obra buscarPorId(Integer id);

}
