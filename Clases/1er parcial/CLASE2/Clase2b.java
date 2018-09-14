public class Clase2b {

  // siempre se necesita método principal
  public static void main(String[] args){

    // objetos
    // declaración - idéntica a variables
    // idiom de variables permanece - nombres de objeto en minúscula
    Perrito firulais;

    // objetos deben ser inicializados
    // los objetos "nacen"
    // inicialización - crear el objeto en memoria
    firulais = new Perrito();
    Perrito fifi = new Perrito();

    // para acceder a un miembro (atributo, comportamiento) de un objeto
    // usamos el punto
    firulais.cantidadDePatas = 3;
    fifi.cantidadDePatas = 4;

    firulais.raza = "Callejero";
    fifi.raza = "French Poodle";

    System.out.println(firulais.cantidadDePatas);
    System.out.println(fifi.raza);

    firulais.cantidadDePatas = fifi.cantidadDePatas;
    fifi.ladrar("Mayra");
    firulais.ladrar("Eduardo");
  }
}
