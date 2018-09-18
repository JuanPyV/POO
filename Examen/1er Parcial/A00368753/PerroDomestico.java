public class PerroDomestico extends Perro{

  private String raza;

  public String getRaza(){ return raza; }
  
  public PerroDomestico(String nombre, Corazon corazon, String pelaje, String raza){
    super(nombre, corazon, pelaje);
    this.raza = raza;
  }
}
