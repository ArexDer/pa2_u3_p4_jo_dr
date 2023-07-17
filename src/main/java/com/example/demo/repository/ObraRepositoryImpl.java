package com.example.demo.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Habitacion;
import com.example.demo.repository.modelo.Obra;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class ObraRepositoryImpl implements ObraRepository {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	
	@Override
	public void ingresar(Obra obra) {
		// TODO Auto-generated method stub
		this.entityManager.persist(obra);
	}

	@Override
	public void actualizar(Obra obra) {
		// TODO Auto-generated method stub
		this.entityManager.merge(obra);
	}

	@Override
	public void eliminarPorId(Integer id) {
		// TODO Auto-generated method stub
		Obra obra = this.seleccionarPorId(id);
		this.entityManager.remove(obra);
	}

	@Override
	public Obra seleccionarPorId(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Obra.class, id);
	}


}
