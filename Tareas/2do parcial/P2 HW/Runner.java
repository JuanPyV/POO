public class Runner extends Human{

  private int numberOfMedals;

  public int getNumerOfMedals(){return numberOfMedals; }

  public Runner (int numberOfMedals, double speed, double fuerza, String name){
    super(speed, fuerza, name);
    this.numberOfMedals = numberOfMedals;
  }

  public void run(){
    super.run();
    System.out.println("Rapidin........")
  }

}
