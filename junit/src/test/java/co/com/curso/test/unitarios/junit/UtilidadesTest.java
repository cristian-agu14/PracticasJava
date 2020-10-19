package co.com.curso.test.unitarios.junit;

import org.junit.Assert;
import org.junit.Test;

public class UtilidadesTest {

	private Utilidades utilidades;

	@Test
	public void testConcatenar() {

		utilidades = new Utilidades();
		String resultado = utilidades.concatenar("CR", "7");
		Assert.assertEquals("Las cadenas son diferentes", "CR7", resultado);
	}

	@Test
	public void testConcatenarFallo() {

		utilidades = new Utilidades();
		String resultado = utilidades.concatenar("CR", "7");
		Assert.assertEquals("Las cadenas son diferentes", "CR-7", resultado);
	}

	@Test
	public void testConcatenarError() {

		utilidades = new Utilidades();
		String resultado = utilidades.concatenar(null, "7");
		Assert.assertEquals("Las cadenas son diferentes", "CR7", resultado);
	}

}
