import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class PanelBotones extends JPanel implements ConfiguradorDibujo {

	private JButton b1, bT, bR, bC;
	private Color colorin;

	public PanelBotones() {

		JButton b1 = new JButton();
		ImageIcon textImage = new ImageIcon("text.bmp");
		b1.setIcon(new ImageIcon(textImage.getImage().getScaledInstance(b1.HEIGHT, b1.WIDTH, Image.SCALE_SMOOTH)));
		
		bT = new JButton("Triangulo");
		bR = new JButton("Rectangulo");
		bC = new JButton("Circulo");
		setLayout(new GridLayout(4, 1));
		add(bT);
		add(bR);
		add(bC);
		add(b1);

		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				System.out.println("boton");
				colorin = JColorChooser.showDialog(PanelBotones.this, "elige un colorin", Color.BLACK);
				System.out.println(colorin);
			}
		});

		bT.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
			}
		});

		bR.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		bC.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
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
