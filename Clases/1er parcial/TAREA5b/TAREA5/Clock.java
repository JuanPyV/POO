public class Clock {

  private int hr;
  private int min;
  private int sec;

  public Clock() {
    // constructor default sin parámetros
    // inicializar atributos en 0
    hr = 0;
    min = 0;
    sec = 0;
  }

  public Clock(int hr, int min, int sec) throws ClockException {
    // inicializa atributos con valores PERO
    // verifica si son válidos, si no lanza ClockException
    setTime(hr, min, sec);
  }

  public void setTime(int hr, int min, int sec) throws ClockException {
    // establee valores de atributos
    // verifica si son válidos, si no lanza ClockException
    if( hr > 23 || hr < 0 || min > 59 || min < 0 || sec > 59 || sec < 0)
      throw new ClockException();

    this.hr = hr;
    this.min = min;
    this.sec = sec;
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
    String sHr, sMin, sSec;

    if(hr < 10)
      sHr = "0" + hr;
    else
      sHr = "" + hr;

    if(min < 10)
      sMin = "0" + min;
    else
      sMin = "" + min;

    if(sec < 10)
      sSec = "0" + sec;
    else
      sSec = "" + sec;

    System.out.println(sHr + ":" + sMin + ":" + sSec);

  }

  public int incrementHours(){

    hr++;
    hr %= 24;

    return hr;
    // incrementa las horas por 1
    // implica ajustes de hora - más de 23 se vuelve 0
    // regresa la nueva hora
  }

  public int incrementMinutes(){

    min++;

    if(min == 60){
      incrementHours();
      min = 0;
    }
    return min;
    // incrementa los minutos por 1
    // implica ajustes de minutos - más de 59 incrementaHora
    // incrementHours();
    // regresa el nuevo minuto
  }

  public int incrementSeconds(){

    sec++;

    if(sec == 60){
      incrementMinutes();
      sec = 0;
    }
    return sec;
    // incrementa los segundos por 1
    // implica ajustes de segundos - más de 59 incrementMinutes
    // incrementMinutes();
    // regresa el nuevo segundo
  }

  public boolean equals(Clock c){
    return this.getHours() == c.getHours()
    && this.getMinutes() == c.getMinutes()
    && this.getSeconds() == c.getSeconds();
    // comparar atributos de ambos y si los valores son iguales regresar true
  }

  public void copy(Clock c){

    // copiar atributos de Clock c a este objeto
    this.hr = c.getHours();
    this.min = c.getMinutes();
    this.sec = c.getSeconds();
  }

  public Clock getCopy() throws ClockException {

    Clock c = new Clock(this.hr, this.min, this.sec);
    return c;
    // regresar una NUEVA INSTANCIA de Clock con valores idénticos a mi
  }


}
