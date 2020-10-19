package com.mitocode.optional;

import java.util.Optional;

public class OptionalApp {

	public static void main(String[] args) {

		OptionalApp app = new OptionalApp();
		app.probar(null);

	}

	public void probar(String valor) {
		// System.out.println(valor.contains("Hello"));
		try {
			Optional op = Optional.empty();
			op.get();
		} catch (Exception e) {
			System.out.println("No hay elemento");
		}
	}

	public void orElse(String valor) {
		
		Optional<String> op = Optional.of(valor);
		
	}

	public void orElseThrow() {

	}

	public void isPresent() {

	}

}
