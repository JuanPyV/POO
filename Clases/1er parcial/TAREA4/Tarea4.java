public class Tarea4 {

  public static void main(String[] args) {

    Vehicle v = new Vehicle();
    Car c = new Car(6, "rojo");
    SportsCar sc = new SportsCar(300, 0, "amarillo");

    System.out.println(v.getColor());
    System.out.println(c.getColor());
    System.out.println(sc.getColor());
    v.move();
    c.move();
    sc.move();

    System.out.println(c.getCantidadDeVentanas());
    System.out.println(sc.getCantidadDeVentanas());
    c.vroom();
    sc.vroom();

    System.out.println(sc.getHorsePower());
    sc.ganarCarrera();

    // poliformismo en POO
    // poliformismo - muchas formas
    // un sólo objeto representa a su clase
    // pero también puede representar a cualquiera de sus
    // superclases

    Vehicle v2 = sc;
    Car c2 = sc;



    try{
      // codigo riesgoso
      // v.imprimirColorDelOtro(null);

      // casting
      // convertir tipos
      // no hay certeza que sean compatibles
      //SportsCar sc2 = (SportsCar)c;

      //System.out.println(sc2.getHorsePower());

      c.metodoRiesgoso(-10);
    }catch(ClassCastException cce){

      cce.printStackTrace();
    }catch(EjemploException ee){
      ee.printStackTrace();
    }catch(Exception e){
      // las excepciones tienen un tipo
      // System.out.println(npe);
      e.printStackTrace();
    }

    v.imprimirColorDelOtro(c);
    v.imprimirColorDelOtro(sc);
  }
}
