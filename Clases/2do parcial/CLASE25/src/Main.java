
public class Main {

	public static void main(String[] args) {
		
		// arreglos
		// estructura de datos lineal
		// tamaño definido
		
		int[] arreglito = {24, 25, 39, 1};
		int[] arr2 = new int[5];
		
		arr2 = new int[10];
		
		// el índice empieza en 0
		// motivo: referencia del arreglo + (tamaño * indice)
		// arreglos son referencias
		
		for(int i = 0; i < arreglito.length; i++) {
			System.out.println(arreglito[i]);
		}
		
		// tipos genéricos
		Contenedor<String, String, String> c1 = 
				new Contenedor<String, String, String>("a", "b", "c");
		
		System.out.println(c1.getCarga());
		
		// autoboxing - cambio transparente entre un primitivo y su clase correspondiente
		Contenedor<Integer, Float, Double> c2;
		c2 = new Contenedor<Integer, Float, Double>(5, 2.0f, 3.1);
		
		int x = c2.getCarga();

	}

}
