package com.example.demo.banco.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.banco.repository.modelo.Propietario;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class PropietarioRepositoryImpl implements PropietarioRepository {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void ingresar(Propietario propietario) {
		// TODO Auto-generated method stub
		this.entityManager.persist(propietario);
	}

	@Override
	public void actualizar(Propietario propietario) {
		// TODO Auto-generated method stub
		this.entityManager.merge(propietario);
	}

	@Override
	public void eliminarPorId(Integer id) {
		// TODO Auto-generated method stub
		Propietario propietario = this.seleccionarPorId(id);
		this.entityManager.remove(propietario);
	}

	@Override
	public Propietario seleccionarPorId(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Propietario.class, id);
	}

}
