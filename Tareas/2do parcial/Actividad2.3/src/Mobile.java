
public class Mobile extends Computer {

	public Mobile(int screen, String storage) {
		super(screen, storage);

	}

	@Override
	public void sendMail() {
		System.out.println("El mail es enviado desde el movil ");

	}

	@Override
	public void writeCode() {
		System.out.println("Escribiendo codigo........ ");
	}

}