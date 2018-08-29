public class Tarea5 {

  public static void main(String[] args){

    // crear objeto Clock
    // probar métodos con casos especiales -
    // hora 23 + 1
    // minuto 59 + 1
    // segundo 59 + 1
    // e imprimir resultados
    // probar todos los métodos disponibles
    // hacer try catch en donde sea necesario
    // agregar throw / throws también a métodos donde sea necesario

    try{
    Clock reloc = new Clock(23, 59, 59);
    Clock reloj = new Clock();
    Clock relojCopia = new Clock();
    Clock relojSet = new Clock();
    reloj = reloc.getCopy();
    System.out.println(reloc.getHours()+" horas");
    System.out.println(reloc.getMinutes()+" minutos");
    System.out.println(reloc.getSeconds()+" segundos");
    reloc.incrementHours();
    reloc.incrementMinutes();
    reloc.incrementSeconds();
    reloc.printTime();
    reloj.printTime();
    relojCopia.copy(reloc);
    relojCopia.printTime();
    System.out.println(reloc.equals(relojCopia));
    System.out.println(reloc.equals(reloj));
    relojSet.setTime(21, 50, 60);
  }catch (ClockException e) {
    System.out.println(e);
    }
  }
}
