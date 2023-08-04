package com.example.demo.funcional;

import java.util.stream.Stream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MetHO {
	private static final Logger LOG = LoggerFactory.getLogger(MetHO.class);

	public static void metSupplier(IPersonaSupplier<String> funcion) { // En este metodo recibe una interfaz como argumento

		LOG.info("LLamado con HO " + funcion.getId());

	}

	public static void metConsummer(IPersonaConsumer<String> funcion, String t) {

		// String test = "Ejemplo";
		LOG.info("HO Consummer Deber");
		funcion.accept(t);
	}
	
	public static boolean metPredicate(IPersonaPredicate<Integer> funcion) {
		
		
		return funcion.evaluar(20);
	}
	
	public static String metFunction(IPersonaFunction<String, Integer> funcion) {
		
		return funcion.aplicar(777);
	}
	
	public static Integer metUnaryF(IPersonaUnaryOperator<Integer> funcion) {
		
		return funcion.aplicar(6);
	}
	
	//------------------METODOS PARA INTERFACES PROPIAS DE JAVA
	

}
