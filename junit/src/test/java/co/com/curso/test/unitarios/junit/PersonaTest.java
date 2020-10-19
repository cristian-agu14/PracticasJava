package co.com.curso.test.unitarios.junit;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PersonaTest {

	private Persona persona;

	@Before
	public void setUp() {
		persona = new Persona("Cristian", "Agudelo");
	}

	@Test
	public void testGetNombre() {

		// Then
		Assert.assertTrue(persona.getNombre().equals("Cristian"));
	}

}
