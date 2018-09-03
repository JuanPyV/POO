public class Vehicle {

  protected int wheels;
  protected int door;

  protected void  setWheels(int wheels){this.wheels = wheels;}
  public int getWheels(){return wheels;}

  protected void setDoor(int door){this.door = door;}
  public int getDoor(){return door;}

  public Vehicle(int wheels, int door){
    this.wheels = wheels;
    this.door = door;
  }

  public Vehicle(){
    System.out.println("Constuctor Default");
    wheels = 4;
    door = 5;
  }

  public void moving(){
    System.out.println("Im moving");
  }
}
