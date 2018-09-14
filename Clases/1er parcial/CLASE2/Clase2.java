// TODO el código de java va en clases

public class Clase2 {

  // el código de java necesita ser compilado
  // compilación - traducción de lenguaje de alto nivel a bytecode

  // es obligatorio tener un método main que correr
  // es lo que corre por default!
  public static void main(String[] args){

    // VARIABLES - declaración y asignación
    // declarar una variable
    // sintaxis : tipo nombre;

    // tipos de datos primitivos
    // enteros
    byte enteroMenor;
    int entero;
    long enteroLargo;

    // flotantes
    float decimal;
    double decimalLargo;

    // otros
    String texto;
    boolean boleano;

    enteroMenor = 4;
    entero = 15;
    decimal = 4.3f;
    decimalLargo = 2.3;
    texto = "hola amiguitos";
    boleano = true;

    // se puede declarar y asignar de golpe
    int ejemplo = 5;

    // se declara una sola vez, se asigna n veces
    enteroMenor = 12;

    // estructuras de control de flujo
    // * if - if else - else
    // * switch
    // * for
    // * while
    // * do-while

    // para ciclos de los que conocemos número de repeticiones
    // for(variable de contador con valor inicial; condición de repetición; incremento)
    for(int i = 0; i < 10; i++){

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
        System.out.println("este debe correr ");
        break;
      default:
        System.out.println("ningún otro caso corrió");
        break;
    }

    if(entero == 2){
      System.out.println("fue igual");
    } else if (entero == 3){
      System.out.println("fue 3");
    } else {
      System.out.println("en el if no se cumplió ninguna condición");
    }

    // ciclos para acciones de las que no sabemos cuántas repeticiones hay
    /*

    while(condición){
      // código que se hace mientras la condición sea verdadera
    }

    do{
      // código que se hace mientras la condición sea verdadera
    }while(condición);

    */
  }
}
