package com.mitocode.colecciones;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ColeccionApp {

	private List<String> lista;

	public static void main(String[] args) {

		ColeccionApp app = new ColeccionApp();

		app.llenarLista();
		// app.usarForEach();
		
		app.usarRemoveIf();
		app.usarForEach();
		System.out.println("------------------");
		app.usarSort();
		app.usarForEach();

	}

	public void llenarLista() {
		lista = new ArrayList<>();

		lista.add("Cristian");
		lista.add("Julio");
		lista.add("Monica");
		lista.add("Agudelo");
		lista.add("Hurtado");

	}

	public void usarForEach() {

		/*
		 * for(String elemento: lista){ System.out.println(elemento); }
		 */

		// lista.forEach( x ->System.out.println(x));

		lista.forEach(System.out::println);

	}

	public void usarRemoveIf() {
		/*Iterator<String> iterator = lista.iterator();
		while (iterator.hasNext()) {
			if (iterator.next().equalsIgnoreCase("Julio")) {
				iterator.remove();
			}
		}*/
		
		lista.removeIf(elemento -> elemento.equalsIgnoreCase("Julio"));
		
	}

	public void usarSort() {
		lista.sort((elemento1, elemento2)->elemento1.compareToIgnoreCase(elemento2));
	}

}
