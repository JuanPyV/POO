package Tareas.Actividad1;

public class Carro {

    public int cantidadDeLlantas;
    public String marca;
    public int caballos;

    public void avanza(int velocidad){
        System.out.println("El "+marca+" alcanza la velocidad de "+velocidad+" km/h gracias a sus "+caballos+
                " caballos de fuerza.");
    }

    public void manejo (String manejo){
        System.out.println("El "+marca+" se maneja "+manejo+" debido a sus "+cantidadDeLlantas+" llantas.");
    }
}
