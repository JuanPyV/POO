public class Perro extends Animal{

  protected String pelaje;

 public String getPelaje(){ return pelaje; }

 public Perro(){
   super();
   pelaje = "grueso";
 }

 public Perro(String nombre, Corazon corazon, String pelaje){
   super(nombre, corazon);
   this.pelaje = pelaje;
 }

 public boolean mismoPelaje(Perro a){
  if (this.pelaje.equals(a.getPelaje())){
    return true;
  }else{
    return false;
  }

 }
}
