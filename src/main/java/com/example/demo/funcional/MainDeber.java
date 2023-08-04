package com.example.demo.funcional;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MainDeber {

	private static final Logger LOG = LoggerFactory.getLogger(MainDeber.class);

	public static void main(String[] args) {

		// TAREA 16 Realizar la implementación de los métodos
		// High Order JAVA (5 ejemplos) con Métodos Referenciados
		// INTERFACES FUNCIONALES JAVA

		// LIBRERIAS FUNCIONALES DE JAVA CON METODOS REFERENCIADOS
		// HACER MEDIANTE METODOS REFERENCIADOS
		// SUPLIER
		Stream<String> listaSup = Stream.generate(MetodosReferenciados::getIdReferencial)
				.map(s -> s.substring(0, Math.min(s.length(), 3))).limit(2);
		// SOLO IMPRIME LAS TRES PRIMERAS LETRAS DE MI ARREGLO
		listaSup.forEachOrdered(cad -> LOG.info("SUPPLIER:" + cad));

		// CONSUMMER
		Stream<String> stream = Stream.of("1.2", "2.5", "3.1", "4.4", "5.9");
		Stream<Double> streamInteger = stream.map(Double::parseDouble);
		streamInteger.forEach(MetodosReferenciados::aceptarReferencial);

		// PREDICATE
		Stream<String> streamletra = Stream.of("casa", "perro", "ave", "null");
		Stream<String> existeletra = streamletra.filter(MetodosReferenciados::evaluacionReferencial);
		existeletra.forEach(palabra -> LOG.info("PREDICATE: Existe " + palabra));

		// FUNCTION
		List<Integer> listaNum = Arrays.asList(44, 99, 54, 63, 30);
		Stream<String> cambio = listaNum.stream().map(MetodosReferenciados::aplicarReferencial);
		cambio.forEach(MetodosReferenciados::aceptar);

		// UNARYOPERATION
		List<String> latam = Arrays.asList("Ecuador", "Argentina", "Peru", "Colombia", "Venezuela");
		Stream<String> paislatam = latam.stream().map(MetodosReferenciados::aplicarUnaryReferencial);
		paislatam.forEach(p -> LOG.info("U_O: " + p));

		
		
		/*
		// 1.-Supplier
		Stream<String> lista = Stream.generate(() -> "123456789").limit(10);
		lista.forEach(cadena -> LOG.info(cadena));

		// 2.-Consummer
		List<Integer> listaNumero = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13);
		listaNumero.forEach(cadena -> LOG.info("Consummer JAVA " + cadena));

		// 3.-Predicate
		Stream<Integer> listaFinal = listaNumero.stream().filter(numero -> numero >= 5);
		listaFinal.forEach(numero -> LOG.info("Valor :" + numero));

		// 4.- Function
		Stream<String> listaCambiada = listaNumero.stream().map(numero -> {
			Integer num = 10;
			num = numero + num;
			return "N:" + num;
		});
		listaCambiada.forEach(numero -> LOG.info(numero));
		// Stream<String>listaCambiada = listaNumero.stream().filter(numero
		// ->numero>=5).map(numero ->"N:"+numero);
		// listaCambiada.forEach(numero -> LOG.info(numero));

		// 5.-Unary Operator
		Stream<Integer> listaCambiada2 = listaNumero.stream().map(numero -> {
			Integer num = 10;
			num = numero + num;
			return num;
		});

		listaCambiada2.forEach(numero -> LOG.info("U_O:" + numero));
*/
		/*
		 * // FUNCTION LOG.
		 * info("FUNCTION ****************************************************************"
		 * ); Stream<String> listaCambiada22 =
		 * listaNumero.stream().map(MetodosReferenciados::aplicar);
		 * listaCambiada.forEach(MetodosReferenciados::aceptar);
		 * 
		 */

		/*
		 * // TAREA 17:Metodos High Order para Predicate, Function y UnaryOperator
		 * IPersonaSupplier<String> pSupplier = new PersonaSupplierImpl(); MetHO ho =
		 * new MetHO();
		 * 
		 * System.out.println("1.-SUPPLIER*******************************"); // CLASE
		 * MetHO.metSupplier(pSupplier); // LAMBDA MetHO.metSupplier(() ->
		 * "Estoy vivo"); // REFERENCIADO
		 * MetHO.metSupplier(MetodosReferenciados::getIdHO);
		 * 
		 * System.out.println("2.-CONSUMMER*******************************"); //
		 * ******************************* IPersonaConsumer<String> pConsummer = new
		 * PersonaConsumerImpl(); // CLASE MetHO.metConsummer(pConsummer,
		 * "ejemplo de Consummer"); // LAMBDA MetHO.metConsummer(cadena ->
		 * LOG.info("Consumer" + cadena), "Lambda"); // REFERENCIADO
		 * MetHO.metConsummer(MetodosReferenciados::aceptar, "1.- ");
		 * 
		 * // *******************************
		 * System.out.println("3.-PREDICATE*******************************");
		 * 
		 * IPersonaPredicate<Integer> pPredicate = new PersonaPredicate(); // CLASE
		 * LOG.info("" + MetHO.metPredicate(pPredicate)); // LAMBDA LOG.info("" +
		 * MetHO.metPredicate(num -> (num + 8) > 5)); // REFERENCIADO LOG.info("" +
		 * MetHO.metPredicate(MetodosReferenciados::evaluacion));
		 * 
		 * System.out.println("4.-FUNCTION*******************************");
		 * IPersonaFunction<String, Integer> function = new PersonaFunction(); // CLASE
		 * LOG.info(MetHO.metFunction(function)); //LAMBDA LOG.info(MetHO.metFunction(
		 * numero ->{ String valorF = numero.toString().concat("_Rivas"); return valorF;
		 * })); //REFERENCIADO
		 * LOG.info(MetHO.metFunction(MetodosReferenciados::aplicar));
		 * 
		 * System.out.println("5.-UNARY OPERATION*******************************");
		 * IPersonaUnaryOperator<Integer> iPersonaUnaryOperator= new PersonaUnary();
		 * //CLASE LOG.info(""+MetHO.metUnaryF(iPersonaUnaryOperator)); //LAMBDA
		 * LOG.info(""+MetHO.metUnaryF(num ->{ Integer numA=100, numB=50; return
		 * num=(numA/numB); })); //REFERENCIADO
		 * LOG.info(""+MetHO.metUnaryF(MetodosReferenciados::aplicarUO));
		 */

	}

}
