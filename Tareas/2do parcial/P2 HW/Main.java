public class Main{
  public static void main(String[] args){

    Human hum1 = new Human(10,20,"Dany");
    Runner corredor = new Runner(4,30,10,"JuanPy");

    System.out.println(hum1.getName());
    System.out.println(hum1.getSpeed());
    System.out.println(hum1.getFuerza());
    System.out.println(corredor.getName());
    System.out.println(corredor.getSpeed());
    System.out.println(corredor.getFuerza());
    System.out.println(corredor.getNumberOfMedals());

    hum1.run();
    hum1.run(35);
    hum1.run(20);
    corredor.run();
    corredor.run(50);
    corredor.run(10);

    OlympicCompetition.trackEvent(hum1,corredor);

  }
}
