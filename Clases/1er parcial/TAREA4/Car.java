public class Car extends Vehicle {

  protected int cantidadDeVentanas;

  public int getCantidadDeVentanas(){ return cantidadDeVentanas; }

  public Car(int cantidadDeVentanas, String color){
    // ESTAMOS INVOCANDO SUPERCONSTRUCTOR?
    // - SÍ.
    // siempre invocamos un SUPERCONSTRUCTOR
    // cuál se invoca si no está "super"?
    // - default
    System.out.println("constructor car");
    this.cantidadDeVentanas = cantidadDeVentanas;
    this.color = color;
  }

  public void vroom(){
    System.out.println("VROOOOOOOOM");
  }
}
