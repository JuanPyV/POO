public class ArrayList<T> {
	
	private T[] data, dataNew;
	private int posicionActual, tamanio = 0, tamano;
	
	public ArrayList(int tamano) {
		data = (T[]) new Object[tamano];
	}
	
	public void add(T nuevo) {
		for(int i=0; i<data.length; i++) {
			if (data[i] == null) {
				data[i] = nuevo;
				posicionActual = i;
				i=data.length;
				}
			}
		}
public void delete(int posicion) {
		
		System.arraycopy(data, posicion + 1, data, posicion, posicionActual -1 - posicion);
		
		posicionActual--;
				
		if(posicionActual < data.length/2) {
			
			T[] temporal = (T[]) new Object[data.length/2];
			
			System.arraycopy(data, 0, temporal, 0, posicionActual);
			
			data = temporal;
		}
	}
	public T get(int posicion) {
		return data[posicion];
	}
	public int size() {
		for(int i=0; i<data.length; i++) {
			if (data[i] != null) {
				tamanio = tamanio + 1;
			}
		}
		return tamanio;
	}
}