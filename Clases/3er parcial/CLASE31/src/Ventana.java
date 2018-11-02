import java.awt.*;
import javax.swing.*;

public class Ventana extends JFrame {

	// constantes 
	// valores que no van a cambiar
	// normalmente utilizados cuando hay un valor recurrente
	public static final int EJEMPLO = 1;
	public static final int EJEMPLO_SEGUNDO = 2;
	
	private PanelBotones botones;
	private AreaDibujo areaDibujo;
	
	public Ventana() {
		super("PAINT 2");
		setSize(800,800);
		setLocation(200,200);
		
		botones = new PanelBotones();
		areaDibujo = new AreaDibujo(botones);
		
		//add(b1);
		setLayout(new BorderLayout());
		add(botones, BorderLayout.WEST);
		add(areaDibujo, BorderLayout.CENTER);
		
		setVisible(true);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}

	@Override
	public void paint(Graphics g) {
		super.paint(g);
	}
	
	
}
