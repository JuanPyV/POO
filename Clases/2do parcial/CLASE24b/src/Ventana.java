import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Ventana extends JFrame implements ActionListener {

	private JTextArea area;
	private JFileChooser chooser;
	
	// barra de menu
	private JMenuBar barrita;
	// menus
	private JMenu menu1, menu2;
	// items
	private JMenuItem item1, item2, item3;
	
	public Ventana(){
		super("EDITOR");
		setSize(400,400);
		setLocation(200, 200);
		setLayout(new BorderLayout());
		
		chooser = new JFileChooser();
		
		area = new JTextArea();
		barrita = new JMenuBar();
		
		menu1 = new JMenu("File");
		menu2 = new JMenu("More choices");
		
		item1 = new JMenuItem("Save");
		item2 = new JMenuItem("Load");
		item3 = new JMenuItem("etc");
		
		item1.addActionListener(this);
		item2.addActionListener(this);
		item3.addActionListener(this);
		
		barrita.add(menu1);
		
		menu1.add(item1);
		menu1.add(item2);
		menu1.add(menu2);
		
		menu2.add(item3);
		
		
		add(area, BorderLayout.CENTER);
		
		setJMenuBar(barrita);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("PRESIONADO!");
		if(e.getSource() == item1) {
			// save
			int resultado = chooser.showSaveDialog(this);
			
			if(resultado == JFileChooser.APPROVE_OPTION) {
				System.out.println(chooser.getSelectedFile().getPath());
			}
		}
		
		if(e.getSource() == item2) {
			// load
			
			int resultado = chooser.showOpenDialog(this);
			
			if(resultado == JFileChooser.APPROVE_OPTION) {
				System.out.println(chooser.getSelectedFile().getPath());
			}
		}
	}
}
