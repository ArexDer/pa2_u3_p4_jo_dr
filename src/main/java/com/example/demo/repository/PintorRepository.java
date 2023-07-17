package com.example.demo.repository;

import java.util.List;

import com.example.demo.repository.modelo.Arquitecto;
import com.example.demo.repository.modelo.Hotel;
import com.example.demo.repository.modelo.Obra;
import com.example.demo.repository.modelo.Pintor;

public interface PintorRepository {

	public void ingresar(Pintor pintor);

	public void actualizar(Pintor pintor);

	public void eliminarPorId(Integer id);

	public Pintor seleccionarPorId(Integer id);

	public List<Pintor> seleccionarInnerJoin();

	public List<Pintor> seleccionarOuterLeftJoin();

	public List<Pintor> seleccionarOuterRightJoin();

	public List<Obra> seleccionarHabitacionOuterLefttJoin();

	public List<Pintor> seleccionarOuterFullJoin();

	public List<Pintor> seleccionarWhereJoin();
	
	public List<Pintor> seleccionarJoinFetch();

}
