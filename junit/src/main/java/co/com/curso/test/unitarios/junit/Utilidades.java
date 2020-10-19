package co.com.curso.test.unitarios.junit;

import java.util.ArrayList;
import java.util.List;

public class Utilidades {

	private Persona carolina;
	private Persona diana;
	private List<Persona> personas;

	public Utilidades() {
		carolina = new Persona("Carolina", "Diaz");
		diana = new Persona("Diana", "Dominguez");
	}

	public String[] getArrayStrings(String... strings) {
		String[] array = new String[strings.length];

		for (int i = 0; i < array.length; i++) {
			array[i] = strings[i];
		}
		return array;

	}

	public Persona genararPersona(String nombre) {
		Persona persona = null;
		personas = new ArrayList<Persona>();
		personas.add(new Persona("Carolina", "Diaz"));
		personas.add(new Persona("Camila", "Montez"));
		personas.add(new Persona("Andrea", "Jurado"));
		personas.add(new Persona("Ana", "Delgado"));

		for (Persona p : personas) {
			if (p.getNombre().equalsIgnoreCase(nombre)) {
				persona = p;
			}
		}

		return persona;
	}

	public Persona devolverObjeto(Persona persona) {
		personas = new ArrayList<Persona>();
		personas.add(new Persona("Carolina", "Diaz"));
		personas.add(new Persona("Camila", "Montez"));
		personas.add(new Persona("Andrea", "Jurado"));
		personas.add(new Persona("Ana", "Delgado"));

		if (personas.contains(persona)) {
			return persona;
		} else {
			return new Persona("Cristian", "Agudelo");
		}

	}

	public boolean esMayor10(int num) {
		return 10 < num;
	}

	public String concatenar(String uno, String dos) {
		return uno + dos;
	}

	public Persona getCarolina() {
		return carolina;
	}

	public Persona getDiana() {
		return diana;
	}

}
