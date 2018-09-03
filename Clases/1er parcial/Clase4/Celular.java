public class Celular {

  private String modelo;
  private Pantalla pantalla;

  private void setModelo(String modelo){ this.modelo = modelo; }
  public String getModelo(){ return modelo; }

  private void setPantalla(Pantalla pantalla) { this.pantalla = pantalla; }
  public Pantalla getPantalla() { return pantalla; }

  public Celular(String modelo, Pantalla pantalla){
    this.modelo = modelo;
    this.pantalla = pantalla;
  }

  public boolean tengoMasPantalla(Celular elOtro){

    return this.getPantalla().getTamanio() >= elOtro.getPantalla().getTamanio();
  }

  
}
