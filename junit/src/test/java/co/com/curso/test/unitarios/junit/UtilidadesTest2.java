package co.com.curso.test.unitarios.junit;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class UtilidadesTest2 {

	private Utilidades utilidades;

	@Before
	public void setUp() {
		utilidades = new Utilidades();
	}

	@Test
	public void testGetCarolina() {
		Persona caro = utilidades.getCarolina();
		Assert.assertEquals("Carolina", caro.getNombre());
		Assert.assertEquals("Diaz", caro.getApellido());
	}

	@Test
	public void testGetDiana() {
		Persona diana = utilidades.getDiana();
		Assert.assertEquals("Diana", diana.getNombre());
		Assert.assertEquals("Dominguez", diana.getApellido());
	}

	@Test
	public void personasDiferentes() {
		Persona caro = utilidades.getCarolina();
		Persona diana = utilidades.getDiana();

		Assert.assertNotEquals(caro, diana);
	}

	@Test
	public void testGetArrayStrings() {
		String[] arrayEsperado = { "uno", "dos", "tres", "cuatro" };

		String[] resultado = utilidades.getArrayStrings("uno", "dos", "tres", "cuatro");

		Assert.assertArrayEquals(arrayEsperado, resultado);
		Assert.assertEquals(4, resultado.length);
		Assert.assertEquals(arrayEsperado[0], resultado[0]);
		Assert.assertEquals(arrayEsperado[1], resultado[1]);
		Assert.assertEquals(arrayEsperado[2], resultado[2]);
		Assert.assertEquals(arrayEsperado[3], resultado[3]);
	}

	@Test
	public void testEsMayo10() {
		Assert.assertTrue(utilidades.esMayor10(11));
		Assert.assertFalse(utilidades.esMayor10(-1));
		Assert.assertFalse(utilidades.esMayor10(10));
	}

	@Test
	public void testGenerarPersona() {
		Persona personaA = utilidades.genararPersona("Carolina");
		Persona personaNull = utilidades.genararPersona("Michelle");
		Persona persona3 = utilidades.genararPersona("ana");

		Assert.assertNull(personaNull);
		Assert.assertNotNull(personaA);
		Assert.assertNotNull(persona3);

	}

	/**
	 * {@link Assert} same que sirve para comprobar si un objeto esta en la misma
	 * posicion de memoria
	 */
	@Test
	public void testDevolverObjeto() {
		Persona personaA = new Persona("Carolina", "Diaz");
		Persona personaB = new Persona("Camila", "Montez");
		Persona personaC = new Persona("xx", "yy");

		Persona resulP1 = utilidades.devolverObjeto(personaA);
		Persona resulP2 = utilidades.devolverObjeto(personaB);
		Persona resulP3 = utilidades.devolverObjeto(personaC);

		Assert.assertSame(personaA, resulP1);
		Assert.assertSame(personaB, resulP2);
		Assert.assertNotSame(personaC, resulP3);

	}

}
