
// clase abstracta
// - un tipo de clase
// - PUEDE tener métodos abstractos (por definir)
// - NO puede inicializarse (no se puede hacer new)
// - para ser utilizada debe heredarse
// - objetos sólo por medio de polimorfismo

public abstract class Animal {

	private String nombre;
	private int edad;
	
	public String getNombre() {
		return nombre;
	}
	
	public int getEdad() {
		return edad;
	}

	public Animal(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}
	
	public void nacer() {
		
		System.out.println("hola vida");
	}
	
	// abstract
	
	// método abstracto
	// - definición de un método 
	// - sólamente tienen la firma
	// - qué pero no cómo
	// - una actividad que todos los miembros pueden hacer PERO
	// cada subconjunto hace distintoç
	public abstract void comer();
}
