
public abstract class Computer {

	private int screen;
	private String storage;

	public int getScreen() {
		return screen;
	}

	public String getStorage() {
		return storage;
	}

	public Computer(int screen, String storage) {
		this.screen = screen;
		this.storage = storage;
	}

	public void sendMail() {
		System.out.println("Mandando un mail.......");
	}

	public void sendMail(int screen) {
		System.out.println("Mandando mail con el tamaño de pantalla que es: " + getScreen());
	}

	public void sendMail(String storage) {
		System.out.println("El almacenamiento es: " + getStorage());
	}

	public abstract void writeCode();

}
