
public class ScoreComparator {
	
	public static PlayerScore compareScore(PlayerScore a, PlayerScore b) {
		if (a.getScore() > b.getScore()) {
			return a;
		} else {
			return b;
		}
	}
}
