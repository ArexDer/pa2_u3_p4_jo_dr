package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.ArquitectoRepository;
import com.example.demo.repository.modelo.Arquitecto;
import com.example.demo.repository.modelo.ObraGris;

@Service
public class ArquitectoServiceImpl implements ArquitectoService {
	
	@Autowired
	private ArquitectoRepository arquitectoRepository;
	
	
	@Override
	public void agregar(Arquitecto arquitecto) {
		// TODO Auto-generated method stub
		this.arquitectoRepository.ingresar(arquitecto);
	}

	@Override
	public void actualizar(Arquitecto arquitecto) {
		// TODO Auto-generated method stub
		this.arquitectoRepository.actualizar(arquitecto);
	}

	@Override
	public void borrarPorId(Integer id) {
		// TODO Auto-generated method stub
		this.arquitectoRepository.eliminarPorId(id);
	}

	@Override
	public Arquitecto buscarPorId(Integer id) {
		// TODO Auto-generated method stub
		return this.arquitectoRepository.seleccionarPorId(id);
	}


	@Override
	public List<Arquitecto> listarInnerJoin() {
		// TODO Auto-generated method stub
		return this.arquitectoRepository.seleccionarInnerJoin();
	}

	@Override
	public List<Arquitecto> listarLeftJoin() {
		// TODO Auto-generated method stub
		return this.arquitectoRepository.seleccionarOuterLeftJoin();
	}

	@Override
	public List<Arquitecto> listarRightJoin() {
		// TODO Auto-generated method stub
		return this.arquitectoRepository.seleccionarOuterRightJoin();
	}

	@Override
	public List<ObraGris> listarHabitacionOuterLefttJoin() {
		// TODO Auto-generated method stub
		return this.arquitectoRepository.seleccionarHabitacionOuterLefttJoin();
	}

	@Override
	public List<Arquitecto> listarOuterFullJoin() {
		// TODO Auto-generated method stub
		return this.arquitectoRepository.seleccionarOuterFullJoin();
	}

	@Override
	public List<Arquitecto> listarWhereJoin() {
		// TODO Auto-generated method stub
		return this.arquitectoRepository.seleccionarWhereJoin();
	}

	@Override
	public List<Arquitecto> listarJoinFetch() {
		// TODO Auto-generated method stub
		return this.arquitectoRepository.seleccionarJoinFetch();
	}
	


}
