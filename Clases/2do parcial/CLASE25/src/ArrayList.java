
public class ArrayList<T> {

	private T[] data;
	private int posicionActual;
	
	public ArrayList() {
		
		data = (T[]) new Object[5];
	}
	
	public void add(T nuevo) {
		
		// agrega elemento al final de la estructura
	}
	
	public void delete(int posicion) {
	
		// remueve elemento en una posición específica
		// desplaza otros elementos para llenar el hueco
	}
	
	public T get(int posicion) {
		
		// regresar objeto en posicion
		return null;
	}
	
	public int size() {
		// regresa cantidad de datos guardados 
		return -1;
	}
}
