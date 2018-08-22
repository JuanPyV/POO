public class Car extends Vehicle{

  protected String modelo;
  protected int places;

  private void setModelo(String modelo){this.modelo = modelo;}
  public String getModelo(){return modelo;}

  private void setPlaces(int places){this.places = places;}
  public int getPlaces(){return places;}

  public Car(){
    super(4, 5);
    System.out.println("Default Car");
    modelo = "Fercho";
    places = 5;
  }

  public Car(int wheels, int door, String modelo, int places){
    super(wheels, door);
    this.modelo = modelo;
    this.places = places;
  }

  public void conduce(String modelo, int places){
    System.out.println("Caben " +places+" personas en un "+modelo);
  }
}
