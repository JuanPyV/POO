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
		g.setColor(Color.RED);
		g.drawOval(10, 10, 100, 100);
		
		g.setColor(new Color(126, 171, 0));
		g.drawRect(10, 150, 100, 100);
		
		g.setColor(Color.BLACK);
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
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	
}
