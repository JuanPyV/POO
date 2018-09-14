public class SportsCar extends Car {

  private int horsePower;

  public int getHorsePower() { return horsePower; }

  public SportsCar(int horsePower, int cantidadDeVentanas, String color){
    // tratando de invocar Car()
    super(cantidadDeVentanas, color);
    this.horsePower = horsePower;
  }

  public void ganarCarrera(){
    System.out.println("SOY EL CAMPEÓN, FELICÍTENME.");
  }
}
