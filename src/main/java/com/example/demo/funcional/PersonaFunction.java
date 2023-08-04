package com.example.demo.funcional;

public class PersonaFunction implements IPersonaFunction<String, Integer> {

	@Override
	public String aplicar(Integer arg) {
		
		Integer numA =5;
		Integer numB =8;
		Integer sum =(numA+numB)/arg;
		sum.toString();
		
		return sum.toString();
	}

	//T lo que retorna
	//R lo que recibe
	
}
