
public class PlayerScore {
	
	private String name;
	private int score;
	
	public PlayerScore(String name, int score) {
		this.name = name;
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public int getScore() {
		return score;
	}
	
	public String giveData() {
		return name + ":" + score;
	}
	public static int getIndex(){  //parte 3 para rebotar el index de la clase game (siguiente paso en el paso 1 de nuevo en Game)
		return Game.giveCurrentIndex();
	}
	
	
}
