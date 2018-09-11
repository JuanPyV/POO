public class OlympicCompetition{
    public static void trackEvent(Human hum1, Human hum2){
      if(hum1.getSpeed()>hum2.getSpeed()){
        System.out.println(hum1.getName()+" fue el mas rapidin");
      } else{
        if(hum1.getSpeed()<hum2.getSpeed()){
          System.out.println(hum2.getName()+" fue el mas rapidin");
      } else{
        System.out.println("Los dos son iguales de rapidos");
      }
    }
  }
}
