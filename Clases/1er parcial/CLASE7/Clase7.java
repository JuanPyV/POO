public class Clase7{

  // static
  // override
  // overload

  public static void despedirse(){
    System.out.println("bai");
  }

  public static void main(String[] args){

    // cuando un elemento es estático se refiere directamente
    // con el nombre de la clase
    Calzado.cantidadDeCalzado = 3;
    System.out.println(Calzado.cantidadDeCalzado);
    Calzado.saludar();
    Calzado c = new Calzado();
    System.out.println(c.cantidadDeCalzado);
    c.cantidadDeCalzado = 2;
    System.out.println(Calzado.cantidadDeCalzado);

    // para invocar métodos desde un método estático deben ser estáticos
    // O pertenecer a un objeto
    despedirse();

    c.caminar();
    c.caminar(2);
    c.caminar("Juan");

    Tennis t = new Tennis();

    // probando sobrecarga
    t.caminar();
    t.caminar(2);
    t.caminar("Juan");
    t.caminar("Juan", "Maria");

    // con polimorfismo
    Calzado c1 = c;
    Calzado c2 = t;

    c1.caminar();
    c2.caminar();

    c1.caminar(5);
    c2.caminar(5);
  }
}
