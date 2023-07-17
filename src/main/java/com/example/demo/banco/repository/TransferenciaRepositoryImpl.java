package com.example.demo.banco.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.banco.repository.modelo.Transferencia;
import com.example.demo.repository.modelo.Pintor;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class TransferenciaRepositoryImpl implements TransferenciaRepository {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void ingresar(Transferencia transferencia) {
		// TODO Auto-generated method stub
		this.entityManager.persist(transferencia);
	}

	@Override
	public void actualizar(Transferencia transferencia) {
		// TODO Auto-generated method stub
		this.entityManager.merge(transferencia);
	}

	@Override
	public void eliminarPorId(Integer id) {
		// TODO Auto-generated method stub
		Transferencia transferencia = this.seleccionarPorId(id);
		this.entityManager.remove(transferencia);
	}

	@Override
	public Transferencia seleccionarPorId(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Transferencia.class, id);
	}

	@Override
	public List<Transferencia> seleccionarTransferenciasCta(String numCta) {
		//Cuando ya sabemos el retorno es mejor usar un Query TYPE
		
		TypedQuery<Transferencia> myQuery = this.entityManager
				.createQuery("SELECT trans from Transferencia trans WHERE trans.cuenta.numero = :datoCuenta", Transferencia.class);
		myQuery.setParameter("datoCuenta", numCta);
		
		return myQuery.getResultList();
		
	}

	@Override
	public List<Transferencia> reporteTotal() {
		// TODO Auto-generated method stub
		TypedQuery<Transferencia> myQuery = this.entityManager.createQuery("SELECT trans FROM Transferencia trans  JOIN trans.cuentaOrigen c", Transferencia.class);
		
		return myQuery.getResultList();
	}

}
