import java.util.Scanner;

/**
 * The class that takes the user input and will call the roll function in order
 * to add to a players score.
 * 
 * @author Carson Boyd
 * 
 */
public class InputReader {

	private Roller roller;

	public InputReader() {

		setRoller(new Roller());

	}

	/**
	 * Will retrieve a string from the users input and will either roll or bonus
	 * roll for the player.
	 * 
	 * @param player
	 *            - The Player whose turn it is.
	 * @param endNumber
	 *            - The final score that both players want to get to.
	 */
	public void receiveString(Player player, int endNumber) {

		String command = null;
		boolean finished = true;

		while (finished) {

			Scanner reader = new Scanner(System.in);
			System.out.println("Player " + player.getPlayerNumber() + ":");
			System.out.println("Action to take. 'roll' or 'bonus'.");
			// get user input for a
			command = reader.nextLine();

			if (command.compareTo("roll") == 0
					|| command.compareTo("Roll") == 0) {

				// roll command
				int score = getRoller().roll();

				player.setPlayerScore(player.getPlayerScore() + score);

				System.out.println();
				System.out.println("Player " + player.getPlayerNumber()
						+ " rolled " + score);
				System.out.println("You now have a score of "
						+ player.getPlayerScore() + " and are "
						+ (endNumber - player.getPlayerScore())
						+ " away from winning!");
				System.out.println();
				finished = false;

			} else if (command.compareTo("bonus") == 0
					|| command.compareTo("Bonus") == 0) {

				// bonus command
				if (player.getPlayerBonus() == 1) {

					System.out
							.println("Sorry you have already picked bonus and cannot use it again!");

				} else {

					int score = getRoller().roll();

					player.setPlayerScore(player.getPlayerScore() + score
							+ score);

					System.out.println();
					System.out.println("Player " + player.getPlayerNumber()
							+ " rolled " + score);
					System.out.println("And got a bonus of " + score);
					System.out.println("You now have a score of "
							+ player.getPlayerScore() + " and are "
							+ (endNumber - player.getPlayerScore())
							+ " away from winning!");
					System.out.println();

					player.setPlayerBonus(player.getPlayerBonus() + 1);
					finished = false;

				}

			}

		}

	}

	public Roller getRoller() {
		return roller;
	}

	public void setRoller(Roller roller) {
		this.roller = roller;
	}

}
