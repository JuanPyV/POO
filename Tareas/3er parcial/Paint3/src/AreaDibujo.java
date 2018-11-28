import java.awt.Color;
import java.util.LinkedList;

import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JPanel;

import com.sun.javafx.font.directwrite.RECT;
import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils.Text;

import figuras.increibles.*;
import jdk.nashorn.internal.runtime.ListAdapter;

public class AreaDibujo extends JPanel implements MouseListener {
	
	private ConfiguradorDibujo config;
	private LinkedList<Figura> figuras, listaFiguras;

	public LinkedList<Figura> getFiguras(){ return figuras;}
	
	public AreaDibujo(ConfiguradorDibujo config) {
		
		addMouseListener(this);
		this.config = config;
		figuras = new LinkedList<>();
	}
	
	public void paint(Graphics g){
		super.paint(g);
		
		// agregar varios dibujos es cuestión de manejar el arreglo figuras
		for(int i = 0; i < figuras.size(); i++) {			
			figuras.get(i).dibujar(g);
		}
		
		
	}
	
	public void abrir(File datos) {
		listaFiguras = new LinkedList<>();
		BufferedReader br;
		if (datos != null) {
			try {
				br = new BufferedReader(new FileReader(datos));
				String line = br.readLine();
				while(line != null) {
					String [] listaPropiedades = line.split(",");
					for(int c = 0; c < listaPropiedades.length; c++) {
						int x = Integer.parseInt(listaPropiedades[0]);
						int y = Integer.parseInt(listaPropiedades[1]);
						int t = Integer.parseInt(listaPropiedades[2]);
						Color color = new 
								Color(Integer.parseInt(listaPropiedades[3]), 
										Integer.parseInt(listaPropiedades[4]), 
												Integer.parseInt(listaPropiedades[5]));
						if ( t == 0) {
							Circulo circulo = new Circulo(x, y, t, color);
							listaFiguras.add(circulo);
						} else if( t == 1 ) {
							Rectangulo rectangulo = new Rectangulo(x, y, t, color);
							listaFiguras.add(rectangulo);
						}else if( t == 2 ) {
							Texto texto = new Texto(x, y, t, color);
							listaFiguras.add(texto);
						}
					}
					line = br.readLine();
				}
				figuras = listaFiguras;
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		
		switch(config.getFigura()) {
		
			case ConfiguradorDibujo.CIRCULO:
				figuras.add(new Circulo(
						e.getX(), 
						e.getY(), 
						ConfiguradorDibujo.CIRCULO, 
						config.getColor()));
				break;
			
			case ConfiguradorDibujo.RECTANGULO:
				figuras.add(new Rectangulo(
						e.getX(), 
						e.getY(), 
						ConfiguradorDibujo.RECTANGULO, 
						config.getColor()));
				break;
			
			case ConfiguradorDibujo.TEXTO:
				figuras.add(new Texto(
						e.getX(), 
						e.getY(), 
						ConfiguradorDibujo.TEXTO, 
						config.getColor()));
				break;
		}
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
