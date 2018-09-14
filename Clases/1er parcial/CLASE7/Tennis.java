public class Tennis extends Calzado {

  // la sobrecarga se puede hacer con todo y herencia
  public void caminar(String n1, String n2){
    System.out.println("animo " + n1 + " y " + n2);
  }


  // sobreescritura
  // redefinición de un método del padre con
  // EXACTAMENTE la misma firma
  // INDISPENSABLE herencia

  // 2 usos comunes - redefinir la lógica de un método por completo
  // - o agregar comportamiento a lo que ya existía

  public void caminar(){
    System.out.println("método sobreescrito");
  }

  public void caminar(float distancia){

    // invocando una superversión
    super.caminar(distancia);
    System.out.println("versión sobreescrita");
  }
}
