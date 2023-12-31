package com.example.demo.service;

import java.util.List;

import com.example.demo.repository.modelo.Habitacion;
import com.example.demo.repository.modelo.Hotel;

public interface HotelService {

	public void agregar(Hotel hotel);

	public void actualizar(Hotel habitacion);

	public void borrarPorId(Integer id);

	public Hotel buscarPorId(Integer id);

	public List<Hotel> listarInnerJoin();

	public List<Hotel> listarLeftJoin();

	public List<Hotel> listarRightJoin();

	public List<Habitacion> listarHabitacionOuterLefttJoin();

	public List<Hotel> listarOuterFullJoin();

	public List<Hotel> listarWhereJoin();
}
