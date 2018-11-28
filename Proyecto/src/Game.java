import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;

import java.awt.Rectangle;
import java.awt.event.*;
import javax.swing.*;

import org.omg.PortableInterceptor.SUCCESSFUL;

public class Game extends JPanel implements KeyListener, ActionListener{
	
	private boolean playGame = false, alreadyExecuted = false;
	private int score = 0;
	private static int indice;
	
	private int n = (int) (Math.random() * 5) + 3;
	private int m = (int) (Math.random() * 8) + 2;
	private int numberOfBricks = n*m;
	
	private Timer timer;
	private int delayTimer = 8;
	private int pause = 0;
	
	private int posPlayer = 280;		//paddle
	private int posBallX = 320;			//pos ball in paddle
	private int posBallY = 530;
	private int ballDirX = -1;			//generates movement
	private int ballDirY = -2;
	private int checkIfCanMove = 0;
	private static PlayerScore[] scores = new PlayerScore[15];
	
	
	
	
	private Map gameMap;
	private Sounds sounds;
	private ImageIcon exitIcon;
	
	

	
	public Game() {
		gameMap = new Map(n, m); 
		addKeyListener(this);
		setFocusable(true);		//up down left right keys
		setFocusTraversalKeysEnabled(false);
		timer = new Timer(delayTimer, this);
		timer.start();
		
		indice = 0 + PlayerScore.getIndex() + Breakout.getIndex(); // parte 1 del metodo para rebotar el index entre clases
		System.out.println(indice);
		
		// parte 4 (explicacion) como cada vez que apretamos play, se crea una nueva instancia de Game, entonces el indice se hace 0 cada vez, con lo que
		// al anadir mis puntuaciones en una misma sesion de juego (sin cerrar la ventana de men) terminaba sobreescribiendo las puntuaciones anteriores en la lista
		// esto queda solucionado pasandole el index a la clase PlayerScore, y haciendo que nos la regrese despues y sumandosela al 0 del index

		
		sounds = new Sounds();
		
		exitIcon = new ImageIcon("Icons/exit.png");
		
	}
	
	public void paint(Graphics g) {
		
		
		
		//background
		g.setColor(Color.BLACK);
		g.fillRect(1, 1, 692, 592);
		
		
		//bricks
		
		gameMap.draw((Graphics2D)g);
		
		//borders
		g.setColor(Color.yellow);
		g.fillRect(0, 0, 3, 592);	//left border
		g.fillRect(0, 0, 692, 3);	//up border
		g.fillRect(691, 0, 3, 592);	//right border
		
		//scores
		
		g.setColor(Color.WHITE);
		g.setFont(new Font("serif", Font.BOLD, 25));
		g.drawString(""+score, 590, 30);

		
		//paddle
		g.setColor(Color.green);
		g.fillRect(posPlayer, 550, 100, 8);
		
		//ball
		g.setColor(Color.red);
		g.fillOval(posBallX, posBallY, 20, 20);
		
		
		//win 
		if(numberOfBricks == 0) {
			playGame = false;
			ballDirX = 0;
			checkIfCanMove = 1;
			
			posBallY = -150;
			sounds.winSound();
			numberOfBricks = -1;
		}
		if(posBallY == -150) {

			g.setColor(Color.red);
			g.setFont(new Font("Impact", Font.BOLD, 60));
			g.drawString("GANASTE!", 230, 300);
			g.setFont(new Font("Impact", Font.BOLD, 30));
			g.drawString("Score: "+score, 280, 350);
			g.setColor(Color.blue);
			g.setFont(new Font("Impact", Font.BOLD, 25));
			g.drawString("Presiona ENTER para continuar y ESC para salir", 100, 400);
			
			
		}
		
		//Game Over
		if(posBallY > 570) {
			
			playGame = false;
			ballDirX = 0;
			checkIfCanMove = 1;
			
			posBallY = -100;
			sounds.gameOverSound(); 	
		}
		if(posBallY == -100) {
			g.setColor(Color.red);
			g.setFont(new Font("Impact", Font.BOLD, 60));
			g.drawString("GAME OVER", 195, 300);
			g.setFont(new Font("Impact", Font.BOLD, 30));
			g.drawString("Score: "+score, 280, 350);
			g.setColor(Color.blue);
			g.setFont(new Font("Impact", Font.BOLD, 25));
			g.drawString("Presiona ENTER para continuar y ESC para salir", 100, 400);
			if (alreadyExecuted == false) {
				if (indice == 15) {
					indice = 0;
				}
				scores[indice] = new PlayerScore(Breakout.getUserName(), score);
				System.out.println(indice);
				indice++;
			}
			alreadyExecuted = true;
		}
		
		
		g.dispose();
	}

	

