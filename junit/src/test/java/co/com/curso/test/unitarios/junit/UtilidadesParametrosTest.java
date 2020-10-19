package co.com.curso.test.unitarios.junit;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class UtilidadesParametrosTest {

	private int num1;
	private int num2;
	private UtilidadesParametros utilParametros = new UtilidadesParametros();

	public UtilidadesParametrosTest(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}

	@Parameters
	public static Collection<Object[]> datos() {
		return Arrays.asList(new Object[][] { { 1, 2 }, { 3, 4 }, { 4, 5 }, { 10, 11 }, { 100, -1 } });
	}

	@Test
	public void testUtilsParametros() {
		System.out.println("Los parametros son: V1=" + num1 + " V2=" + num2);
		int resultado = utilParametros.suma(num1, num2);
		Assert.assertEquals(num1 + num2, resultado);
	}

}
