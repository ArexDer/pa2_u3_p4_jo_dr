package com.example.demo.funcional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MainDeber {

	private static final Logger LOG = LoggerFactory.getLogger(MainDeber.class);

	public static void main(String[] args) {

		IPersonaSupplier<String> pSupplier = new PersonaSupplierImpl();
		MetHO ho = new MetHO();

		System.out.println("1.-SUPPLIER*******************************");
		// CLASE
		MetHO.metSupplier(pSupplier);
		// LAMBDA
		MetHO.metSupplier(() -> "Estoy vivo");
		// REFERENCIADO
		MetHO.metSupplier(MetodosReferenciados::getIdHO);

		System.out.println("2.-CONSUMMER*******************************");
		// *******************************
		IPersonaConsumer<String> pConsummer = new PersonaConsumerImpl();
		// CLASE
		MetHO.metConsummer(pConsummer, "ejemplo de Consummer");
		// LAMBDA
		MetHO.metConsummer(cadena -> LOG.info("Consumer" + cadena), "Lambda");
		// REFERENCIADO
		MetHO.metConsummer(MetodosReferenciados::aceptar, "1.- ");

		// *******************************
		System.out.println("3.-PREDICATE*******************************");

		IPersonaPredicate<Integer> pPredicate = new PersonaPredicate();
		// CLASE
		LOG.info("" + MetHO.metPredicate(pPredicate));
		// LAMBDA
		LOG.info("" + MetHO.metPredicate(num -> (num + 8) > 5));
		// REFERENCIADO
		LOG.info("" + MetHO.metPredicate(MetodosReferenciados::evaluacion));

		System.out.println("4.-FUNCTION*******************************");
		IPersonaFunction<String, Integer> function = new PersonaFunction();
		// CLASE
		LOG.info(MetHO.metFunction(function));
		//LAMBDA
		LOG.info(MetHO.metFunction( numero ->{
			String valorF = numero.toString().concat("_Rivas");
			 return valorF;
		}));
		//REFERENCIADO
		LOG.info(MetHO.metFunction(MetodosReferenciados::aplicar));
		
		System.out.println("5.-UNARY OPERATION*******************************");
		IPersonaUnaryOperator<Integer> iPersonaUnaryOperator= new PersonaUnary();
		//CLASE
		LOG.info(""+MetHO.metUnaryF(iPersonaUnaryOperator));
		//LAMBDA
		LOG.info(""+MetHO.metUnaryF(num ->{
			Integer numA=100, numB=50;
			return num=(numA/numB);
		}));
		//REFERENCIADO
		LOG.info(""+MetHO.metUnaryF(MetodosReferenciados::aplicarUO));

	}

}
