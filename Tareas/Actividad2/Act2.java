public class Act2{
  public static void main( String[] args){

    Car bmw = new Car ("M5", 2016, "no", "si");
    System.out.println("El modelo es "+bmw.getModelo());
    System.out.println("El modelo es del "+bmw.getYear());
    System.out.println("El carro "+bmw.getBrake()+ " frena");
    System.out.println("El carro "+bmw.getHonk()+" pita");

    Kangaroo k1 = new Kangaroo ("Larry", 1, 2, "si");
    System.out.println("El canguro se llama "+k1.getName());
    System.out.println("El canguro tiene "+k1.getAge()+" decada");
    System.out.println("El canguro puede saltar "+k1.getJump()+" metros");
    System.out.println("El canguro "+k1.getFight()+" pelea");

    Computer hp = new Computer (16, 3.7f, "si", "si");
    System.out.println("La computadora tiene "+hp.getMemory()+" gb");
    System.out.println("La computadora tiene "+hp.getCpu()+ " ghz");
    System.out.println("La copmutadora "+hp.getBoot()+" booteo");
    System.out.println("la computadora "+hp.getCompile()+" compilo");

  }
}
