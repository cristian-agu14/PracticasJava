package com.mitocode.java8.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LambdaApp {

	public static void main(String[] args) {

		LambdaApp app = new LambdaApp();

		app.ordenar();
		app.calcular();

	}

	public void ordenar() {

		List<String> lista = new ArrayList<String>();

		lista.add("Cristian");
		lista.add("Leonardo");
		lista.add("Agudelo");
		lista.add("Hoyos");

		// En esta parte se usa el comparator de la forma normal
		/*
		 * Collections.sort(lista, new Comparator<String>() {
		 * 
		 * @Override public int compare(String o1, String o2) { return
		 * o1.compareTo(o2); }
		 * 
		 * });
		 */

		// En esta parte se utiliza el lambda para usar el comparator
		Collections.sort(lista, (String p1, String p2) -> p1.compareTo(p2));

		for (String elemento : lista) {
			System.out.println(elemento);
		}

	}

	public void calcular() {

		//Manera normal de traerme una interface
		/*Operacion operacion = new Operacion() {

			@Override
			public double calcularPromedio(double nuemro1, double numero2) {
				// TODO Auto-generated method stub
				return (nuemro1 + numero2) / 2;
			}

		};*/
		
		//Manera de trabajar la interface con lambda
		Operacion operacion = (double x, double y) -> (x+y)/2;
		
		System.out.println(operacion.calcularPromedio(2, 3));

	}
}
