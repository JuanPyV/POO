
import java.io.File;
import java.io.IOException;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;


public class Sounds {
	private String tema = "Sounds/tema.wav";
	private String bounceS = "Sounds/bounce.wav";
	private String soundTable = "Sounds/table.wav";
	private String pause = "Sounds/pause.wav";
	private String gameOverS = "Sounds/gameover.wav";
	private String breakBrick = "Sounds/break.wav";
	private String winS = "Sounds/win.wav";


	private AudioInputStream audioInputStream;
	private Clip clip;
	private boolean on = false;
	
	
	public void tableSound() {
		try {
			audioInputStream = AudioSystem.getAudioInputStream(new File(soundTable).getAbsoluteFile());
			clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
		} catch (UnsupportedAudioFileException | IOException e1) {		
			
			e1.printStackTrace();
		} catch (LineUnavailableException e1) {
			
			e1.printStackTrace();
		}
	}
	
	public void bounceSound() {
		try {
			audioInputStream = AudioSystem.getAudioInputStream(new File(bounceS).getAbsoluteFile());
			clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
		} catch (UnsupportedAudioFileException | IOException e1) {		
			
			e1.printStackTrace();
		} catch (LineUnavailableException e1) {
			
			e1.printStackTrace();
		}
	}
	
	public void breakSound() {
		try {
			audioInputStream = AudioSystem.getAudioInputStream(new File(breakBrick).getAbsoluteFile());
			 clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
		} catch (UnsupportedAudioFileException | IOException e1) {		
			
			e1.printStackTrace();
		} catch (LineUnavailableException e1) {
			
			e1.printStackTrace();
		}
	}
	
	public void pauseSound() {
		try {
			audioInputStream = AudioSystem.getAudioInputStream(new File(pause).getAbsoluteFile());
			 clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
		} catch (UnsupportedAudioFileException | IOException e1) {		
			
			e1.printStackTrace();
		} catch (LineUnavailableException e1) {
			
			e1.printStackTrace();
		}
	}
	
	public void gameOverSound() {
		try {
			audioInputStream = AudioSystem.getAudioInputStream(new File(gameOverS).getAbsoluteFile());
			clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
		} catch (UnsupportedAudioFileException | IOException e1) {		
			
			e1.printStackTrace();
		} catch (LineUnavailableException e1) {
			
			e1.printStackTrace();
		}
	}
	
	public void winSound() {
		try {
			audioInputStream = AudioSystem.getAudioInputStream(new File(winS).getAbsoluteFile());
			clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
		} catch (UnsupportedAudioFileException | IOException e1) {		
			
			e1.printStackTrace();
		} catch (LineUnavailableException e1) {
			
			e1.printStackTrace();
		}
	}
	
	public void themeSound() {
		try {
			
			audioInputStream = AudioSystem.getAudioInputStream(new File(tema).getAbsoluteFile());
			clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
			clip.loop(Clip.LOOP_CONTINUOUSLY);
			on = true;
		} catch (UnsupportedAudioFileException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (LineUnavailableException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void stopSound() {
		if (on == true) {
			clip.stop();
		}
	}

}
