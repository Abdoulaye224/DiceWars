/**
 * Dice Wars is a simple game that involves two players rolling a die in order
 * to see who can get to 18 first. It involves a bonus roll component in order
 * for a player to get a 'x2' roll.
 * 
 * @author Carson Boyd
 */
public class DiceWars {

	public static void main(String[] args) {

		Player player1 = new Player(1);
		Player player2 = new Player(2);

		int endNumber = 18;

		int playerTurn = 0; // 0 means player 1, 1 means player 2.

		boolean running = true;

		InputReader ir = new InputReader();

		System.out.println("Dice Wars");
		System.out.println("---------");
		System.out.println();
		System.out.println();

		while (running) {

			// players take turns to roll dice.

			// by typing in 'roll' or 'bonus'
			// otherwise just calls please type in ...

			if (playerTurn == 0) {

				ir.receiveString(player1, endNumber);

				playerTurn++;

				if (player1.getPlayerScore() >= endNumber) {

					running = false;
					playerTurn--;

				}

			} else {

				ir.receiveString(player2, endNumber);

				playerTurn--;

				if (player2.getPlayerScore() >= endNumber) {

					running = false;
					playerTurn++;

				}

			}

		}

		System.out.println("End Results:");
		System.out.print("Player 1 : " + player1.getPlayerScore());

		if (player1.getPlayerBonus() == 1) {

			System.out.print(" (Used Bonus)");

		}

		System.out.println();
		System.out.print("Player 2 : " + player2.getPlayerScore());

		if (player2.getPlayerBonus() == 1) {

			System.out.print(" (Used Bonus)");

		}

		System.out.println();

		System.out.println("Player " + (playerTurn + 1) + " won!!");

	}

}
