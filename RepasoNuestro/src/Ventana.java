import java.awt.BorderLayout;

import javax.swing.*;
import javax.swing.WindowConstants;


public class Ventana extends JFrame{
	
	private static String titulo = "Agenda Contactos";
	private JPanel menuAgenda;
	private JMenuBar barraMenu;
	private JLabel dato;
	
	public Ventana() {
		super(titulo);
		setSize(800,800);
		setLocation(600,600);
		
		
		menuAgenda = new JPanel(new BorderLayout());
		dato = new JLabel("hola");
		barraMenu = new JMenuBar();
		menuAgenda.add(dato);
		
		
		add(menuAgenda, BorderLayout.CENTER);
		setVisible(true);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
	}

}
