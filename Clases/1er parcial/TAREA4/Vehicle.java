public class Vehicle {

  protected String color;
  public String getColor(){ return color; }

  public Vehicle(){
    System.out.println("constructor default!");
    color = "blanco";
  }

  public void move(){
    System.out.println("moving");
  }

  // demostrar polimorfismo en parámetros
  public void imprimirColorDelOtro(Vehicle v){

    System.out.println(v.getColor());
  }

  // throws - TIENE LA POSIBILIDAD de lanzar una excepción
  // no significa que la vaya a lanzar siempre
  public void metodoRiesgoso(int edadDelCarro) throws EjemploException {

    if(edadDelCarro < 0){
      throw new EjemploException();
    } else {
      System.out.println("edad valida");
    }
  }
}
