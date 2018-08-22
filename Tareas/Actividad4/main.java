public class main{

  public static void main(String[] args){

      Vehicle v1 = new Vehicle(4, 5);
      Airplane boing = new Airplane(12, 8, 945, 323);
      Car lambo = new Car(4, 3, "Sesto Elemento", 2);
      SportsCar fercho = new SportsCar(4, 5, "GTC4 Lusso", 5, 680, 332);

      v1.moving();
      boing.volando(boing.getPlaces(),boing.getSpeed());
      lambo.conduce(lambo.getModelo(),lambo.getPlaces());
      fercho.carrera(fercho.getHp(),fercho.getMaxSpeed());

      System.out.println("LLantas: "+v1.getWheels());
      System.out.println("Puertas: "+v1.getDoor());

      System.out.println("LLantas del avion: "+boing.getWheels());
      System.out.println("Puertas del avion: "+boing.getDoor());
      System.out.println("Velocidad del avion: "+boing.getSpeed());
      System.out.println("Lugares en el avion: "+boing.getPlaces());

      System.out.println("LLantas del Lamborghini: "+lambo.getWheels());
      System.out.println("Puertas del Lamborghini: "+lambo.getDoor());
      System.out.println("Modelo del Lamborghini: "+lambo.getModelo());
      System.out.println("Lugares en el Lamborghini: "+lambo.getPlaces());

      System.out.println("LLantas del Ferrari: "+fercho.getWheels());
      System.out.println("Puertas del Ferrari: "+fercho.getDoor());
      System.out.println("Modelo del Ferrari: "+fercho.getModelo());
      System.out.println("Lugares en el Ferrari: "+fercho.getPlaces());
      System.out.println("Velocidad maxima del Ferrari: "+fercho.getMaxSpeed());
      System.out.println("Caballos de fuerza del Ferrari: "+fercho.getHp());

  }
}
