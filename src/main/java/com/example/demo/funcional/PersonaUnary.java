package com.example.demo.funcional;

public class PersonaUnary implements IPersonaUnaryOperator<Integer>{

	@Override
	public Integer aplicar(Integer arg) {
		
		Integer sumatoria =10;
		for(int i=0;i>=5;i++) {
			sumatoria=sumatoria+arg;
		}
		
		return sumatoria;
	}

}
