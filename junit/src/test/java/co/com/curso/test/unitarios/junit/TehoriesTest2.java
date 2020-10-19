package co.com.curso.test.unitarios.junit;

import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

@RunWith(Theories.class)
public class TehoriesTest2 {

	@DataPoints
	public static String[] elementos = { "a", "b", "c", "d", "e" };

	@Theory
	public void testTehories(String a, String b, String c, String d, String e) {
		System.out.println(a + b + c + d + e);
	}

}
