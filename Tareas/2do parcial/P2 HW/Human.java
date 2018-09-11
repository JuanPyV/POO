public class Human{

  protected double speed;
  protected double fuerza;
  protected String name;


	public double getSpeed() {	return speed;}
	public double getFuerza() {	return fuerza;}
	public String getName() {	return name;}


  public Human( double speed, double fuerza, String name){
    this.speed = speed;
    this.fuerza = fuerza;
    this.name = name;
  }

  public void run(){
    System.out.println("GOTTA GO FAST");
  }

  public void run(String name){
    System.out.println("GOTTA GO FASTER "+name);
  }

  public void run(double fuerza){
    System.out.println("GOTTA GO FAST WITH "+fuerza+" NEWTONS ");
  }



}
