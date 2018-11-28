import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.*;

public class Breakout extends JFrame{
	
	private JButton play, instructions, scores, exit;
	private JPanel panelButtons;
	private JLabel title, background;
	private ImageIcon fondo, icono, fondoInstrucciones, userIcon;
	private static JFrame juego;
	private JFrame instructionsScreen;
	private int posicionActual = 0, biggerScore = 0, biggerScorePosition = 0, lowerScore = 99999999, lowerScorePosition = 0;
	private static int index = 0;
	private Game game;
	private JFileChooser chooser;
	private static String name = "Default";
	private static PlayerScore[] scoreList;
	
	
	public Breakout() {
		
		
		super("Breakout");
		setSize(700, 600);
		setLocation(400, 200);
		
		scoreList = new PlayerScore[15];
		
		icono = new ImageIcon("icono.png");
		setIconImage(icono.getImage());
		
		userIcon = new ImageIcon("Icons/user.png");

		Sounds sounds = new Sounds();
		sounds.themeSound();
		
		chooser = new JFileChooser();
		
		fondo = new ImageIcon("fondo.png");
		fondoInstrucciones = new ImageIcon("fondoInstrucciones.png");
		background = new JLabel(new ImageIcon("fondoNombres.png"));
		
		play = new JButton("Jugar");
		play.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				int cuantos = 0;
				for (int i = 0; i < Game.getScores().length; i++) {
					if (Game.getScores()[i] != null) {
						cuantos++;
					}
				}
				System.out.println(cuantos);
				scoreList = Game.getScores();
				name = (String) JOptionPane.showInputDialog(null,"¿Cual es tu nombre?","Usuario", JOptionPane.INFORMATION_MESSAGE,userIcon, null,"");
				if (name == null) {
					name = "Default";
				}
				if(name.equals("")) {
					name = "Default";
				}
				juego = new JFrame();
				juego.setSize(700, 600);
				juego.setIconImage(icono.getImage());
				juego.setLocation(400, 200);
				game = new Game();
				juego.add(game);
				juego.setVisible(true);
				juego.setResizable(false);
				sounds.stopSound();
			}
		});
		play.setOpaque(false);
		play.setContentAreaFilled(false);
		play.setIcon(fondo);
		play.setPreferredSize(new Dimension(100, 50));
		play.setForeground(Color.WHITE);
		play.setHorizontalTextPosition(JButton.CENTER);
		play.setVerticalTextPosition(JButton.CENTER);
		play.setFont(new Font("Times New Roman", Font.BOLD, 20));
		
		instructions = new JButton("Instrucciones");
		instructions.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				instructionsScreen = new JFrame();
				instructionsScreen.setLayout(new GridLayout(1,1));
				JLabel fondoInstruccionesLabel = new JLabel(fondoInstrucciones);
				instructionsScreen.setIconImage(icono.getImage());
				instructionsScreen.add(fondoInstruccionesLabel);
				instructionsScreen.setSize(500, 500);
				instructionsScreen.setLocation(550, 300);
				instructionsScreen.setResizable(false);
				instructionsScreen.setVisible(true);
				
				
			}
		});
		instructions.setOpaque(false);
		instructions.setContentAreaFilled(false);
		instructions.setIcon(fondo);
		instructions.setPreferredSize(new Dimension(100, 50));
		instructions.setForeground(Color.WHITE);
		instructions.setHorizontalTextPosition(JButton.CENTER);
		instructions.setVerticalTextPosition(JButton.CENTER);
		instructions.setFont(new Font("Times New Roman", Font.BOLD, 20));
		
		scores = new JButton("Puntuaciones");
		scores.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				JFrame scoresFrame = new JFrame("Puntuaciones");
				scoresFrame.setIconImage(icono.getImage());
				scoresFrame.setLayout(new BorderLayout());
				JPanel scorePanel = new JPanel(new GridLayout(1,3));
				JButton left = new JButton("<--");
				JButton right = new JButton("-->");
				JLabel showScore = new JLabel();
				try {
					showScore.setText(scoreList[0].giveData());
				} catch (NullPointerException e) {
					e.getStackTrace();
					showScore.setText("(Here would go your score)");
				}
				scorePanel.add(left);
				scorePanel.add(showScore);
				scorePanel.add(right);
				scorePanel.setPreferredSize(new Dimension(150, 150));
				JPanel menuPanel = new JPanel(new GridLayout(5, 2));
				JLabel score1 = new JLabel("Score 1");
				JLabel score2 = new JLabel("Score 2");
				JTextArea score1Text = new JTextArea();
				JTextArea score2Text = new JTextArea();
				JButton compare = new JButton("Compare");
				JLabel compareLabel = new JLabel();
				JButton removeH = new JButton("Remove Highest");
				JButton removeL = new JButton("Remove Lowest");
				JButton save = new JButton("Save scores");
				JButton load = new JButton("Load scores");
				menuPanel.add(score1);
				menuPanel.add(score1Text);
				menuPanel.add(score2);
				menuPanel.add(score2Text);
				menuPanel.add(compare);
				menuPanel.add(compareLabel);
				menuPanel.add(removeH);
				menuPanel.add(removeL);
				menuPanel.add(save);
				menuPanel.add(load);
				menuPanel.setPreferredSize(new Dimension(350, 350));
				
				scoresFrame.add(menuPanel, BorderLayout.SOUTH);
				scoresFrame.add(scorePanel, BorderLayout.CENTER);
				
				scoresFrame.setSize(500, 500);
				scoresFrame.setVisible(true);
				
				left.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						posicionActual = posicionActual-1;
						if (posicionActual < 0) {
							posicionActual = 14;
						}
						try {
							showScore.setText(scoreList[posicionActual].giveData());
						} catch(NullPointerException error) {
							error.getStackTrace();
							showScore.setText("");
						}
					}
				});
				
				right.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						posicionActual = posicionActual+1;
						if (posicionActual > 14) {
							posicionActual = 0;
						}
						try {
							showScore.setText(scoreList[posicionActual].giveData());
						} catch(NullPointerException e4) {
							e4.getStackTrace();
							showScore.setText("");
						}						
					}
				});
				
				compare.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						try {
							int compare1 = Integer.parseInt(score1Text.getText());
							int compare2 = Integer.parseInt(score2Text.getText());
							System.out.println(compare1);
							System.out.println(compare2);
							System.out.println(scoreList[compare1].getScore());
							System.out.println(scoreList[compare2].getScore());
							String winner = ScoreComparator.compareScore(scoreList[compare1], scoreList[compare2]).getName();
							compareLabel.setText(winner);
						} catch (NumberFormatException e3) {
							e3.getStackTrace();
							compareLabel.setText("Incorrect Format");
						} catch (NullPointerException e2) {
							e2.getStackTrace();
							compareLabel.setText("Incorrect Format");
						}
					}
				});
				
				removeH.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						
						biggerScore = 0;
						for(int i = 0; i < scoreList.length; i++) {
							try {
								if (scoreList[i].getScore() > biggerScore) {
									biggerScore = scoreList[i].getScore();
									biggerScorePosition = i;
								}
							} catch (NullPointerException e1) {
								e1.getStackTrace();
							}
						}
						scoreList[biggerScorePosition] = null;
					}
				});
				
				removeL.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						
						lowerScore = 99999999;
						for(int i = 0; i < scoreList.length; i++) {
							try {
								if (scoreList[i].getScore() < lowerScore) {
									lowerScore = scoreList[i].getScore();
									lowerScorePosition = i;
								}
							} catch(NullPointerException e1) {
								e1.getStackTrace();
							}
						}
						scoreList[lowerScorePosition] = null;
					}
				});
				
				save.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent arg0) {
						int resultado = chooser.showSaveDialog(Breakout.this);
						if (resultado == JFileChooser.APPROVE_OPTION) {
							String path = chooser.getSelectedFile().getPath() + ".txt";
							try {
								FileWriter fw = new FileWriter(path);
								BufferedWriter bw = new BufferedWriter(fw);
								PrintWriter pw = new PrintWriter(bw);
								for(int i = 0; i < scoreList.length; i++) {
									try {
										pw.println(scoreList[i].giveData());
									} catch(NullPointerException e1) {
										e1.getStackTrace();
									}
								}
								pw.close();
								
							} catch (IOException e1) {
								e1.printStackTrace();
							}
						}
						
					}
				});	
				
				load.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						int resultado = chooser.showOpenDialog(Breakout.this);
						PlayerScore[] loadedScoreList = new PlayerScore[15];
						posicionActual = 0;
						int index2 = 0;
						if (resultado == JFileChooser.APPROVE_OPTION) {
							File archivo = chooser.getSelectedFile().getAbsoluteFile();
							BufferedReader in;
							if (archivo != null) {
								try {
									in = new BufferedReader(new FileReader(archivo));
									String linea = in.readLine();
									while(linea != null){
										String [] datosRecortados = linea.split(":");
										for(int i=0; i < datosRecortados.length; i++) {
											String nameLoaded = datosRecortados[0];
											int scoreLoaded = Integer.parseInt(datosRecortados[1]);
											PlayerScore playerLoaded = new PlayerScore(nameLoaded, scoreLoaded);
											loadedScoreList[index2] = playerLoaded;
										}
										index2++;
									  linea = in.readLine();
									}
									showScore.setText(loadedScoreList[0].giveData());
									scoreList = loadedScoreList;
									for (int i = 0; i < scoreList.length; i++) {
										if (scoreList[i] != null) {
											index++;
										}
									}
								} catch (FileNotFoundException e1) {
									// TODO Auto-generated catch block
									e1.printStackTrace();
								} catch (IOException e1) {
									// TODO Auto-generated catch block
									e1.printStackTrace();
								}
							}
						}
					}
				});
			}
		});
		scores.setOpaque(false);
		scores.setContentAreaFilled(false);
		scores.setIcon(fondo);
		scores.setPreferredSize(new Dimension(100, 50));
		scores.setForeground(Color.WHITE);
		scores.setHorizontalTextPosition(JButton.CENTER);
		scores.setVerticalTextPosition(JButton.CENTER);
		scores.setFont(new Font("Times New Roman", Font.BOLD, 20));
		
		exit = new JButton("Salir");
		exit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		exit.setOpaque(false);
		exit.setContentAreaFilled(false);
		exit.setIcon(fondo);
		exit.setPreferredSize(new Dimension(100, 50));
		exit.setForeground(Color.WHITE);
		exit.setHorizontalTextPosition(JButton.CENTER);
		exit.setVerticalTextPosition(JButton.CENTER);
		exit.setFont(new Font("Times New Roman", Font.BOLD, 20));
		
		panelButtons = new JPanel();
		title = new JLabel("Breakout", SwingConstants.CENTER);
		title.setIcon(fondo);
		title.setText("Breakout");
		title.setFont(new Font("Courier", Font.ITALIC, 60));
		title.setPreferredSize(new Dimension(300, 105));
		title.setForeground(Color.WHITE);
		title.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
		title.setVerticalTextPosition(javax.swing.SwingConstants.CENTER);
		
		panelButtons.setLayout(new GridLayout(5, 1));
		panelButtons.add(title);
		panelButtons.add(play);
		panelButtons.add(instructions);
		panelButtons.add(scores);
		panelButtons.add(exit);
		
		setLayout(new BorderLayout());
        add(background);
        background.setLayout(new FlowLayout());
        background.add(panelButtons);
        

		
		
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setVisible(true);
		setResizable(false);
		
	}
	
	public static void killGame() {
		juego.setVisible(false);
	}
	
	public static String getUserName() {
		return name;
	}
	public static int getIndex() {
		return index;
	}
}
