import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Ventana extends JFrame implements ActionListener {

	JButton b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, bSuma, bResta, bMultiplica, bDivide, bIgual;
	JTextField textField;
	JPanel panelBotones;
	float operandos[];
	int operandoActual;
	char operador;
	boolean borrarNumero;
	
	public Ventana() {
		super("CALCULADORA");
		setSize(400, 600);
		
		operandos = new float[2];
		operandoActual = 0;
		borrarNumero = false;
		
		b0 = new JButton("0");
		b1 = new JButton("1");
		b2 = new JButton("2");
		b3 = new JButton("3");
		b4 = new JButton("4");
		b5 = new JButton("5");
		b6 = new JButton("6");
		b7 = new JButton("7");
		b8 = new JButton("8");
		b9 = new JButton("9");
		bSuma = new JButton("+");
		bResta = new JButton("-");
		bMultiplica = new JButton("*");
		bDivide = new JButton("/");
		bIgual = new JButton("=");
		
		b0.addActionListener(this);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		bSuma.addActionListener(this);
		bResta.addActionListener(this);
		bMultiplica.addActionListener(this);
		bDivide.addActionListener(this);
		bIgual.addActionListener(this);
		
		textField = new JTextField();
		
		panelBotones = new JPanel();
		
		panelBotones.setLayout(new GridLayout(5, 3));
		panelBotones.add(b0);
		panelBotones.add(b1);
		panelBotones.add(b2);
		panelBotones.add(b3);
		panelBotones.add(b4);
		panelBotones.add(b5);
		panelBotones.add(b6);
		panelBotones.add(b7);
		panelBotones.add(b8);
		panelBotones.add(b9);
		panelBotones.add(bSuma);
		panelBotones.add(bResta);
		panelBotones.add(bMultiplica);
		panelBotones.add(bDivide);
		panelBotones.add(bIgual);
		
		setLayout(new BorderLayout());
		add(textField, BorderLayout.NORTH);
		add(panelBotones, BorderLayout.CENTER);
		
		
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setVisible(true);
	}

	
	private void numeroPresionado(int numero) {
		if(borrarNumero) {
			textField.setText("");
			borrarNumero = false;
		}
			
		textField.setText(textField.getText() + numero);
	}
	
	private void operacion(char operador) {
		
		if(operandoActual == 1) {
			hacerOperacion();
		}
		
		operandos[0] = Float.parseFloat(textField.getText());
		this.operador = operador;
		System.out.println(operador);
		operandoActual = 1;
		borrarNumero = true;
		
	}
	
	private void hacerOperacion() {
		
		float resultado = 0;
		
		operandos[1] = Float.parseFloat(textField.getText());
		
		System.out.println(operador);
		switch(operador) {
			case '+':
				resultado = operandos[0] + operandos[1];
				break;
			case '-':
				resultado = operandos[0] - operandos[1];
				break;
			case '*':
				resultado = operandos[0] * operandos[1];
				break;
			case '/':
				resultado = operandos[0] / operandos[1];
				break;
		}
		
		textField.setText(resultado + "");
		borrarNumero = true;
		System.out.println(resultado);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {

		if(e.getSource() == b0) numeroPresionado(0);
		if(e.getSource() == b1) numeroPresionado(1);
		if(e.getSource() == b2) numeroPresionado(2);
		if(e.getSource() == b3) numeroPresionado(3);
		if(e.getSource() == b4) numeroPresionado(4);
		if(e.getSource() == b5) numeroPresionado(5);
		if(e.getSource() == b6) numeroPresionado(6);
		if(e.getSource() == b7) numeroPresionado(7);
		if(e.getSource() == b8) numeroPresionado(8);
		if(e.getSource() == b9) numeroPresionado(9);
		if(e.getSource() == bSuma) operacion('+');
		if(e.getSource() == bResta) operacion('-');
		if(e.getSource() == bMultiplica) operacion('*');
		if(e.getSource() == bDivide) operacion('/');
		if(e.getSource() == bIgual) hacerOperacion();
		
	}
}
