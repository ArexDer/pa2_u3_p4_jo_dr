package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.demo.repository.PintorRepository;
import com.example.demo.repository.modelo.Obra;
import com.example.demo.repository.modelo.Pintor;

@Service
public class PintorServiceImpl implements PintorService {
	
	
	@Autowired
	private PintorRepository pintorRepository;
	
	
	
	
	@Override
	public void agregar(Pintor pintor) {
		// TODO Auto-generated method stub
		this.pintorRepository.ingresar(pintor);
	}

	@Override
	public void actualizar(Pintor pintor) {
		// TODO Auto-generated method stub
		this.pintorRepository.actualizar(pintor);
	}

	@Override
	public void borrarPorId(Integer id) {
		// TODO Auto-generated method stub
		this.pintorRepository.eliminarPorId(id);
	}

	@Override
	public Pintor buscarPorId(Integer id) {
		// TODO Auto-generated method stub
		return this.pintorRepository.seleccionarPorId(id);
	}


	@Override
	public List<Pintor> listarInnerJoin() {
		// TODO Auto-generated method stub
		return this.pintorRepository.seleccionarInnerJoin();
	}

	@Override
	public List<Pintor> listarLeftJoin() {
		// TODO Auto-generated method stub
		return this.pintorRepository.seleccionarOuterLeftJoin();
	}

	@Override
	public List<Pintor> listarRightJoin() {
		// TODO Auto-generated method stub
		return this.pintorRepository.seleccionarOuterRightJoin();
	}

	@Override
	public List<Obra> listarHabitacionOuterLefttJoin() {
		// TODO Auto-generated method stub
		return this.pintorRepository.seleccionarHabitacionOuterLefttJoin();
	}

	@Override
	public List<Pintor> listarOuterFullJoin() {
		// TODO Auto-generated method stub
		return this.pintorRepository.seleccionarOuterFullJoin();
	}

	@Override
	public List<Pintor> listarWhereJoin() {
		// TODO Auto-generated method stub
		return this.pintorRepository.seleccionarWhereJoin();
	}

	@Override
	public List<Pintor> listarJoinFetch() {
		// TODO Auto-generated method stub
		return this.pintorRepository.seleccionarJoinFetch();
	}

}
