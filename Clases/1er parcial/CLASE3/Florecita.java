public class Florecita {

  // encapsulamiento
  // cada objeto se encarga de su información

  // nueva regla -
  // atributos SIEMPRE son privados
  private String color;
  private int cantidadDePetalos;

  // métodos accesores
  // separan quién lee y quién escribe una variable
  public String getColor(){ return color; }
  private void setColor(String color){ this.color = color; }

  public int getCantidadDePetalos(){ return this.cantidadDePetalos; }
  private void setCantidadDePetalos(int cantidadDePetalos) {
    this.cantidadDePetalos = cantidadDePetalos;
  }

  // constructores
  // métodos que se invocan en el momento de creación del objeto
  // en su nacimiento

  // siempre tenemos un constructor implicito
  // default y vacío

  // en el momento que definimos uno el default vacío se obsolece

  // CONSTRUCTOR reglas
  // - se llama igual que la clase
  // - no regresa ningún tipo de dato
  // - puede tener los parámetros que decidamos

  // constructor default - sin parámetros
  public Florecita(){
    System.out.println("nació la florecita");
    setColor("rojo");
    cantidadDePetalos = 10;
  }

  // podemos tener N constructores
  // diferenciarlos por medio de la lista de parámetros
  // tipos de parámetro y orden
  // constructor MUUUUUY común - inicializar atributos
  public Florecita(String color, int cantidadDePetalos){
    this.color = color;
    setCantidadDePetalos(cantidadDePetalos);
  }
}
