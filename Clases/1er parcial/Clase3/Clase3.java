public class Clase3{
  public static void main(String[] args){

    //new creacion del objeto, invocacion al cronstructor
    int x = 2;
    int y = x;
    y = 3;
    // los primitivos se copian la informacion

    System.out.println(x);
    System.out.println(y);
    System.out.println(x);

    //¿Cual es el valor de un objeto no inicializado?
    // es el valor es null
    Florecita f3;

    Florecita f1 = new Florecita();
    f3 = f1;
    System.out.println(f1.getColor());
    System.out.println(f3.getColor());
    System.out.println(f1.getCantidadDePetalos());
    System.out.println(f3.getCantidadDePetalos());

    Florecita f2 = new Florecita ("azul", 100);
    System.out.println(f2.getColor());
    System.out.println(f2.getCantidadDePetalos());

  }
}