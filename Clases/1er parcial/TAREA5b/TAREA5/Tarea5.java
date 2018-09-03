import javax.swing.*;

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

    // ALGO NUEVO - (no estaba requerido en la tarea)
    // input!
    String entrada = JOptionPane.showInputDialog("test");
    System.out.println(entrada);

    // parse (no es cast)
    // parse - traducir un string a otro tipo de dato
    int ejemploInt = Integer.parseInt(entrada);
    float ejemploFloat = Float.parseFloat(entrada);
    double ejemploDouble = Double.parseDouble(entrada);


    try {
      int hr = Integer.parseInt(JOptionPane.showInputDialog("dame hora"));
      int min = Integer.parseInt(JOptionPane.showInputDialog("dame minuto"));
      int sec = Integer.parseInt(JOptionPane.showInputDialog("dame segundo"));

      Clock c = new Clock();
      Clock c2 = new Clock(hr, min, sec);

      c.printTime();
      c2.printTime();

      c2.incrementSeconds();
      c2.printTime();

      Clock c3 = c2.getCopy();
      c3.printTime();
    } catch(ClockException ce) {
      ce.printStackTrace();
    } finally {
      // corre en todos los casos, haya habido excepción o no
      // sirve para limpiar
      System.out.println("FINALLY!");
    }

    System.out.println("código post catch");
  }
}
