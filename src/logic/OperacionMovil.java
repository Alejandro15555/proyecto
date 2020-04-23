package logic;

import Model.Movil;

public class OperacionMovil {
	
	public static void añadirRam(Movil movil, int ram) {
		movil.setRam(movil.getRam()+ram);
		
	}
	
	public static void quitarCapacidad(Movil movil, int capacidad) {
		movil.setCapacidad(movil.getCapacidad()-capacidad);
	}

}
