package com.example.demo.banco.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.banco.repository.PropietarioRepository;
import com.example.demo.banco.repository.modelo.Propietario;

@Service
public class PropietarioServiceImpl implements PropietarioService {
	
	@Autowired
	private PropietarioRepository propietarioRepository;

	@Override
	public void agregar(Propietario propietario) {
		// TODO Auto-generated method stub
		this.propietarioRepository.ingresar(propietario);
		
	}

	@Override
	public void actualizar(Propietario propietario) {
		// TODO Auto-generated method stub
		this.propietarioRepository.actualizar(propietario);
	}

	@Override
	public void borrarPorId(Integer id) {
		// TODO Auto-generated method stub
		this.propietarioRepository.eliminarPorId(id);
	}

	@Override
	public Propietario seleccionarPorId(Integer id) {
		// TODO Auto-generated method stub
		return this.propietarioRepository.seleccionarPorId(id);
	}

}
