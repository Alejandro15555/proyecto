package Model;

public class ComputerJava {
	private String marca;
	private String cpu;
	private String gpu;
	private int ram;
	private int discoDuro;
	
	
	
	
	public ComputerJava(String cpu, String gpu, int ram, int discoDuro) {
		
		this.marca = "dell";
		this.cpu = cpu;
		this.gpu = gpu;
		this.ram = ram;
		this.discoDuro = discoDuro;
	}
	
public ComputerJava() {
		
		this.marca = "dell";
	
	}
	
	
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getCpu() {
		return cpu;
	}
	public void setCpu(String cpu) {
		this.cpu = cpu;
	}
	public String getGpu() {
		return gpu;
	}
	public void setGpu(String gpu) {
		this.gpu = gpu;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public int getDiscoDuro() {
		return discoDuro;
	}
	public void setDiscoDuro(int discoDuro) {
		this.discoDuro = discoDuro;
	}
	@Override
	public String toString() {
		return "ComputerJava [cpu=" + cpu + ", gpu=" + gpu + ", ram=" + ram + ", discoDuro=" + discoDuro + "]";
	}
	
	

}
