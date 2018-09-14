public class Dog {

  private float strenght, speed;
  private String name;
  // relación HAS A o TIENE UN
  private Head head;

  public float getStrenght() { return strenght; }
  public float getSpeed() { return speed; }
  public String getName() { return name; }
  public Head getHead() { return head; }

  public Dog(){
    System.out.println("EL DEFAULT DE PERRO");
  }

  public Dog(float strenght, float speed, String name, Head head){

    this.strenght = strenght;
    this.speed = speed;
    this.name = name;
    this.head = head;
  }

  public void fight(Dog elOtro){
    if(this.getStrenght() > elOtro.getStrenght())
      System.out.println("YO GANO");
    else
      System.out.println("EL OTRO GANA :(");
  }

  public void run(Dog elOtro){
    if(this.getSpeed() > elOtro.getSpeed())
      System.out.println("YO SOY MÁS RÁPIDO");
    else
      System.out.println("PERDÍ :'( ");
  }
}
