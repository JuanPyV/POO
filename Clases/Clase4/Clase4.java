public class Clase4{

  public static void main(String[] args){

    Pantalla pantalla = new Pantalla(5);
    Pantalla pantalla2 = new Pantalla(5);
    System.out.println(pantalla == pantalla2);
    Celular iPhone = new Celular("iPhone X", pantalla);
    Celular galaxy = new Celular("Galaxy S9", pantalla);
    System.out.println(pantalla == iPhone.getPantalla());

    pantalla.encenderse();
    pantalla2.encenderse();

    Pantalla pantalla3 = iPhone.getPantalla();
    pantalla3.encenderse();
    iPhone.getPantalla().encenderse();
    System.out.println(iPhone.getPantalla().getTamanio());
    System.out.println(pantalla == pantalla3);

    galaxy.tengoMasPantalla(iPhone);

    galaxy.getPantalla().romper();
    System.out.println(pantalla.getTamanio());
    System.out.println(iPhone.getPantalla().getTamanio());
  }
}
