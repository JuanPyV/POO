public class SportsCar extends Car{

  private int hp;
  private int maxSpeed;

  private void setHp(int hp){this.hp = hp;}
  public int getHp(){return hp;}

  private void setMaxSpeed (int maxSpeed){this.maxSpeed = maxSpeed;}
  public  int getMaxSpeed(){return maxSpeed;}

  public SportsCar(){
    super();
    System.out.println("Defult SportsCar");
    this.hp = 680;
    this.maxSpeed = 335;
  }

  public SportsCar(int wheels, int door, String modelo, int places, int hp, int maxSpeed){
      super(wheels, door, modelo, places);
      this.hp = hp;
      this.maxSpeed = maxSpeed;
  }

  public void carrera(int hp, int maxSpeed){
    System.out.println("El carro con "+hp+" caballos de fuerza alcanza los "+maxSpeed+" km/h");
  }

}
