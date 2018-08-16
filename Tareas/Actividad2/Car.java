public class Car {

  private String  modelo;
  private int year;
  private String honk;
  private String brake;

  public String getModelo(){  return modelo;}
  private void setModelo(String modelo ){ this.modelo = modelo; }

  public int getYear(){return year;}
  private void setYear(int year){ this.year = year; }

  public String getHonk(){return honk;}
  private void setHonk(String honk ){ this.honk = honk; }

  public String getBrake(){ return brake;}
  private void setBrake(String brake ){ this.brake = brake; }

  public Car(){
   System.out.println("Default constructor");
   modelo = "Ferrcho";
   year = 2017;
   honk = "Yes";
   brake = "No";
  }

  public Car(String modelo, int year, String honk, String brake){
    this.modelo = modelo;
    setYear(year);
    setHonk(honk);
    setBrake(brake);
  }
}
