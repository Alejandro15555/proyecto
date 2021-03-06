package Tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Model.Movil;
import logic.OperacionMovil;

class MovilTest {
	
	@Test
	void testAņadirRam() {
		Movil movil2 = new Movil("redmi", 8, "azul", 20);
		OperacionMovil.aņadirRam(movil2, 8);
		assertEquals(16, movil2.getRam());
	}
	
	void testQuitarCapacidad() {
		Movil movil3 = new Movil("redmi", 8, "azul", 20);
		OperacionMovil.quitarCapacidad(movil3, 10);
		assertEquals(10, movil3.getCapacidad());
	}
	
	void testQuitarRam() {
		Movil movil2 = new Movil("redmi", 8, "azul", 20);
		OperacionMovil.aņadirRam(movil2, 2);
		assertEquals(6, movil2.getRam());
	}
	
	void testAņadirCapacidad() {
		Movil movil3 = new Movil("redmi", 8, "azul", 20);
		OperacionMovil.quitarCapacidad(movil3, 10);
		assertEquals(30, movil3.getCapacidad());
	}
	
	
	
	
	

}