	@Override
	public void actionPerformed(ActionEvent e) {
		
		timer.start();
		
		
		if(playGame == true) {
			//bounces on table
			if(new Rectangle(posBallX, posBallY, 20, 20).intersects(new Rectangle(posPlayer, 550, 100, 8))) {
			    ballDirY = -ballDirY;
			    sounds.tableSound();
			   }
			//break bricks
			B: for(int i = 0; i < gameMap.map.length; i++) {
				
				for(int j = 0; j < gameMap.map[0].length; j++) {
					
					if(gameMap.map[i][j] > 0) {
						
						int posBrickX = j * gameMap.brickWidth + 80;
						int posBrickY = i * gameMap.brickHeight + 50;
						int brickWidth = gameMap.brickWidth;
						int brickHeight = gameMap.brickHeight;
						
						
						Rectangle rect = new Rectangle(posBrickX, posBrickY, brickWidth, brickHeight);
						Rectangle ballRect = new Rectangle(posBallX, posBallY, 20, 20);
						Rectangle brickRect = rect;
						
						if(ballRect.intersects(brickRect)) {
							
							sounds.breakSound();
							
							gameMap.setBrickValue(0, i, j);
							numberOfBricks--;
							score += 5;
							
							
							if(posBallX + 19 <= brickRect.x || posBallX + 1  >= brickRect.x + brickRect.width) {//validate
								
								ballDirX = -ballDirX;
								
							}else {
								
								ballDirY = -ballDirY;
							}
							
							break B;
						}
						
					}
				}
				
			}
			
			posBallX += ballDirX;		//ball´s movement 
										
			posBallY += ballDirY;		//ball direction is negative so pos ball´s pos goes up
			
			
			
			if(posBallX < 0) {			//left border
				sounds.bounceSound();						
				ballDirX = -ballDirX;	//	ball direction is positive so pos goes down
			
			}
			
			
			if(posBallY < 0) { 			//top border
								
				sounds.bounceSound();
				ballDirY = -ballDirY;	//	ball direction is positive so pos goes down
				
				
			}
			
			if(posBallX > 670) {				//right border
				sounds.bounceSound();						
				ballDirX = -ballDirX;		//	ball direction is positive so pos goes down
				
			}
			
			
		}
		
		repaint();
		
	}

	
	
	
	
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	
	
	
	
	@Override
	public void keyPressed(KeyEvent e) {
		
		if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
			
			if(posPlayer >= 600){
				posPlayer = 600;
			}
			else {
				moveRight();
			}
			
		}
		if(e.getKeyCode() == KeyEvent.VK_LEFT) {
				
			if(posPlayer <= 10){
				posPlayer = 10;
			}
			else {
				moveLeft();
			}
		}
		if(e.getKeyCode() == KeyEvent.VK_ENTER) {
			
			if(playGame == false) {
				
				sounds.stopSound();
				checkIfCanMove = 0;
				playGame = true;
				posBallX = 320;
				posBallY = 530;
				ballDirX = -1;
				ballDirY = -2;
				posPlayer = 280;
				score = 0;		
				n = (int) (Math.random() * 5) + 3;
				m = (int) (Math.random() * 8) + 2;
				numberOfBricks = n*m;
				gameMap = new Map(n, m);
				alreadyExecuted = false;
				
				repaint();
			}
			
		}
		if(e.getKeyCode() == KeyEvent.VK_ESCAPE) {
			
			timer.stop();
			int exit = JOptionPane.showConfirmDialog(null, "�Quieres salir del juego?", "Salir", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE, exitIcon);
			if(exit == JOptionPane.YES_OPTION) {
		    Breakout.killGame();
			timer.stop();
			score = 0;
				
			}else {
				timer.restart();
			}

		}
		
		
		if(e.getKeyCode()== KeyEvent.VK_SPACE) { //pause
			
			switch(pause) {
				
			case 0:
				timer.stop();
				pause = 1;
				sounds.pauseSound();
				break;
			case 1:
				timer.restart();
				pause = 0;
				sounds.pauseSound();
				break;
			}
			
		}
				
	}
	
	
	
	public int getScore() {
		return score;
	}
	
	
	public void moveRight() {
		if(checkIfCanMove == 0) {
			playGame = true;
			posPlayer += 20;
		}
		
	}
	
	
	
	
	
	public void moveLeft() {
		if(checkIfCanMove == 0) {
			playGame = true;
			posPlayer -=20;
		}

	}
	


	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	public static PlayerScore[] getScores() {
		return scores;
	}
	public static int giveCurrentIndex() { // parte 2 del metodo para rebotar el index entre clases (continua en clase playerScore)
		return indice;
	} 

}
