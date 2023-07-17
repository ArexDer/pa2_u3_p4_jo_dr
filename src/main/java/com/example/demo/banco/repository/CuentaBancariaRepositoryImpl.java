package com.example.demo.banco.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.banco.repository.modelo.CuentaBancaria;
import com.example.demo.repository.modelo.Arquitecto;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class CuentaBancariaRepositoryImpl implements CuentaBancariaRepository{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void ingresar(CuentaBancaria cuentaBancaria) {
		// TODO Auto-generated method stub
		this.entityManager.persist(cuentaBancaria);
		
	}

	@Override
	public void actualizar(CuentaBancaria cuentaBancaria) {
		// TODO Auto-generated method stub
		this.entityManager.merge(cuentaBancaria);
	}

	@Override
	public void eliminarPorId(Integer id) {
		// TODO Auto-generated method stub
		CuentaBancaria bancaria = this.seleccionarPorId(id);
		this.entityManager.remove(bancaria);
	}

	@Override
	public CuentaBancaria seleccionarPorId(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(CuentaBancaria.class, id);
	}

	@Override
	public CuentaBancaria buscarporNumeroCuenta(String num) {
		/*
		TypedQuery<Arquitecto> myQuery = this.entityManager.createQuery("SELECT p FROM Propietario p JOIN FETCH p.numero og",
				CuentaBancaria.class);
		return myQuery.getResultList();
		*/
		TypedQuery<CuentaBancaria> myQuery = this.entityManager
				.createQuery("SELECT cta FROM CuentaBancaria cta WHERE cta.numero = :datoNumero", CuentaBancaria.class);
		myQuery.setParameter("datoNumero", num);
		return myQuery.getSingleResult();
		
		
	}

}
