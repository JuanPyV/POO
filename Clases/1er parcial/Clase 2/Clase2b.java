public class Clase2b{

//siempre se necesita metodo principal
public static void main(String[] args){

  //objetos
  //declaracion - identica a variables
  // idiom de variables permanece - nombres de objeto en minuscula
  Perrito firulais;

  //objeto deben ser inicializados
  // los objetos "nacen"
  // inicializacion - crear el objeto en memoria
  firulais = new Perrito();
  Perrito fifi = new Perrito();


// para acceder a un miembro (atributo comportamiento) de un objeto usamos el punto
  firulais.cantidadDePatas = 3;
  fifi.cantidadDePatas = 4;

  firulais.raza = "callejero";
  fifi.raza = "French Poodle";

  System.out.println(firulais.cantidadDePatas);
  System.out.println(fifi.raza);

  fifi.ladrar("Mayra");
  firulais.ladrar("Eduardo");


  }
}
