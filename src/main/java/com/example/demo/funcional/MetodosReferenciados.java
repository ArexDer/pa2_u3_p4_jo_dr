package com.example.demo.funcional;

import java.util.stream.Stream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MetodosReferenciados {

	private static final Logger LOG = LoggerFactory.getLogger(MetodosReferenciados.class);

	// Contratro Supplier
	public static Integer getId() {

		return 8;
	}

	// SUPPLIER 2
	// Supplier
	public static String getIdHO() {

		LOG.info("Metodos Referenciados y HO");
		return "Deber";
	}
	
	//SUPLIER TAREA 16
	public static String getIdReferencial() {

		return "Fruta";
	}

	// Consumer
	public static void aceptar(String arg) {

		String cadena = "Deber";
		LOG.info(cadena + " " + arg);

	}
	// TAREA 16 Consumer
		public static void aceptarReferencial(Double arg) {

			Double operacion =(100/50)+arg;
			LOG.info(""+operacion);

		}

	// Predicate
	public static boolean evaluacion(Integer arg) {
		Integer numero = 10;
		boolean cumple = false;

		if (numero.compareTo(arg) == 0) {

			cumple = true;
		}

		return cumple;
	}
	
	// TAREA 16 Predicate
		public static boolean evaluacionReferencial(String arg) {
			String op1 = "ave";
			String op2 = "casa";
			
			boolean cumple = false;

			if (arg.contains(op2)||arg.contains(op1)) {

				cumple = true;
			}

			return cumple;
		}

	// Function
	public static String aplicar(Integer arg) {

		return arg.toString().concat("= INTEGER:"+arg+ " a STRING:");
	}
	
	// TAREA 16 Function
		public static String aplicarReferencial(Integer arg) {
			Double num = arg*0.12;
			

			return num.toString().concat("Cambio -> <-");
		}

	// Unary Op
	public static String aplicarUnary(String arg) {

		String cad = "Mi nombre es: ";

		return cad.concat(arg);
	}
	
	// TAREA 16 Unary Op
		public static String aplicarUnaryReferencial(String arg) {

			String cad = " PAIS DE LATAM: ";

			return cad.concat(arg);
		}
	
	//UNARY OPERATOR
		public static Integer aplicarUO(Integer arg) {
			return arg * 5;
		}

}
