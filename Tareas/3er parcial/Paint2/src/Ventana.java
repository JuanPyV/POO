import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.*;

import figuras.increibles.Figura;

public class Ventana extends JFrame {

	// constantes 
	// valores que no van a cambiar
	// normalmente utilizados cuando hay un valor recurrente
	public static final int EJEMPLO = 1;
	public static final int EJEMPLO_SEGUNDO = 2;
	
	private PanelBotones botones;
	private AreaDibujo areaDibujo;
	private JTextArea textito;
	private JButton guardar, saveArchivo;
	private JFileChooser chooser;
	private String x;
	private FileWriter fw;
	private JMenuBar menu;
	private JMenu opciones;
	
	public Ventana() {
		super("PAINT 2");
		setSize(800,800);
		setLocation(200,200);
		
		botones = new PanelBotones();
		areaDibujo = new AreaDibujo(botones);
		textito = new JTextArea();
		textito.setPreferredSize(new Dimension(300, 800));
		
		
		menu = new JMenuBar();
		setJMenuBar(menu);
		
		guardar = new JButton("Registro");
		saveArchivo = new JButton("Guardar");
		
		menu.add(guardar);
		menu.add(saveArchivo);
		
		//add(b1);
		setLayout(new BorderLayout());
		add(botones, BorderLayout.WEST);
		add(areaDibujo, BorderLayout.CENTER);
		add(textito, BorderLayout.EAST);
		
		guardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textito.append(areaDibujo.datos() + "\n");
				
			}
		});
		
		saveArchivo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					chooser = new JFileChooser();
					int resultado = chooser.showSaveDialog(Ventana.this);					
					if(resultado == JFileChooser.APPROVE_OPTION) {
						x = chooser.getSelectedFile().getPath();
						try {
							fw = new FileWriter(x);
							textito.write(fw);
						} catch (IOException e1) {
							e1.printStackTrace();
						}
					}
				}
		});
		
		
		setVisible(true);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}

	@Override
	public void paint(Graphics g) {
		super.paint(g);
	}
	
	
}
