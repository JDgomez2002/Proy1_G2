import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class CalculadoraLispTest {

	
	

	@Test
	final void testSeparador() {
		String[] lispArray;
		StackLisp<String> newStack = new StackLisp<String>();
		boolean operacion = true;
		  int contador = 0;
		assertEquals(contador, operacion); // TODO
	}

	@Test
	final void testExrpesion() {
		String[] lispArray = null;
		
		StackLisp<String> newStack = new StackLisp<String>();
		assertEquals(0,lispArray); 
	}

	
	@Test
	final void testOperar() {
		Double z=0.0;
        ArrayList<Integer> operaciones=new ArrayList<>();
        int Contador= 0;
        Integer k = 0;
        assertEquals(z, operaciones);
  
		assertEquals(Contador, operaciones.add(k));
        
	}

	

}
