public class Tarea1 {

  public static void main(String[] args){

    // declaración - inicialización
    Computadora c = new Computadora();
    Computadora c2 = new Computadora();

    c.encenderse();
    c2.encenderse();
    c.crearArchivo();
    c2.crearArchivo();

    c.tamanioMonitor = 15;
    c2.tamanioMonitor = 17;

    c.velocidadCPU = 3.0f;
    c2.velocidadCPU = 3.2f;

    System.out.println(c.tamanioMonitor);
    System.out.println(c.velocidadCPU);

  }
}
