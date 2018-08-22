public class Transporte {

  // modificador de acceso
  // - public: todo el mundo puede accederlo
  // - private: sólo la Clase
  // - protected: sólo la clase Y cualquier clase que pertenezca a su árbol
  // genealógico
  protected float capacidadEnKg;
  protected float velocidadMaxima;

  protected void setCapacidadEnKg(float capacidadEnKg){
    this.capacidadEnKg = capacidadEnKg;
  }
  public float getCapacidadEnKg(){ return capacidadEnKg; }

  protected void setVelocidadMaxima(float velocidadMaxima){
    this.velocidadMaxima = velocidadMaxima;
  }
  public float getVelocidadMaxima() { return velocidadMaxima; }

  public Transporte(float capacidadEnKg, float velocidadMaxima){
    this.capacidadEnKg = capacidadEnKg;
    this.velocidadMaxima = velocidadMaxima;
  }

  public Transporte(){
    System.out.println("CONSTRUCTOR DEFAULT TRANSPORTE");
    capacidadEnKg = 5;
    velocidadMaxima = 100;
  }

  public void desplazarse(){
    System.out.println("moviendome");
  }

}
