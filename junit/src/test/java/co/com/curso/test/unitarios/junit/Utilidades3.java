package co.com.curso.test.unitarios.junit;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING) // Para que los test se ejecuten en orden alfabeticox
public class Utilidades3 {

	@Test
	public void testConHamcrest() {
		String cadena = "Hola Mundo";

		Assert.assertThat(cadena, is(equalTo("Hola Mundo")));
	}

}
