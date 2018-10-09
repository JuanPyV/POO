// interfaz es una clase ligera
// en java de cuántas clases podemos heredar?
// 1 sola!
// hay situaciones en las que queremos compartir un comportamiento
// entre clases que pueden no estar relacionadas
// las interfaces se implementan (vs heredan)
// no podemos inicializar un objeto de una interfaz
// para utilizar una interfaz DEBE ser implementada

public interface Flyer {
	
	// NO tiene atributos
	// los métodos son sólo firmas! (como los métodos abstractos)
	
	public void despegar();
	public void aterrizar();

}
