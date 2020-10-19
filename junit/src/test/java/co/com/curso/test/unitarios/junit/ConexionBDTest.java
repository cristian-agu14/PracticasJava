package co.com.curso.test.unitarios.junit;

import java.sql.Connection;
import static org.hamcrest.core.IsNull.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Assert;
import org.junit.Test;

import com.sun.org.apache.xerces.internal.impl.xs.identity.Selector.Matcher;

public class ConexionBDTest {

	private final String DB = "test";
	private final String USER = "postgres";
	private final String PASS = "12345";
	private final String INVALID_USER = "test";

	private ConexionBD conexionBD;

	@SuppressWarnings("deprecation")
	@Test
	public void conexionBDCorrecta() {
		conexionBD = new ConexionBD(DB, USER, PASS);
		Connection connection = null;

		try {
			connection = conexionBD.connectDatabase("127.0.0.1", "49659", "test", "postgres", "12345");
		} catch (Exception e) {
			Assert.fail("La conexion ha fallado");
		}

		assertThat(connection, notNullValue());

	}

}
