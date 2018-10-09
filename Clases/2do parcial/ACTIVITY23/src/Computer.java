
public abstract class Computer {

	private float cpuSpeed;
	private float ram;
	
	
	
	public float getCpuSpeed() {
		return cpuSpeed;
	}



	public float getRam() {
		return ram;
	}



	public Computer(float cpuSpeed, float ram) {
		super();
		this.cpuSpeed = cpuSpeed;
		this.ram = ram;
	}

	
	// overload
	// sobrecargar 
	public void sendMail() {
		System.out.println("enviando mail");
	}

	public void sendMail(String address) {
		System.out.println("enviando mail a: " + address);
	}

	// método abstracto writeCode
	// sólo se define firma 
	// se implementa en subclases y cada subclase lo hace a su manera
	public abstract void writeCode();
}
