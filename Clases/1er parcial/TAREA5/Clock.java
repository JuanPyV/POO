public class Clock {

  private int hr;
  private int min;
  private int sec;

  public Clock() {
    // constructor default sin parámetros
    // inicializar atributos en 0
  }

  public Clock(int hr, int min, int sec){
    // inicializa atributos con valores PERO
    // verifica si son válidos, si no lanza ClockException
  }

  public void setTime(int hr, int min, int sec){
    // establee valores de atributos
    // verifica si son válidos, si no lanza ClockException
  }

  public int getHours(){
    return 0;
  }

  public int getMinutes() {
    return 0;
  }

  public int getSeconds(){
    return 0;
  }

  public void printTime(){
    // imprime la hora completa en un formato legible para humanos
    // ejemplo: 12:30:25
  }

  public int incrementHours(){
    return 0;
    // incrementa las horas por 1
    // implica ajustes de hora - más de 23 se vuelve 0
    // regresa la nueva hora
  }

  public int incrementMinutes(){
    return 0;
    // incrementa los minutos por 1
    // implica ajustes de minutos - más de 59 incrementaHora
    // incrementHours();
    // regresa el nuevo minuto
  }

  public int incrementSeconds(){
    return 0;
    // incrementa los segundos por 1
    // implica ajustes de segundos - más de 59 incrementMinutes
    // incrementMinutes();
    // regresa el nuevo segundo
  }

  public boolean equals(Clock c){
    return false;
    // comparar atributos de ambos y si los valores son iguales regresar true
  }

  public void copy(Clock c){
    // copiar atributos de Clock c a este objeto
  }

  public Clock getCopy(){

    return null;
    // regresar una NUEVA INSTANCIA de Clock con valores idénticos a mi
  }
}
