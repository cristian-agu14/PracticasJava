package com.mitocode.methodReference;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class MeRefApp {

	public static void main(String[] args) {
		MeRefApp app = new MeRefApp();

		// app.operar();

		app.referenciarMetodoInstatanciaObjetoArbitrario();

		Operacion op = app::referenciarMetodoInstatanciaObjetoParticular;
		op.saludar();

		app.referenciarConstructor();

	}

	public static void referenciarMEtodoStatic() {
		System.out.println("Metodo Referido static");
	}

	public void referenciarMetodoInstatanciaObjetoArbitrario() {
		String[] nombres = { "Cristian", "Monica", "Santiago", "Mary" };

		/*
		 * Arrays.sort(nombres, new Comparator<String>() {
		 * 
		 * @Override public int compare(String o1, String o2) { return
		 * o1.compareToIgnoreCase(o2); }
		 * 
		 * });
		 */

		// Arrays.sort(nombres, (s1, s2) -> s1.compareToIgnoreCase(s2)); //Con
		// esta Lambda se reduce la complejidad de lectura del codigo
		// System.out.println(Arrays.toString(nombres));

		Arrays.sort(nombres, String::compareToIgnoreCase);// Ahora con las
															// referencias de
															// metodos la
															// exprecion se
															// reduce a esto
		System.out.println(Arrays.toString(nombres));

	}

	public void referenciarMetodoInstatanciaObjetoParticular() {

		System.out.println("Metodo requerido de un objeto en particular");

	}

	public void referenciarConstructor() {

		/*
		 * IPersona iper = new IPersona() {
		 * 
		 * @Override public Persona crear(int id, String nombre) { return new
		 * Persona(1224, "Camilla"); } }; iper.crear(123, "Camilla");
		 */

		IPersona iper2 = (x, y) -> (new Persona(x, y));
		Persona persona = iper2.crear(123, "Camilla");
		System.out.println(persona.getNombre() + "-" + persona.getId()+ "-> referenciado con lambda");

		IPersona iper3 = Persona::new;
		Persona persona2 = iper3.crear(123, "Camilla");
		System.out.println(persona.getNombre() + "-" + persona.getId()+" :: con referencia a metodos");

	}

	public void operar() {
		// Operacion op = () -> MeRefApp.referenciarMEtodoStatic();

		Operacion op = MeRefApp::referenciarMEtodoStatic;
		op.saludar();

	}

}
