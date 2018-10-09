// para utilizar una interfaz hay que implementarla (no heredar)
// java hereda de 1 clase
// java implementar cualquier cantidad de interfaces
// contrato - firma de una clase - partes que la componen

public class Avion extends Object implements Flyer {


	@Override
	public void despegar() {
		System.out.println("voy bien rápido");
	}

	@Override
	public void aterrizar() {
		System.out.println("ya llegamos todos");
	}

}
