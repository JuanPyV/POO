public class Clase4{

  public static void main(String[] args){
/*
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
  */
    Transporte t1 = new Transporte();
    Transporte t2 = new Transporte(2000, 120);

    System.out.println(t1.getCapacidadEnKg());
    System.out.println(t2.getCapacidadEnKg());
    t1.desplazarse();
    t2.desplazarse();

    // LO NUEVO!
    // - herencia en acción
    Autobus a1 = new Autobus();

    // herencia - un objeto de una subclase puede utilizar miembros
    // definidos en la superclase
    System.out.println(a1.getCapacidadEnKg());
    System.out.println(a1.getVelocidadMaxima());

    a1.desplazarse();

    Autobus a2 = new Autobus(2000, 120, 50);

    System.out.println(a2.getCapacidadEnKg());
    System.out.println(a2.getVelocidadMaxima());
    System.out.println(a2.getCantidadDeAsientos());

    ExpresoTec e1 = new ExpresoTec();
    ExpresoTec e2 = new ExpresoTec("Patria");

    System.out.println(e2.getCapacidadEnKg());
    System.out.println(e2.getVelocidadMaxima());
    System.out.println(e2.getCantidadDeAsientos());
    System.out.println(e2.getRuta());

  }
}
