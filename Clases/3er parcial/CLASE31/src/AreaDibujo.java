import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JPanel;

public class AreaDibujo extends JPanel implements MouseListener {
	
	private ConfiguradorDibujo config;

	public AreaDibujo(ConfiguradorDibujo config) {
		
		addMouseListener(this);
		this.config = config;
	}
	
	public void paint(Graphics g){
		super.paint(g);
		
		// g.setColor(config.getColor());
		g.setColor(Color.GREEN);
		g.drawOval(10, 10, 100, 100);
		
		g.setColor(new Color(255, 171, 0));
		g.drawRect(10, 150, 100, 100);
		
		g.setColor(Color.BLUE);
		g.drawString("salu2", 30, 400);
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println(e.getX());
		System.out.println(e.getY());
		System.out.println(e.getXOnScreen());
		System.out.println(e.getYOnScreen());
		System.out.println("clicked");
		repaint();
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
