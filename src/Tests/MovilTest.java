package Tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Model.Movil;
import logic.OperacionMovil;

class MovilTest {
	
	@Test
	void testAñadirRam() {
		Movil movil2 = new Movil("redmi", 8, "azul", 20);
		OperacionMovil.añadirRam(movil2, 8);
		assertEquals(16, movil2.getRam());
	}
	
	void quitarCapacidad() {
		Movil movil3 = new Movil("redmi", 8, "azul", 20);
		OperacionMovil.quitarCapacidad(movil3, 10);
		assertEquals(10, movil3.getCapacidad());
	}

}
