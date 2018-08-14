public class Celular {

    public double apertura;
    public int ram;
    public String marca;

    public void camara(int pixeles){
        System.out.println("El celular "+marca+" toma buenas fotos gracias a sus "+pixeles+" megapixeles y su apretura de f/"
        +apertura);

    }

    public void proceso(String procesador){
        System.out.println("El celular "+marca+" es rapido gracias a su procesador "+procesador+" y sus "+ram+" GB de ram");
    }
}
