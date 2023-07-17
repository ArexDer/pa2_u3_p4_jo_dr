package com.example.demo.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Habitacion;
import com.example.demo.repository.modelo.Hotel;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class HotelRepositoryImpl implements IHotelRepository{

	@PersistenceContext
	private EntityManager entityManager;
	
	
	
	@Override
	public void ingresar(Hotel hotel) {
		// TODO Auto-generated method stub
		this.entityManager.persist(hotel);
	}

	@Override
	public void actualizar(Hotel hotel) {
		// TODO Auto-generated method stub
		this.entityManager.merge(hotel);
	}

	@Override
	public void eliminarPorId(Integer id) {
		// TODO Auto-generated method stub
		Hotel hotelEncontrado = this.seleccionarPorId(id);
		this.entityManager.remove(hotelEncontrado);
	}

	@Override
	public Hotel seleccionarPorId(Integer id) {
		// TODO Auto-generated method stub
		Hotel hotel =  this.entityManager.find(Hotel.class, id);

        System.out.println("Numero de habitaciones: "+hotel.getHabitaciones().size());

        return hotel;
	}
	
	@Override
	public List<Hotel> seleccionarInnerJoin() {
		// TODO Auto-generated method stub
		//SELECT * FROM hotel h FULL OUTER JOIN habitacion ha on h.htl_id = ha.habi_id_hotel
		//SELECT h FROM Hotel h JOIN h.habitaciones ha 
		TypedQuery<Hotel> myQuery = this.entityManager.createQuery("SELECT h FROM Hotel h  INNER JOIN h.habitaciones ha", Hotel.class);
		return myQuery.getResultList();
	}

	
	@Override
	public List<Hotel> seleccionarOuterLeftJoin() {
		// TODO Auto-generated method stub
		TypedQuery<Hotel> myQuery = this.entityManager.createQuery("SELECT h FROM Hotel h LEFT JOIN h.habitaciones ha", Hotel.class);
		return myQuery.getResultList();
	}

	@Override
	public List<Hotel> seleccionarOuterRightJoin() {
		// TODO Auto-generated method stub
		TypedQuery<Hotel> myQuery = this.entityManager.createQuery("SELECT h FROM Hotel h RIGHT JOIN h.habitaciones ha", Hotel.class);
		return myQuery.getResultList();
	}


	@Override
	public List<Habitacion> seleccionarHabitacionOuterLefttJoin() {
		// TODO Auto-generated method stub
		TypedQuery<Habitacion> myQuery = this.entityManager.createQuery("SELECT ha FROM Hotel h LEFT JOIN h.habitaciones ha", Habitacion.class);
		return myQuery.getResultList();
	}


	@Override
	public List<Hotel> seleccionarOuterFullJoin() {
		// TODO Auto-generated method stub
		TypedQuery<Hotel> myQuery = this.entityManager.createQuery("SELECT h FROM Hotel h FULL JOIN h.habitaciones ha", Hotel.class);
		return myQuery.getResultList();
	}


	@Override
	public List<Hotel> seleccionarWhereJoin() {
		// TODO Auto-generated method stub
		//Diferencia
		//SELECT h.* FROM hotel h, habitacion ha WHERE h.htl_id = ha.habi_id_hotel
		//SELECT h FROM Hotel h, Habitacion ha WHERE h = ha.hotel //Se comparan los obvjetos de Hotel y los objetod Hotel en la clase Habitacion
		TypedQuery<Hotel> myQuery = this.entityManager.createQuery("SELECT h FROM Hotel h, Habitacion ha WHERE h = ha.hotel",Hotel.class);
		
		return myQuery.getResultList();
	}

}
