public class Florecita {

  // encapsulamiento
  // cada objeto se encarga de su informacion

  // nueva regla
  // atributos siempre son privados
  private String color;
  private int cantidadDePetalos;

/*
metods accesores
separan quien lee y quien escribe una variable
*/

  public String getColor(){  return color;}
  private void setColor(String color ){ this.color = color; }

  public int getCantidadDePetalos(){return cantidadDePetalos;}
  private void setCantidadDePetalos(int cantidadDePetalos){
    this.cantidadDePetalos = cantidadDePetalos;
  }

/*
constructores
metodos que se invocan en el momento de creacion del objeto
en su nacimiento

siempre tenemos un constructor implicito
default y vacio

en el momento que definimos uno el default vacio se absolece

constructor reglas
- sellama igual que la Clase3
-no regresa ningun tipo de datos
-puede tener los parametros que decidamos
*/

//constructor default - sin parametros
  public Florecita(){
   System.out.println("Nacio la florecita");
   color = "rojo";
   cantidadDePetalos = 10;
  }

  /*
  podemos tener N constructores
  deferenciarlos por medio de la lista de parametros
  tipos de parametro y orden
  constructor MUUUUY comun - inicializar atributos
  */
  public Florecita(String color, int cantidadDePetalos){
    this.color = color;
    setCantidadDePetalos(cantidadDePetalos);
  }
}
