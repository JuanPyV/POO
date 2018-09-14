public class Car {

  private String modelo;
  private int anio;

  // métodos accesores
  // - mecanismo que divide quién lee y quién escribe
  // - sirve para exponer valores sin permitir que los cambien
  public String getModelo(){ return modelo; }
  private void setModelo(String modelo) { this.modelo = modelo; }

  public int getAnio(){ return anio; }
  private void setAnio(int anio){ this.anio = anio; }

  // constructor default
  // - no tiene parámetros
  // - tenemos un default vacío implícito si no definimos constructor

  public Car(){
    System.out.println("default constructor");
    modelo = "vocho";
    anio = 1970;
  }

  public Car(String modelo, int anio){
    System.out.println("constructor que inicializa atributos");
    this.modelo = modelo;
    setAnio(anio);
  }

  public void pitar(){
    System.out.println("BIP BIP");
  }

  public void frenar(){
    System.out.println("frenando...");
  }
}
