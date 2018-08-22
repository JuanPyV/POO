public class Airplane extends Vehicle {

  private int speed;
  private int places;

  private void setSpeed(int speed){ this.speed = speed;}
  public int getSpeed(){return speed;}

  private void setPlaces(int places){this.places = places;}
  public int getPlaces(){return places;}

  public Airplane(){
    super(12, 8);
    System.out.println("Default Airplane");
    speed = 945;
    places = 323;
  }

  public Airplane(int wheels, int door, int speed, int places){
    super(wheels, door);
    this.speed = speed;
    this.places = places;
  }

  public void volando(int places, int speed){
    System.out.println("El avion con " +places+" pasajeros va a una velocidad de "
    +speed+" km/h");
  }
}
