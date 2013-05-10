import java.util.Random;

/**
 * A separate class for a random roll of the die to be cast.
 * 
 * @author Carson Boyd
 * 
 */
public class Roller {

	public Roller() {

	}

	/**
	 * The random die roll function in order to determine a random integer
	 * within a six sided die.
	 * 
	 * @return
	 */
	public int roll() {

		Random roller = new Random();
		int roll = roller.nextInt(6) + 1;
		return roll;

	}
}
