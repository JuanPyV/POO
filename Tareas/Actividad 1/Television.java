package Tareas.Actividad1;

public class Television {

    public int pulgadas;
    public String marca;
    public String woofer;

    public void proyecta(String resolucion){
        System.out.println("El televisor "+marca+" es de "+pulgadas+" pulgadas y una resolucion de "+resolucion+".");
    }

    public void bocina (String sonido){
        System.out.println("El sonido de "+marca+" es "+sonido+" debido a que "+woofer+" tiene woofer.");
    }
}
