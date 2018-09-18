public class ExpresoTec extends Autobus {

  private String ruta;

  private void setRuta(String ruta){ this.ruta = ruta; }
  public String getRuta() { return ruta; }


  public ExpresoTec(){
    System.out.println("DEFAULT EXPRESO TEC");
    this.ruta = "Lopez Mateos";
  }

  public ExpresoTec(String ruta){
    super(2000, 150, 40);
    this.ruta = ruta;
  }

}
