package com.example.demo.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Arquitecto;
import com.example.demo.repository.modelo.Habitacion;
import com.example.demo.repository.modelo.Hotel;
import com.example.demo.repository.modelo.Obra;
import com.example.demo.repository.modelo.Pintor;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class PintorRepositoryImpl implements PintorRepository {
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void ingresar(Pintor pintor) {
		// TODO Auto-generated method stub
		this.entityManager.persist(pintor);
	}

	@Override
	public void actualizar(Pintor pintor) {
		// TODO Auto-generated method stub
		this.entityManager.merge(pintor);
	}

	@Override
	public void eliminarPorId(Integer id) {
		// TODO Auto-generated method stub
		Pintor pintor = this.seleccionarPorId(id);
		this.entityManager.remove(pintor);
	}

	@Override
	public Pintor seleccionarPorId(Integer id) {
		// TODO Auto-generated method stub
		Pintor pintor =  this.entityManager.find(Pintor.class, id);

        //System.out.println("Numero de habitaciones: "+hotel.getHabitaciones().size());

        return pintor;
	}
	
	@Override
	public List<Pintor> seleccionarInnerJoin() {
		// TODO Auto-generated method stub
		//SELECT * FROM hotel h FULL OUTER JOIN habitacion ha on h.htl_id = ha.habi_id_hotel
		//SELECT h FROM Hotel h JOIN h.habitaciones ha 
		TypedQuery<Pintor> myQuery = this.entityManager.createQuery("SELECT p FROM Pintor p  INNER JOIN p.obras o", Pintor.class);
		return myQuery.getResultList();
	}

	
	@Override
	public List<Pintor> seleccionarOuterLeftJoin() {
		// TODO Auto-generated method stub
		TypedQuery<Pintor> myQuery = this.entityManager.createQuery("SELECT p FROM Pintor p LEFT JOIN p.obras o", Pintor.class);
		return myQuery.getResultList();
	}

	@Override
	public List<Pintor> seleccionarOuterRightJoin() {
		// TODO Auto-generated method stub
		TypedQuery<Pintor> myQuery = this.entityManager.createQuery("SELECT p FROM Pintor p RIGHT JOIN p.obras o", Pintor.class);
		return myQuery.getResultList();
	}


	@Override
	public List<Obra> seleccionarHabitacionOuterLefttJoin() {
		// TODO Auto-generated method stub
		TypedQuery<Obra> myQuery = this.entityManager.createQuery("SELECT o FROM Pintor p LEFT JOIN p.obras o", Obra.class);
		return myQuery.getResultList();
	}


	@Override
	public List<Pintor> seleccionarOuterFullJoin() {
		// TODO Auto-generated method stub
		TypedQuery<Pintor> myQuery = this.entityManager.createQuery("SELECT p FROM Pintor p FULL JOIN p.obras o", Pintor.class);
		return myQuery.getResultList();
	}


	@Override
	public List<Pintor> seleccionarWhereJoin() {
		// TODO Auto-generated method stub
		//Diferencia
		//SELECT h.* FROM hotel h, habitacion ha WHERE h.htl_id = ha.habi_id_hotel
		//SELECT h FROM Hotel h, Habitacion ha WHERE h = ha.hotel //Se comparan los obvjetos de Hotel y los objetod Hotel en la clase Habitacion
		TypedQuery<Pintor> myQuery = this.entityManager.createQuery("SELECT p FROM Pintor p, Obra o WHERE p = o.pintor ",Pintor.class);
		//TypedQuery<Hotel> myQuery = this.entityManager.createQuery("SELECT h FROM Hotel h, Habitacion ha WHERE h = ha.hotel",Hotel.class);
		
		return myQuery.getResultList();
	}

	@Override
	public List<Pintor> seleccionarJoinFetch() {
		TypedQuery<Pintor> myQuery = this.entityManager.createQuery("SELECT p FROM Pintor p JOIN FETCH p.obras o",
				Pintor.class);
		return myQuery.getResultList();
	}

}
