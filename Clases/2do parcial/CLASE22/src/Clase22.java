
public class Clase22 {

	public static void main(String[] args) {
		
		Avion a = new Avion();
		a.despegar();
		a.aterrizar();
		
		Pajarito p = new Pajarito();
		p.despegar();
		p.aterrizar();
		
		hacerVolar(a);
		hacerVolar(p);
	}
	
	// ejemplo de pase de parámetros con polimorfismo
	public static void hacerVolar(Flyer volador) {
		volador.despegar();
		volador.aterrizar();
	}

}
