import java.util.Scanner;

public class InputReader {

	private Roller roller;

	public InputReader() {

		setRoller(new Roller());

	}

	public int receiveString(Player player, int endNumber) {

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
				int result = getRoller().roll();

				System.out.println();
				System.out.println("Player " + player.getPlayerNumber()
						+ " rolled " + result);
				System.out.println("You now have a score of "
						+ player.getPlayerScore() + " and are "
						+ (endNumber - player.getPlayerScore())
						+ " away from winning!");

				return result;

			} else if (command.compareTo("bonus") == 0
					|| command.compareTo("Bonus") == 0) {

				// bonus command
				if (player.getPlayerBonus() == 1) {

					System.out
							.println("Sorry you have already picked bonus and cannot use it again!");

				} else {

					int result = getRoller().roll();

					System.out.println();
					System.out.println("Player " + player.getPlayerNumber()
							+ " rolled " + result);
					System.out.println("And got a bonus of " + result);
					System.out.println("You now have a score of "
							+ player.getPlayerScore() + " and are "
							+ (endNumber - player.getPlayerScore())
							+ " away from winning!");

					player.setPlayerBonus(player.getPlayerBonus() + 1);

					return (result * 2);

				}

			}

		}
		return 0;

	}

	public Roller getRoller() {
		return roller;
	}

	public void setRoller(Roller roller) {
		this.roller = roller;
	}

}
