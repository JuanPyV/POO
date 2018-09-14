public class Tarea3 {

  public static void main(String[] args){


    Eye izquierdo = new Eye();
    Eye derecho = new Eye();
    Head cabeza = new Head(izquierdo, derecho);

    Dog fifi = new Dog();
    Dog doggy = new Dog(80, 30, "Doggy", cabeza);
    Dog fufi = new Dog(100, 20, "Fufi el Chistoso", cabeza);

    System.out.println(fifi.getStrenght());
    System.out.println(fifi.getName());
    System.out.println(fifi.getHead());

    doggy.fight(fufi);
    doggy.run(fufi);

    fufi.getHead().getLeft().blink();
    izquierdo.blink();

  }
}
