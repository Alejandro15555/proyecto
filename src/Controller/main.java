package Controller;

import Model.ComputerJava;
import Model.Movil;
import logic.OperacionMovil;

public class main {

	public static void main(String[] args) {
		Movil movil1 = new Movil();
		
		
		movil1.setRam(8);
		movil1.setCapacidad(20);
		movil1.setColor("azul");
		
		System.out.println(movil1.toString());
		
		OperacionMovil.añadirRam(movil1, 8);
		
		System.out.println(movil1.toString());
		System.out.println(movil1.getCapacidad());
		
		OperacionMovil.quitarRam(movil1, 2);
		System.out.println(movil1.toString());
		

	}

}
