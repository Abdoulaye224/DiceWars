/**
 * A player class to keep all the information on a player throughout the game.
 * 
 * @author Carson Boyd
 * 
 */
public class Player {

	private int playerBonus = 0;
	private int playerScore = 0;

	private int playerNumber = 0;

	public Player(int number) {

		setPlayerNumber(number);

	}

	public int getPlayerBonus() {
		return playerBonus;
	}

	public void setPlayerBonus(int playerBonus) {
		this.playerBonus = playerBonus;
	}

	public int getPlayerScore() {
		return playerScore;
	}

	public void setPlayerScore(int playerScore) {
		this.playerScore = playerScore;
	}

	public int getPlayerNumber() {
		return playerNumber;
	}

	public void setPlayerNumber(int playerNumber) {
		this.playerNumber = playerNumber;
	}

}
