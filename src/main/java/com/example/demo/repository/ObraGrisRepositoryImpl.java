package com.example.demo.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Habitacion;
import com.example.demo.repository.modelo.ObraGris;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class ObraGrisRepositoryImpl implements ObraGrisRepository{
	
	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void ingresar(ObraGris obraGris) {
		// TODO Auto-generated method stub
		this.entityManager.persist(obraGris);
	}

	@Override
	public void actualizar(ObraGris obraGris) {
		// TODO Auto-generated method stub
		this.entityManager.merge(obraGris);
	}

	@Override
	public void eliminarPorId(Integer id) {
		// TODO Auto-generated method stub
		ObraGris obraGrisEncontrada = this.seleccionarPorId(id);
		this.entityManager.remove(obraGrisEncontrada);
	}

	@Override
	public ObraGris seleccionarPorId(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(ObraGris.class, id);
	}
	

}
