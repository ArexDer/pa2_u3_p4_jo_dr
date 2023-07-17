package com.example.demo;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.repository.modelo.Arquitecto;
import com.example.demo.repository.modelo.Obra;
import com.example.demo.repository.modelo.ObraGris;
import com.example.demo.repository.modelo.Pintor;
import com.example.demo.service.ArquitectoService;
import com.example.demo.service.PintorService;
//
@SpringBootApplication
public class Pa2U3P4JoDrApplication implements CommandLineRunner {

	// @Autowired
	// private HotelService hotelService;

	@Autowired
	private PintorService pintorService;

	@Autowired
	private ArquitectoService arquitectoService;

	public static void main(String[] args) {
		SpringApplication.run(Pa2U3P4JoDrApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		// tarea con las JPQL
		/*
		 * Pintor pin = new Pintor(); pin.setNombre("Andres"); pin.setApellido("Baldo");
		 * pin.setEdad("44"); pin.setNacionalidad("Ecuatoriano");
		 * 
		 * Obra obra = new Obra(); obra.setEstilo("Carbon");
		 * obra.setNombre("Paisaje 1"); obra.setPrecio(new BigDecimal(145.44));
		 * obra.setFechaDeCreacion(LocalDate.now()); obra.setPintor(pin);
		 * 
		 * Pintor pin2 = new Pintor(); pin2.setNombre("Paco");
		 * pin2.setApellido("Paredes"); pin2.setEdad("33");
		 * pin2.setNacionalidad("Ecuatoriano");
		 * 
		 * Obra obra2 = new Obra(); obra2.setEstilo("Pincel"); obra2.setNombre("Nubes");
		 * obra2.setPrecio(new BigDecimal(100.44));
		 * obra2.setFechaDeCreacion(LocalDate.now()); obra2.setPintor(pin2);
		 * 
		 * Pintor pin3 = new Pintor(); pin3.setNombre("Marco");
		 * pin3.setApellido("Pilta"); pin3.setEdad("62");
		 * pin3.setNacionalidad("Ecuatoriano");
		 * 
		 * Obra obra3 = new Obra(); obra3.setEstilo("Libre");
		 * obra3.setNombre("Cuadro Monterey"); obra3.setPrecio(new BigDecimal(33.99));
		 * obra3.setFechaDeCreacion(LocalDate.now()); obra3.setPintor(pin3);
		 * 
		 * 
		 * Pintor pin4 = new Pintor(); pin4.setNombre("Andrea");
		 * pin4.setApellido("Bastidas"); pin4.setEdad("36");
		 * pin4.setNacionalidad("Ecuatoriano");
		 * 
		 * Obra obra4 = new Obra(); obra4.setEstilo("Multiestilo");
		 * obra4.setNombre("Bella"); obra4.setPrecio(new BigDecimal(21.00));
		 * obra4.setFechaDeCreacion(LocalDate.now()); obra4.setPintor(pin4);
		 * 
		 * Pintor pin5 = new Pintor(); pin5.setNombre("Alexander");
		 * pin5.setApellido("Cabo"); pin5.setEdad("55");
		 * pin5.setNacionalidad("Ecuatoriano");
		 * 
		 * Obra obra5 = new Obra(); obra5.setEstilo("Carbon");
		 * obra5.setNombre("Atardecer"); obra5.setPrecio(new BigDecimal(235.55));
		 * obra5.setFechaDeCreacion(LocalDate.now()); obra5.setPintor(pin5);
		 * 
		 * 
		 * List<Obra> obrasPintor1 = new ArrayList<>(); obrasPintor1.add(obra);
		 * 
		 * List<Obra> obrasPintor2 = new ArrayList<>(); obrasPintor2.add(obra2);
		 * 
		 * List<Obra> obrasPintor3 = new ArrayList<>(); obrasPintor3.add(obra3);
		 * 
		 * List<Obra> obrasPintor4 = new ArrayList<>(); obrasPintor4.add(obra4);
		 * 
		 * List<Obra> obrasPintor5 = new ArrayList<>(); obrasPintor5.add(obra5);
		 * 
		 * pin.setObras(obrasPintor1); pin2.setObras(obrasPintor2);
		 * pin3.setObras(obrasPintor3); pin4.setObras(obrasPintor4);
		 * pin5.setObras(obrasPintor5);
		 * 
		 * this.pintorService.agregar(pin); this.pintorService.agregar(pin2);
		 * this.pintorService.agregar(pin3); this.pintorService.agregar(pin4);
		 * this.pintorService.agregar(pin5);
		 */
		// 1
		System.out.println("\nEJEMPLO 1: CON PINTOR Y OBRAS ARTISTICAS");
		System.out.println("\nJOIN");
		System.out.println("\nInner Join");
		System.out.println(this.pintorService.listarInnerJoin());

		// 2
		System.out.println("\nOUTER JOIN");
		System.out.println("\nLeft Join");
		System.out.println(this.pintorService.listarLeftJoin());
		// 3
		System.out.println("\nRight Join");
		System.out.println(this.pintorService.listarRightJoin());

		System.out.println("\nLeft Join");
		System.out.println(this.pintorService.listarHabitacionOuterLefttJoin());
		// 4
		System.out.println("\nFULL OTHER JOIN");
		System.out.println(this.pintorService.listarOuterFullJoin());
		// 5
		System.out.println("\nWHERE JOIN");
		System.out.println(this.pintorService.listarWhereJoin());
		// 6
		System.out.println("\nJOIN FETCH");
		System.out.println(this.pintorService.listarJoinFetch());

		// ---------------SEGUNDO EJEMPLO
		/*
		 * Arquitecto arquitecto = new Arquitecto(); arquitecto.setNombre("Diego");
		 * arquitecto.setApellido("Rivas");
		 * arquitecto.setFechaNacimineto(LocalDate.of(1997, 01, 8));
		 * 
		 * Arquitecto arquitecto2 = new Arquitecto(); arquitecto2.setNombre("Mateo");
		 * arquitecto2.setApellido("Pujas");
		 * arquitecto2.setFechaNacimineto(LocalDate.of(1999, 11, 13));
		 * 
		 * Arquitecto arquitecto3 = new Arquitecto(); arquitecto3.setNombre("Pamela");
		 * arquitecto3.setApellido("Rivadeneira");
		 * arquitecto3.setFechaNacimineto(LocalDate.of(2000, 05, 19));
		 * 
		 * 
		 * ObraGris obrag = new ObraGris(); obrag.setNombre("Edificio1");
		 * obrag.setDireccion("Ilalo"); obrag.setFechaInicio(LocalDate.now());
		 * obrag.setArquitecto(arquitecto);
		 * 
		 * ObraGris obrag2 = new ObraGris(); obrag2.setNombre("Edificio 2");
		 * obrag2.setDireccion("Marta B"); obrag2.setFechaInicio(LocalDate.now());
		 * obrag2.setArquitecto(arquitecto);
		 * 
		 * ObraGris obrag3 = new ObraGris(); obrag3.setNombre("Edificio 3");
		 * obrag3.setDireccion("Arequipa"); obrag3.setFechaInicio(LocalDate.now());
		 * obrag3.setArquitecto(arquitecto);
		 * 
		 * ObraGris obrag4 = new ObraGris(); obrag4.setNombre("Monumento");
		 * obrag4.setDireccion("Av Ibarra"); obrag4.setFechaInicio(LocalDate.now());
		 * obrag4.setArquitecto(arquitecto);
		 * 
		 * ObraGris obrag5 = new ObraGris(); obrag5.setNombre("Biblioteca G");
		 * obrag5.setDireccion("Angamarca"); obrag5.setFechaInicio(LocalDate.now());
		 * obrag5.setArquitecto(arquitecto);
		 * 
		 * List<ObraGris> obrasN = new ArrayList<>(); obrasN.add(obrag);
		 * 
		 * List<ObraGris> obras2 = new ArrayList<>(); obras2.add(obrag2);
		 * obras2.add(obrag3); obras2.add(obrag4);
		 * 
		 * List<ObraGris> obras3 = new ArrayList<>(); obras3.add(obrag5);
		 * 
		 * arquitecto.setObraGris(obrasN); arquitecto2.setObraGris(obras2);
		 * arquitecto3.setObraGris(obras3);
		 * 
		 * this.arquitectoService.agregar(arquitecto);
		 * this.arquitectoService.agregar(arquitecto2);
		 * this.arquitectoService.agregar(arquitecto3);
		 */
		// 1
		System.out.println("°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°");
		System.out.println("\nEJEMPLO 2: CON ARQUITECTO Y OBRAS DE CONSTRUCCION");
		System.out.println("\nInner Join");
		System.out.println(this.arquitectoService.listarInnerJoin());

		// 2
		System.out.println("\nOUTER JOIN");
		System.out.println("\nLeft Join");
		System.out.println(this.arquitectoService.listarLeftJoin());
		// 3
		System.out.println("\nRight Join");
		System.out.println(this.arquitectoService.listarRightJoin());

		System.out.println("\nLeft Join");
		System.out.println(this.arquitectoService.listarHabitacionOuterLefttJoin());
		// 4
		System.out.println("\nFULL OTHER JOIN");
		System.out.println(this.arquitectoService.listarOuterFullJoin());
		// 5
		System.out.println("\nWHERE JOIN");
		System.out.println(this.arquitectoService.listarWhereJoin());
		// 6
		System.out.println("\nJOIN FETCH");
		System.out.println(this.arquitectoService.listarJoinFetch());

		// insertar en la DB
		/*
		 * Hotel hotel1 = new Hotel(); hotel1.setNombre("Hotel A");
		 * hotel1.setDireccion("Galo Plaza");
		 * 
		 * Hotel hotel2 = new Hotel(); hotel2.setNombre("Hotel B");
		 * hotel2.setDireccion("Mariscal Sucre");
		 * 
		 * Hotel hotel3 = new Hotel(); hotel3.setNombre("Hotel C");
		 * hotel3.setDireccion("S23C");
		 * 
		 * Habitacion habitacion1 = new Habitacion() ; habitacion1.setNumero("1 A");
		 * habitacion1.setValor(new BigDecimal(200)); habitacion1.setHotel(hotel1);
		 * 
		 * Habitacion habitacion2 = new Habitacion() ; habitacion2.setNumero("1 B");
		 * habitacion2.setValor(new BigDecimal(100)); habitacion2.setHotel(hotel2);
		 * 
		 * Habitacion habitacion3 = new Habitacion() ; habitacion3.setNumero("1 C");
		 * habitacion3.setValor(new BigDecimal(10)); habitacion3.setHotel(hotel2);
		 * 
		 * List<Habitacion> habitacionesSimon = new ArrayList<>();
		 * habitacionesSimon.add(habitacion2); habitacionesSimon.add(habitacion3);
		 * 
		 * hotel2.setHabitaciones(habitacionesSimon);
		 * 
		 * List<Habitacion> habitacionesAmerica = new ArrayList<>();
		 * habitacionesAmerica.add(habitacion1);
		 * 
		 * hotel1.setHabitaciones(habitacionesAmerica);
		 * 
		 * this.hotelService.agregar(hotel1); this.hotelService.agregar(hotel2);
		 * this.hotelService.agregar(hotel3);
		 */

		// System.out.println("\nBuscar numero de habitaciones en hotel usando
		// FetchType.LAZY");
		// this.hotelService.buscarPorId(3).getHabitaciones();

		// -----TALLER 25
		/*
		 * System.out.println("\nInner Join");
		 * this.hotelService.listarInnerJoin().forEach(System.out::println);
		 * 
		 * System.out.println("\nLeft Join");
		 * this.hotelService.listarLeftJoin().forEach(System.out::println);
		 * 
		 * System.out.println("\nRight Join");
		 * this.hotelService.listarRightJoin().forEach(System.out::println);
		 */

		// -----TALLER 26

		/*
		 * System.out.println("\nJOIN"); System.out.println("\nInner Join");
		 * this.hotelService.listarInnerJoin().forEach(System.out::println); //
		 * System.out.println(this.hotelService.listarInnerJoin());
		 * 
		 * System.out.println("\nOUTER JOIN"); System.out.println("\nLeft Join");
		 * this.hotelService.listarLeftJoin().forEach(System.out::println);
		 * 
		 * System.out.println("\nRight Join");
		 * this.hotelService.listarRightJoin().forEach(System.out::println);
		 * 
		 * System.out.println("\nHabitacion Left Join");
		 * this.hotelService.listarHabitacionOuterLefttJoin().forEach(System.out::
		 * println);
		 * 
		 * System.out.println("\nBuscar Full outer Join");
		 * this.hotelService.listarOuterFullJoin().forEach(System.out::println);
		 * 
		 * System.out.println("\nBuscar Where Join");
		 * this.hotelService.listarWhereJoin().forEach(System.out::println);
		 */

	}

}
