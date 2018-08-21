// Juan Pablo Velazco Velasquez

public class Dog {

  private int strenght;
  private int speed;
  private String name;
  private Head head;

  public int getStrenght(){ return strenght;}
  public void setStrenght(int strenght){this.strenght = strenght;}
  public int getSpeed(){ return speed;}
  public void setSpeed(int speed){ this.speed = speed;}
  public String getName(){return name;}
  public void setName(String name){this.name = name;}
  public Head getHead (){return head;}
  public void setHead(Head head){this.head = head;}

  public Dog(){
    System.out.println("Default constructor");
    strenght = 6;
    speed = 5;
    name = "Pancho";
    this.head = head;
    }

  public Dog(int strenght, int speed, String name, Head head){
    this.strenght = strenght;
    this.speed = speed;
    this.name = name;
    this.head = head;
    }

    public void pelea(Dog dogo){
      if (this.strenght > dogo.getStrenght()){
        System.out.println(dogo.name + " es el perdedor de la pela");
      } else{
        System.out.println(dogo.name + " es el ganador de la pelea");
      }
    }

    public void corre(Dog dogo){
      if (this.speed > dogo.getSpeed()){
        System.out.println(dogo.name + " es el mas lento");
      }else{
        System.out.println(dogo.name + " es el mas rapido");
      }
    }
  }
