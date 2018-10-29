import javax.swing.*;

import com.sun.java.swing.plaf.windows.resources.windows;

import sun.font.CCompositeGlyphMapper;

import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ventana extends JFrame implements ActionListener{
	
	private JPanel panel, panelAbajo;
	private JLabel tipoL, nombreL, baseL, alturaL, figuraL, figura2L;
	private JButton anteriorB, siguienteB, nuevoB, guardarB, compararPB, compararAB;
	private JTextField tipoT, nombreT, baseT, alturaT, figuraT, figura2T, resultadoT;
	
	
	Rectangulo rect1 = new Rectangulo(2, 5, "Rectangulito");
	Circulo circ1 = new Circulo(3, "Circulito");
	TrianguloEquilatero trian1 = new TrianguloEquilatero(3, 3, "Triangulito");
	private int pos = 0;
	
	private Figura[] arr = {rect1, circ1, trian1};
	
	public Ventana() {
		
		 super("FIGURAS");
		 setSize(640, 480);
		 setLocation(100,  100);		 
		 setDefaultCloseOperation(EXIT_ON_CLOSE);
		 
		 setLayout(new BorderLayout());
		 
		 tipoL = new JLabel("Tipo");
		 tipoL.setHorizontalAlignment((int) CENTER_ALIGNMENT);
		 nombreL = new JLabel("Nombre");
		 nombreL.setHorizontalAlignment((int) CENTER_ALIGNMENT);
		 baseL = new JLabel("Base / Radio");
		 baseL.setHorizontalAlignment((int) CENTER_ALIGNMENT);
		 alturaL = new JLabel("Altura");
		 alturaL.setHorizontalAlignment((int) CENTER_ALIGNMENT);
		 figuraL = new JLabel("Figura 1");
		 figuraL.setHorizontalAlignment((int) CENTER_ALIGNMENT);
		 figura2L = new JLabel("Figura 2");
		 figura2L.setHorizontalAlignment((int) CENTER_ALIGNMENT);
		 
		 anteriorB = new JButton("Anterior");
		 siguienteB = new JButton("Siguiente");
		 nuevoB = new JButton("Nuevo");
		 guardarB = new JButton("Guardar");
		 compararAB = new JButton("Comparar area");
		 compararPB = new JButton("Comparar perimetro");
		 
		 tipoT = new JTextField(arr[pos].getTipo());
		 nombreT = new JTextField(arr[pos].getNombre());
		 baseT = new JTextField(arr[pos].getBase());
		 alturaT = new JTextField(arr[pos].getAltura());
		 figuraT = new JTextField();
		 figura2T = new JTextField();
		 resultadoT = new JTextField();
		 
		 panel = new JPanel();		 
		 panel.setLayout(new GridLayout(9, 2));
		 panel.setPreferredSize(new Dimension(50, 50));
		 
		 panel.add(tipoL);		 
		 panel.add(tipoT);
		 panel.add(nombreL);
		 panel.add(nombreT);
		 panel.add(baseL);
		 panel.add(baseT);
		 panel.add(alturaL);
		 panel.add(alturaT);
		 panel.add(anteriorB);
		 panel.add(siguienteB);
		 panel.add(guardarB);
		 panel.add(nuevoB);
		 panel.add(figuraL);
		 panel.add(figuraT);
		 panel.add(figura2L);
		 panel.add(figura2T);
		 panel.add(compararPB);
		 panel.add(compararAB);
		 
		 panelAbajo = new JPanel();
		 panelAbajo.setLayout(new GridLayout(1, 1));
		 panelAbajo.setPreferredSize(new Dimension(10, 50));
		 
		 panelAbajo.add(resultadoT);		 		 
		 
		 add(panel, BorderLayout.CENTER);
		 add(panelAbajo, BorderLayout.SOUTH);
		 
		 
		 anteriorB.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				tipoT.setText(arr[pos-1].getTipo());
				nombreT.setText(arr[pos-1].getNombre());
				pos -= 1;	
								
			}
		});		 
		 
		 siguienteB.addActionListener(new ActionListener() {			
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					tipoT.setText(arr[pos+1].getTipo());
					nombreT.setText(arr[pos+1].getNombre());
					pos += 1;					
					
				}
			});
		 
		 nuevoB.addActionListener(new ActionListener() {			
				@Override
				public void actionPerformed(ActionEvent e) {
					tipoT.setText("");
					nombreT.setText("");
					baseT.setText("");
					alturaT.setText("");
					figuraT.setText("");
					figura2T.setText("");
					pos = 0;
					
					
				}
			});
		 
		 guardarB.addActionListener(new ActionListener() {			
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					
				}
			});
		 
		 compararAB.addActionListener(new ActionListener() {			
				@Override
				public void actionPerformed(ActionEvent e) {
					int x = Integer.parseInt(figuraT.getText());
					int y = Integer.parseInt(figura2T.getText());
					if (arr[x].getArea()>arr[y].getArea()){
						resultadoT.setText(arr[x].getNombre());
					}
					
					
				}
			});
		 
		 compararPB.addActionListener(new ActionListener() {			
				@Override
				public void actionPerformed(ActionEvent e) {
					int x = Integer.parseInt(figuraT.getText());
					int y = Integer.parseInt(figura2T.getText());
					if (arr[x].getPerimetro()>arr[y].getPerimetro()){
						resultadoT.setText(arr[x].getNombre());
					}
					
				}
			});
		 
		 
		 
		 
		 
		 setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	

	
	

}
