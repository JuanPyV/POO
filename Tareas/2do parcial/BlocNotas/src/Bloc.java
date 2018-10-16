import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.*;

public class Bloc extends JFrame implements ActionListener {

	private JTextArea area;
	private JFileChooser chooser;
	private String x;
	private FileWriter fw;
	
	// barra de menu
	private JMenuBar barrita;
	// menus
	private JMenu menu1, menu2;
	// items
	private JMenuItem item1, item2, item3;
	
	public Bloc(){
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
		
		item1.addActionListener(this);
		item2.addActionListener(this);
		
		barrita.add(menu1);
		
		menu1.add(item1);
		menu1.add(item2);
		
		
		add(area, BorderLayout.CENTER);
		
		setJMenuBar(barrita);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == item1) {
			
			int resultado = chooser.showSaveDialog(this);
			
			if(resultado == JFileChooser.APPROVE_OPTION) {
				x = chooser.getSelectedFile().getPath() + ".hw26";
				try {
					fw = new FileWriter(x);
					area.write(fw);
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		}
		
		if(e.getSource() == item2) {
			
			int resultado = chooser.showOpenDialog(this);
			
			if(resultado == JFileChooser.APPROVE_OPTION) {
				File y = chooser.getSelectedFile();
				BufferedReader tecsto;
				area.setText("");
				
				try {
					tecsto = new BufferedReader(new FileReader(y));
					String linea = tecsto.readLine();
					while(linea != null) {
						area.append(linea + "\n");
						linea = tecsto.readLine();
					}
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		}
	}
}