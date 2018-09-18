
public class Conejo extends Animal {

	public Conejo(String nombre, int edad) {
		super(nombre, edad);

	}

	// sobreescribiendo / implementado método abstracto
	@Override
	public void comer() {
		System.out.println("comiendo mis verduritas.");
	}

}
