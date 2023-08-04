package com.example.demo.funcional;

public class PersonaSupplierImpl implements IPersonaSupplier<String>{

	@Override
	public String getId() {
		// TODO Auto-generated method stub
		String nombre = "Diego Rivas";
		nombre = nombre +"Haro";
		return nombre;
	}

}
