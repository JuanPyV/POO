import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class CalWin extends JFrame implements ActionListener {

	private int operador;
	private double n, nDos, resp;
	private JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, bI, bR, bS, bD, bX, bC;
	private JTextField textField;
	private JPanel panelBotones, panelBotonesCero, panelOperadores;

	public CalWin(String titulo) {
		super(titulo);
		setSize(640, 480);
		setLocation(100, 100);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

		// setLayout(new GridLayout(2, 2));
		setLayout(new BorderLayout());

		b1 = new JButton("1");
		b1.setFont(new Font("Times New Roman",Font.PLAIN,30));
		b2 = new JButton("2");
		b2.setFont(new Font("Times New Roman",Font.PLAIN,30));
		b3 = new JButton("3");
		b3.setFont(new Font("Times New Roman",Font.PLAIN,30));
		b4 = new JButton("4");
		b4.setFont(new Font("Times New Roman",Font.PLAIN,30));
		b5 = new JButton("5");
		b5.setFont(new Font("Times New Roman",Font.PLAIN,30));
		b6 = new JButton("6");
		b6.setFont(new Font("Times New Roman",Font.PLAIN,30));
		b7 = new JButton("7");
		b7.setFont(new Font("Times New Roman",Font.PLAIN,30));
		b8 = new JButton("8");
		b8.setFont(new Font("Times New Roman",Font.PLAIN,30));
		b9 = new JButton("9");
		b9.setFont(new Font("Times New Roman",Font.PLAIN,30));
		b0 = new JButton("0");
		b0.setFont(new Font("Times New Roman",Font.PLAIN,30));
		bI = new JButton("=");
		bI.setFont(new Font("Times New Roman",Font.PLAIN,30));
		bS = new JButton("+");
		bS.setFont(new Font("Times New Roman",Font.PLAIN,30));
		bR = new JButton("-");
		bR.setFont(new Font("Times New Roman",Font.PLAIN,30));
		bX = new JButton("x");
		bX.setFont(new Font("Times New Roman",Font.PLAIN,30));
		bD = new JButton("/");
		bD.setFont(new Font("Times New Roman",Font.PLAIN,30));
		bC = new JButton("C/E");
		bC.setFont(new Font("Times New Roman",Font.PLAIN,30));
		

		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "1");
				n = Double.parseDouble(textField.getText());
			}
		});

		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "2");
				n = Double.parseDouble(textField.getText());
			}
		});

		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "3");
				n = Double.parseDouble(textField.getText());
			}
		});

		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "4");
				n = Double.parseDouble(textField.getText());
			}
		});

		b5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "5");
				n = Double.parseDouble(textField.getText());
			}
		});

		b6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "6");
				n = Double.parseDouble(textField.getText());
			}
		});

		b7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "7");
				n = Double.parseDouble(textField.getText());
			}
		});

		b8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "8");
				n = Double.parseDouble(textField.getText());
			}
		});

		b9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "9");
				n = Double.parseDouble(textField.getText());
			}
		});

		b0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "0");
				n = Double.parseDouble(textField.getText());
			}
		});
		
		bS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				n = Double.parseDouble(textField.getText());
				textField.setText(textField.getText() + "+");
				textField.setText("");
				nDos = n;
				operador = 1;				
			}
		});
		
		bR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {				
				n = Double.parseDouble(textField.getText());
				textField.setText(textField.getText() + "-");
				textField.setText("");
				nDos = n;
				operador = 2;				
			}
		});
		
		bX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				n = Double.parseDouble(textField.getText());
				textField.setText(textField.getText() + "x");
				textField.setText("");
				nDos = n;
				operador = 3;				
			}
		});
		
		bD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {				
				n = Double.parseDouble(textField.getText());
				textField.setText(textField.getText() + "/");
				textField.setText("");
				nDos = n;
				operador = 4;				
			}
		});
		
		bI.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (operador == 1) {
					resp = n + nDos;
					textField.setText(resp + "");
				}else if (operador == 2) {
					resp = nDos - n;
					textField.setText(resp + "");
				}else if (operador == 3) {
					resp = n * nDos;
					textField.setText(resp + "");
				}else if(operador == 4) {
					resp = nDos / n;
					textField.setText(resp + "");
				}
							
			}
		});
		
		bC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {				
				textField.setText("");
				n = 0;
				nDos = 0;
			}
		});

		textField = new JTextField();
		textField.setFont(new Font("Times New Roman",Font.PLAIN,30));
		textField.setPreferredSize(new Dimension(50, 80));
		

		panelBotones = new JPanel();
		panelBotones.setLayout(new GridLayout(3, 3));
		panelBotones.setPreferredSize(new Dimension(50, 50));
		panelBotones.add(b7);
		panelBotones.add(b8);
		panelBotones.add(b9);
		panelBotones.add(b4);
		panelBotones.add(b5);
		panelBotones.add(b6);
		panelBotones.add(b1);
		panelBotones.add(b2);
		panelBotones.add(b3);

		panelBotonesCero = new JPanel();
		panelBotonesCero.setLayout(new GridLayout(1, 2));
		panelBotonesCero.setPreferredSize(new Dimension(80, 80));
		panelBotonesCero.add(b0);
		panelBotonesCero.add(bI);
		

		panelOperadores = new JPanel();
		panelOperadores.setLayout(new GridLayout(5, 1));
		panelOperadores.setPreferredSize(new Dimension(100, 50));
		panelOperadores.add(bC);
		panelOperadores.add(bD);
		panelOperadores.add(bX);
		panelOperadores.add(bR);
		panelOperadores.add(bS);
		

		add(textField, BorderLayout.NORTH);
		add(panelBotones, BorderLayout.CENTER);
		add(panelBotonesCero, BorderLayout.SOUTH);
		add(panelOperadores, BorderLayout.EAST);

		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
