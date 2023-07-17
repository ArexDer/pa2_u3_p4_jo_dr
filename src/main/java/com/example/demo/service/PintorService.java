package com.example.demo.service;

import java.util.List;

import com.example.demo.repository.modelo.Arquitecto;
import com.example.demo.repository.modelo.Obra;
import com.example.demo.repository.modelo.Pintor;

public interface PintorService {
	
	public void agregar(Pintor pintor);

	public void actualizar(Pintor pintor);

	public void borrarPorId(Integer id);

	public Pintor buscarPorId(Integer id);

	public List<Pintor> listarInnerJoin();

	public List<Pintor> listarLeftJoin();

	public List<Pintor> listarRightJoin();

	public List<Obra> listarHabitacionOuterLefttJoin();

	public List<Pintor> listarOuterFullJoin();

	public List<Pintor> listarWhereJoin();
	
	public List<Pintor> listarJoinFetch();

}
