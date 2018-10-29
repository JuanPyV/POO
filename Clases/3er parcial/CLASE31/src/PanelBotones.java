import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class PanelBotones extends JPanel implements ConfiguradorDibujo {

	private JButton b1;
	private Color colorin;
	
	public PanelBotones() {
		
		b1 = new JButton("boton 1");
		setLayout(new GridLayout(1, 1));
		add(b1);
		
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				System.out.println("boton");
				colorin = JColorChooser.showDialog(PanelBotones.this, "elige un colorin", Color.BLACK);
				System.out.println(colorin);
			}
		});
	}

	@Override
	public int getFigura() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Color getColor() {
		// TODO Auto-generated method stub
		return null;
	}
}
