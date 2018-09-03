public class Pantalla {

  private float tamanio;

  private void setTamanio(float tamanio){ this.tamanio = tamanio; }
  public float getTamanio(){ return tamanio; }

  public Pantalla(float tamanio){
    this.tamanio = tamanio;
  }

  public void encenderse(){
    System.out.println("ENCENDIENDO!");
  }

  public void romper(){
    this.tamanio = 0;
  }
}
