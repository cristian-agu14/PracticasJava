package co.com.curso.test.unitarios.junit;

import org.junit.experimental.theories.DataPoint;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

@RunWith(Theories.class)
public class TehoriesTest {

	@DataPoint
	public static String a = "a";

	@DataPoint
	public static String b = "b";

	@Theory
	public void testTehories(String primero, String segundo) {
		System.out.println(primero + segundo);
	}

}
