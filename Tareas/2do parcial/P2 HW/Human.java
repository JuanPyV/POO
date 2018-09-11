public class Human{

  protected double speed;
  protected double fuerza;
  protected String name;


	public double getSpeed() {	return speed;}
	public double getFuerza() {	return fuerza;}
	public String getName() {	return name;}


  public huma( double speed, double fuerza, String name){
    this.speed = speed;
    this.fuerza = fuerza;
    this.name = name;
  }

  public static void run(){
    System.out.println("GOTTA GO FAST");
  }

  public static void run(String name){
    System.out.println("GOTTA GO FASTER "+name);
  }

  public static void run(double fuerza){
    System.out.println("GOTTA GO FAST WITH "+fuerza+" NEWTONS ");
  }



}
