// 2 librerías para GUI en java
// awt (la viejita)
// swing (la nueva) (incluye o usa awt)

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

// para tener una ventana es necesario heredar de JFrame
public class Ventana extends JFrame implements ActionListener {

	// widgets - elementos de GUI
	private JButton b1, b2, b3, b4;
	private JTextField textField;
	private JLabel label;
	private JPanel panelBotones;
	
	public Ventana(String titulo) {
		super(titulo);
		setSize(640, 480);
		setLocation(100, 100);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		//setLayout(new GridLayout(2, 2));
		setLayout(new BorderLayout());
		
		b1 = new JButton("1");
		b2 = new JButton("2");
		b3 = new JButton("3");
		b4 = new JButton("4");
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		
		// CLASE ANÓNIMA
		// existe la posibilidad de declarar una clase de uso único
		// que implemente una interfaz / herede de una clase abstracta
		b4.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				// nota: this
				// this - se refiere a la clase anónima
				// Ventana.this - referencia al objeto ventana que contiene
				// esta clase
				System.out.println("ES UN CUATRO!");
			}
		});
		
		textField = new JTextField();
		
		panelBotones = new JPanel();
		panelBotones.setLayout(new GridLayout(2,2));
		panelBotones.add(b1);
		panelBotones.add(b2);
		panelBotones.add(b3);
		panelBotones.add(b4);
		
		add(textField, BorderLayout.NORTH);
		add(panelBotones, BorderLayout.CENTER);
		
		/*
		label = new JLabel("Labelcita");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		
		add(b1, BorderLayout.NORTH);
		//add(b2, BorderLayout.WEST);
		add(textField, BorderLayout.CENTER);
		//add(label, BorderLayout.SOUTH);
		*/
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println(e.getActionCommand());
		if(e.getActionCommand().equals("1")) {
			System.out.println("UNO!");
		}
		if(e.getSource() == b2) {
			System.out.println("DOS!");
			textField.setText("HOLA!");
		}
	}
	
}
