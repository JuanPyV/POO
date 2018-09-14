public class Calzado {

  // static
  // static se aplica a un miembro de una Clase
  // lo que hace es en lugar de tener una copia por objeto
  // se tiene una copia por clase

  public static int cantidadDeCalzado = 0;

  public static void saludar(){
    System.out.println("HOLA!");
  }

  // sobrecarga
  // redefinición de método con diferente firma al mismo nivel
  // firma de un método - nombre(lista de parámetros)
  public void caminar(){
    System.out.println("keep walking");
  }

  public void caminar(float distancia){
    System.out.println("camina " + distancia + " metros");
  }

  public void caminar(String nombre){
    System.out.println("animo " + nombre + " ya casi llegas");
  }

  // sobreescritura
}
