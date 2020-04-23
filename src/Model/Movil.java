package Model;

public class Movil {
	private String modelo;
	private int ram;
	private String color;
	private int capacidad;
	public Movil(String modelo, int ram, String color, int capacidad) {
		super();
		this.modelo = modelo;
		this.ram = ram;
		this.color = color;
		this.capacidad = capacidad;
	}
	
	public Movil() {
		this.modelo="Redmi";
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	@Override
	public String toString() {
		return "Movil [modelo=" + modelo + ", ram=" + ram + ", color=" + color + ", capacidad=" + capacidad + "]";
	}

	
	
	
	
	
	
}


