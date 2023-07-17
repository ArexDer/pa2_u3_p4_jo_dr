package com.example.demo.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Arquitecto;
import com.example.demo.repository.modelo.Hotel;
import com.example.demo.repository.modelo.ObraGris;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class ArquitectoRepositoryImpl implements ArquitectoRepository {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	
	@Override
	public void ingresar(Arquitecto arquitecto) {
		// TODO Auto-generated method stub
		this.entityManager.persist(arquitecto);
	}

	@Override
	public void actualizar(Arquitecto arquitecto) {
		// TODO Auto-generated method stub
		this.entityManager.merge(arquitecto);
	}

	@Override
	public void eliminarPorId(Integer id) {
		// TODO Auto-generated method stub
		Arquitecto arquitectoEncontrado = this.seleccionarPorId(id);
		this.entityManager.remove(arquitectoEncontrado);
	}

	@Override
	public Arquitecto seleccionarPorId(Integer id) {
		// TODO Auto-generated method stub
		Arquitecto arquitecto =  this.entityManager.find(Arquitecto.class, id);

        System.out.println("Numero de habitaciones: "+arquitecto.getObraGris().size());

        return arquitecto;
	}
	
	@Override
	public List<Arquitecto> seleccionarInnerJoin() {
		// TODO Auto-generated method stub
		//SELECT * FROM hotel h FULL OUTER JOIN habitacion ha on h.htl_id = ha.habi_id_hotel
		//SELECT h FROM Hotel h JOIN h.habitaciones ha 
		TypedQuery<Arquitecto> myQuery = this.entityManager.createQuery("SELECT a FROM Arquitecto a  INNER JOIN a.obraGris og", Arquitecto.class);
		return myQuery.getResultList();
	}

	
	@Override
	public List<Arquitecto> seleccionarOuterLeftJoin() {
		// TODO Auto-generated method stub
		TypedQuery<Arquitecto> myQuery = this.entityManager.createQuery("SELECT a FROM Arquitecto a LEFT JOIN a.obraGris og", Arquitecto.class);
		return myQuery.getResultList();
	}

	@Override
	public List<Arquitecto> seleccionarOuterRightJoin() {
		// TODO Auto-generated method stub
		TypedQuery<Arquitecto> myQuery = this.entityManager.createQuery("SELECT a FROM Arquitecto a RIGHT JOIN a.obraGris og", Arquitecto.class);
		return myQuery.getResultList();
	}


	@Override
	public List<ObraGris> seleccionarHabitacionOuterLefttJoin() {
		// TODO Auto-generated method stub
		TypedQuery<ObraGris> myQuery = this.entityManager.createQuery("SELECT ob FROM Arquitecto a LEFT JOIN a.obraGris ob", ObraGris.class);
		return myQuery.getResultList();
	}


	@Override
	public List<Arquitecto> seleccionarOuterFullJoin() {
		// TODO Auto-generated method stub
		TypedQuery<Arquitecto> myQuery = this.entityManager.createQuery("SELECT a FROM Arquitecto a FULL JOIN a.obraGris og", Arquitecto.class);
		return myQuery.getResultList();
	}


	@Override
	public List<Arquitecto> seleccionarWhereJoin() {
		// TODO Auto-generated method stub
		//Diferencia
		//SELECT h.* FROM hotel h, habitacion ha WHERE h.htl_id = ha.habi_id_hotel
		//SELECT h FROM Hotel h, Habitacion ha WHERE h = ha.hotel //Se comparan los obvjetos de Hotel y los objetod Hotel en la clase Habitacion
		TypedQuery<Arquitecto> myQuery = this.entityManager.createQuery("SELECT a FROM Arquitecto a, ObraGris og WHERE a = og.arquitecto",Arquitecto.class);
		
		return myQuery.getResultList();
	}

	@Override
	public List<Arquitecto> seleccionarJoinFetch() {
		// TODO Auto-generated method stub
		TypedQuery<Arquitecto> myQuery = this.entityManager.createQuery("SELECT a FROM Arquitecto a JOIN FETCH a.obraGris og",
				Arquitecto.class);
		return myQuery.getResultList();
	}

	

}
