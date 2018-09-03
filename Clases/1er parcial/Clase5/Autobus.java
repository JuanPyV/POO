// herencia
// especialización
// - crear una clase que es un subconjunto específico de otra
// - por lógica el subconjunto tiene acceso a atributos y comportamiento
// del superconjunto (subclase / superclase)
// relación "IS A" "ES UN"
public class Autobus extends Transporte{

  private int cantidadDeAsientos;

  private void setCantidadDeAsientos(int cantidadDeAsientos){
    this.cantidadDeAsientos = cantidadDeAsientos;
  }

  public int getCantidadDeAsientos(){ return cantidadDeAsientos; }
  // regla de la herencia:
  // SIEMPRE invocamos a un superconstructor
  // si no es explícito invocamos el default (por eso se llama así)
  // superconstructor - constructor de la superclase

  // cuando no definimos constructor - default vacío

  public Autobus() {
    // sigo sin invocar constructor SIN EMBARGO se invoca
    // cómo invocar un superconstructor
    // DEBE SER la primera línea de código del constructor
    super();
    System.out.println("DEFAULT AUTOBUS");
    cantidadDeAsientos = 10;
  }

  public Autobus(float capacidadEnKg, float velocidadMaxima, int cantidadDeAsientos){

    // invocar a un superconstructor
    // si no se especifica se invoca el DEFAULT! (obviamente)
    // de otra manera se invoca el explícito
    super(capacidadEnKg, velocidadMaxima);
    this.cantidadDeAsientos = cantidadDeAsientos;
  }

}
