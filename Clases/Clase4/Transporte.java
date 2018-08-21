public class Transporte {

  private float capacidadEnKg;
  private float velocidadMaxima;

  private void setCapacidadEnKg(float capacidadEnKg){
    this.capacidadEnKg = capacidadEnKg;
  }
  public float getCapacidadEnKg(){ return capacidadEnKg; }

  private void setVelocidadMaxima(float velocidadMaxima){
    this.velocidadMaxima = velocidadMaxima;
  }
  public float getVelocidadMaxima() { return velocidadMaxima; }

  public Transporte(float capacidadEnKg, float velocidadMaxima){
    this.capacidadEnKg = capacidadEnKg;
    this.velocidadMaxima = velocidadMaxima;
  }

  public Transporte(){
    capacidadEnKg = 5;
    velocidadMaxima = 100;
  }

  public void desplazarse(){
    System.out.println("moviendome");
  }

}
