public class Clock {

  private int hr;
  private int min;
  private int sec;

  public Clock() {
    hr = 0;
    min = 0;
    sec = 0;
    // constructor default sin parámetros
    // inicializar atributos en 0
  }

  public Clock(int hr, int min, int sec) throws ClockException{
    // inicializa atributos con valores PERO
    // verifica si son válidos, si no lanza ClockException
    this.hr = hr;
    this.min = min;
    this.sec = sec;

    if (hr > 23 || min > 59 || sec > 59){
      throw new ClockException();
    }else {
      System.out.println("Hora valida");
    }
  }

  public void setTime(int hr, int min, int sec) throws ClockException {
    // establece valores de atributos
    // verifica si son válidos, si no lanza ClockException

    if (hr > 23 || min > 59 || sec > 59){
      throw new ClockException();
    }else {
      System.out.println("Hora valida");
    }
  }

  public int getHours(){
    return hr;
  }

  public int getMinutes() {
    return min;
  }

  public int getSeconds(){
    return sec;
  }

  public void printTime(){
    // imprime la hora completa en un formato legible para humanos
    // ejemplo: 12:30:25
    if (hr<10){
      System.out.print("0"+hr+":");
    }else{
      System.out.print(hr+":");
    }
    if (min<10){
      System.out.print("0"+min+":");
    }else{
      System.out.print(min+":");
    }
    if (sec<10){
      System.out.println("0"+sec);
    }else{
      System.out.println(sec);
    }
  }

  public int incrementHours(){
    // incrementa las horas por 1
    // implica ajustes de hora - más de 23 se vuelve 0
    // regresa la nueva hora
    hr++;
    if (hr > 23){
      hr = 0;
    }
    return hr;
  }

  public int incrementMinutes(){
    // incrementa los minutos por 1
    // implica ajustes de minutos - más de 59 incrementaHora
    // incrementHours();
    // regresa el nuevo minuto
    min++;
    if (min > 59){
      min = 0;
      incrementHours();
    }
    return min;
  }

  public int incrementSeconds(){
    // incrementa los segundos por 1
    // implica ajustes de segundos - más de 59 incrementMinutes
    // incrementMinutes();
    // regresa el nuevo segundo
    sec++;
    if (this.sec > 59){
      this.sec = 0;
      incrementMinutes();
    }
    return sec;
  }

  public boolean equals(Clock c){
    if (this.hr == c.hr && this.min == c.min && this.sec == c.sec){
      return true;
    }
    return false;
    // comparar atributos de ambos y si los valores son iguales regresar true
  }

  public void copy(Clock c){
    this.hr = c.hr;
    this.min = c.min;
    this.sec = c.sec;
    // copiar atributos de Clock c a este objeto
  }

  public Clock getCopy(){
    Clock reloj1 = new Clock();
    reloj1.hr = this.hr;
    reloj1.min = this.min;
    reloj1.sec = this.sec;

    return reloj1;
    // regresar una NUEVA INSTANCIA de Clock con valores idénticos a mi
  }
}
