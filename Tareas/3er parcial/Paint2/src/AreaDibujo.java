import java.awt.Color;

import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JPanel;
import figuras.increibles.*;

public class AreaDibujo extends JPanel implements MouseListener{
	
	private ConfiguradorDibujo config;
	private Figura[] figuras;
	private int x,y, c = 0;

	public AreaDibujo(ConfiguradorDibujo config) {
		
		addMouseListener(this);
		this.config = config;
		figuras = new Figura[50];
	}
	
	public void paint(Graphics g){
		super.paint(g);
		
		// agregar varios dibujos es cuestión de manejar el arreglo figuras
		
		g.setColor(config.getColor());
		
		switch(config.getFigura()) {
		
			case ConfiguradorDibujo.CIRCULO:
				g.drawOval(x, y, 100, 100);
				Figura circulo = new Figura(x, y, config.getFigura(), config.getColor());
				figuras[c] = circulo; 
				c += 1;
				break;
			
			case ConfiguradorDibujo.RECTANGULO:
				g.drawRect(x, y, 100, 100);
				Figura rectangulo = new Figura(x, y, config.getFigura(), config.getColor());
				figuras[c] = rectangulo; 
				c += 1;
				break;
			
			case ConfiguradorDibujo.TEXTO:
				g.drawString("salu2", x, y);
				Figura texto = new Figura(x, y, config.getFigura(), config.getColor());
				figuras[c] = texto; 
				c += 1;
				break;
		}
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println(e.getX());
		System.out.println(e.getY());
		x = e.getX();
		y = e.getY();
		repaint();
	}
	
	public String datos() {
		return figuras[c-1].toString();
	}

	@Override
	public void mousePressed(MouseEvent e) {
		System.out.println("pressed");
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		System.out.println("released");
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		System.out.println("entered");
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		System.out.println("exited");
		
	}
}
