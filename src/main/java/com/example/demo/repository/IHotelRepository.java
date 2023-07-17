package com.example.demo.repository;

import java.util.List;

import com.example.demo.repository.modelo.Habitacion;
import com.example.demo.repository.modelo.Hotel;

public interface IHotelRepository {
	
	
public void ingresar(Hotel hotel);
	
	public void actualizar(Hotel habitacion);
	
	public void eliminarPorId(Integer id);
	
	public Hotel seleccionarPorId(Integer id);
	
public List<Hotel> seleccionarInnerJoin();
	
	public List<Hotel> seleccionarOuterLeftJoin();
	
	public List<Hotel> seleccionarOuterRightJoin();
	
	public List<Habitacion> seleccionarHabitacionOuterLefttJoin();
	
	public List<Hotel> seleccionarOuterFullJoin();
	
	public List<Hotel> seleccionarWhereJoin();
}
