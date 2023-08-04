package com.example.demo.funcional;

public class PersonaPredicate implements IPersonaPredicate<Integer> {

	@Override
	public boolean evaluar(Integer arg) {

		Integer evaluar = 100;
		arg=arg*6;
		if (evaluar.compareTo(arg) == 0) {
			return true;
		} else {
			return false;
		}

	}

}
