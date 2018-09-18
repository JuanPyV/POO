public class Animal{

  protected String nombre;
  protected Corazon corazon;

  public String getNombre() { return nombre; }
  public Corazon getCorazon() { return corazon; }


   public Animal(){
     nombre = "animal";
     corazon = null;
   }

   public Animal(String nombre, Corazon corazon){
     this.nombre = nombre;
     this.corazon = corazon;
   }

   public Animal clonar(){
     Animal animal1 = new Animal();
     this.nombre = animal1.nombre;
     this.corazon = animal1.corazon;
     return animal1;
   }

   public String tieneMasCorazon(Animal a){
     if (this.getCorazon().getPeso() > a.getCorazon().getPeso()){
       return this.nombre;
     }else{
       return a.getNombre();
     }
   }

   public boolean soyElMismo(Animal b){
     if (this.nombre == b.nombre && this.corazon == b.corazon){
       return true;
     }else{
       return false;
     }
   }

}
