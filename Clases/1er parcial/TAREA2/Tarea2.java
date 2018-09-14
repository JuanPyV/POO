public class Tarea2 {

  public static void main(String[] args){

    Car carrito = new Car();
    Car carrote = new Car("Voyager", 2005);

    System.out.println(carrito.getModelo());
    System.out.println(carrito.getAnio());
    System.out.println(carrote.getModelo());
    System.out.println(carrote.getAnio());

    carrito.pitar();
    carrote.pitar();

    carrito.frenar();
    carrote.frenar();
  }
}
