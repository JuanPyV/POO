// TODO el codigo de java va en clases

public class Clase2{

  // el codigo de java necesita ser compilado
  // la compilacion es traduccion de lenguaje de alto nivel a bytecode
  // es obligatorio tener un metodo main que correr
  // es lo que corre por default!
  public static void main(String[] args){

    //Variables - declaracion y asignacion
    //declarar una Variables
    //sintaxis : tipo nombre;

    // tipos de datos primitivos
    // enteros
    byte enteroMenor;
    int entero;
    long enteroLargo;
    float decimal;
    double decimalLargo;
    String texto;
    boolean boleano;

    enteroMenor = 4;
    entero = 15;
    decimal = 4.3f;
    decimalLargo = 2.3;
    texto = "hola amiguito";
    boleano = true;

    // se puede declarar y asignar de golpe
    int ejemplo = 5;

    // se declara una sola vez, se asigna n veces
    enteroMenor = 12;

    // estructura de control de flujo
    // if if else else
    // switch
    // for
    // while
    // do-while

    //para los ciclos de los que conocemos numero de repeticion
    //variable de contador con valor incial; condicion de repeticion; incremento;
    for(int i=0; 1<10; i++){

      System.out.println("i actual: " + i);
    }

    switch(entero){
      case 1:
        System.out.println("fue 1");
        break;
      case 2:
        System.out.println("fue 2");
        break;
      case 15:
        System.out.println("este debe correr");
        break;
      default:
        System.out.println("ninguno otro caso corrio");
        break;
    }

    if (entero == 2){
      System.out.println("fue igual");
    }else if (entero == 3){
      System.out.println("fue 3");
    } else {
      System.out.println("en el if no se cumplio ninguna condicion");
    }

    //ciclos para acciones de las que no sabemos cuantas repeticiones hay
    //

    //while(condicion){
    //codigo que se hace mientras la condicion es verdadera
    //}

    //do{
    //codigo que se hace mientras la condicion sea verdadera
  //}while(condicion);


}
}
