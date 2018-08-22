// Juan Pablo Velazco Velasquez

public class Act3{

  public static void main(String[] args){

    Eye izq = new Eye();
    Eye der = new Eye();

    Head chompa = new Head(izq, der);

    Dog dogo = new Dog();    
    Dog dogi = new Dog(8, 5, "Firulais", chompa);

    dogo.pelea(dogi);
    dogi.pelea(dogo);

    dogo.corre(dogi);
    dogi.corre(dogo);

  }
}
