package com.example.demo.repository;

import java.util.List;

import com.example.demo.repository.modelo.Arquitecto;
import com.example.demo.repository.modelo.ObraGris;

public interface ArquitectoRepository {
	
	public void ingresar(Arquitecto arquitecto);

	public void actualizar(Arquitecto arquitecto);

	public void eliminarPorId(Integer id);

	public Arquitecto seleccionarPorId(Integer id);

	public List<Arquitecto> seleccionarInnerJoin();

	public List<Arquitecto> seleccionarOuterLeftJoin();

	public List<Arquitecto> seleccionarOuterRightJoin();

	public List<ObraGris> seleccionarHabitacionOuterLefttJoin();

	public List<Arquitecto> seleccionarOuterFullJoin();

	public List<Arquitecto> seleccionarWhereJoin();
	
	public List<Arquitecto> seleccionarJoinFetch();

}
