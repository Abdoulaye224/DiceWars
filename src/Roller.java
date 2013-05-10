import java.util.Random;

public class Roller {

	public Roller() {

	}

	public int roll() {

		Random roller = new Random();
		int roll = roller.nextInt(6) + 1;
		return roll;
	}
}
