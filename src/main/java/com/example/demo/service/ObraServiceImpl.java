package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.HabitacionRepository;
import com.example.demo.repository.ObraRepository;
import com.example.demo.repository.modelo.Habitacion;
import com.example.demo.repository.modelo.Obra;

@Service
public class ObraServiceImpl implements ObraService {

	@Autowired
	private ObraRepository obraRepository;
	
	@Override
	public void agregar(Obra obra) {
		// TODO Auto-generated method stub
		this.obraRepository.ingresar(obra);
	}

	@Override
	public void actualizar(Obra obra) {
		// TODO Auto-generated method stub
		this.obraRepository.actualizar(obra);
	}

	@Override
	public void borrarPorId(Integer id) {
		// TODO Auto-generated method stub
		this.obraRepository.eliminarPorId(id);
	}

	@Override
	public Obra buscarPorId(Integer id) {
		// TODO Auto-generated method stub
		return this.obraRepository.seleccionarPorId(id);
	}
	

}
