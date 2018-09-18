import javax.swing.*;

public class Examen1{
  public static void main(String[] args) {


    String nameT = JOptionPane.showInputDialog("Dame el nombre del animal: ");
    int pe = Integer.parseInt(JOptionPane.showInputDialog("Dame el peso de corazon del animal: "));
    int pu = Integer.parseInt(JOptionPane.showInputDialog("Dame el pulso del corazon del animal: "));
    Animal vaca = new Animal();
    Corazon coraT = new Corazon(pe, pu);
    Corazon coraE = new Corazon(30, 80);
    Animal toro = new Animal(nameT, coraT);
    Animal becerro = new Animal("BECERRO", coraT);
    Animal elefante = new Animal("elefante", coraE);

    String nameP = JOptionPane.showInputDialog("Dame el nombre del perro: ");
    String pelaje = JOptionPane.showInputDialog("Dame el tipo de pelaje del perro: ");
    int peP = Integer.parseInt(JOptionPane.showInputDialog("Dame el peso de corazon del perro: "));
    int puP = Integer.parseInt(JOptionPane.showInputDialog("Dame el pulso del corazon del perro: "));
    Perro fifi = new Perro();
    Corazon  coraP = new Corazon(peP, puP);
    Perro firulais = new Perro(nameP, coraP, pelaje);

    String namePd = JOptionPane.showInputDialog("Dame el nombre del perro domesticado: ");
    String pelajeD = JOptionPane.showInputDialog("Dame el tipo de pelaje del perro domesticado: ");
    String razaD = JOptionPane.showInputDialog("Dame la raza del perro domesticado: ");
    int pePd = Integer.parseInt(JOptionPane.showInputDialog("Dame el peso de corazon del perro domesticado: "));
    int puPd = Integer.parseInt(JOptionPane.showInputDialog("Dame el pulso del corazon del perro domesticado: "));
    Corazon  coraPd = new Corazon(pePd, puPd);
    Perro soloVino = new PerroDomestico(namePd, coraPd, pelajeD, razaD);


    System.out.println(becerro.clonar().getNombre());
    System.out.println("EL corazon del "+toro.tieneMasCorazon(elefante)+" es mas grande");
    System.out.println(toro.soyElMismo(elefante));

    System.out.println(firulais.mismoPelaje(fifi));

 }
}
