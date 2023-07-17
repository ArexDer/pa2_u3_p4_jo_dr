package com.example.demo.service;

import java.util.List;

import com.example.demo.repository.modelo.Arquitecto;
import com.example.demo.repository.modelo.ObraGris;

public interface ArquitectoService {
	
	public void agregar(Arquitecto arquitecto);

	public void actualizar(Arquitecto arquitecto);

	public void borrarPorId(Integer id);

	public Arquitecto buscarPorId(Integer id);

	public List<Arquitecto> listarInnerJoin();

	public List<Arquitecto> listarLeftJoin();

	public List<Arquitecto> listarRightJoin();

	public List<ObraGris> listarHabitacionOuterLefttJoin();

	public List<Arquitecto> listarOuterFullJoin();

	public List<Arquitecto> listarWhereJoin();
	
	public List<Arquitecto> listarJoinFetch();

}
