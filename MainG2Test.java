import static org.junit.jupiter.api.Assertions.*;

import java.util.Vector;

import org.junit.jupiter.api.Test;

class MainG2Test {

	@Test
	final void testMain() {
		CalculadoraLisp c = null;
		String[] expresionLisp = c.get_expresion(); // TODO
		Vector<String> expresion= new Vector<>();
		Double total=CalculadoraLisp.operar(expresion);
		assertEquals(expresion, total);
	}

}
