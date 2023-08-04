package com.example.demo.funcional;

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

	// Consumer
	public static void aceptar(String arg) {

		String cadena = "Deber";
		LOG.info(cadena + " " + arg);

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

	// Function
	public static String aplicar(Integer arg) {

		return arg.toString().concat("= INTEGER:"+arg+ " a STRING:");
	}

	// Unary Op
	public static String aplicarUnary(String arg) {

		String cad = "Mi nombre es: ";

		return cad.concat(arg);
	}
	
	//UNARY OPERATOR
		public static Integer aplicarUO(Integer arg) {
			return arg * 5;
		}

}
