public class DiceWars {

	/**
	 * 
	 * First player to 18 - One time bonus roll worth times 2
	 * 
	 * @param args
	 */
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

				int score = ir.receiveString(player1, endNumber);

				player1.setPlayerScore(player1.getPlayerScore() + score);

				playerTurn++;

				if (player1.getPlayerScore() >= endNumber) {

					running = false;
					playerTurn--;

				}

			} else {

				int score = ir.receiveString(player2, endNumber);

				player2.setPlayerScore(player2.getPlayerScore() + score);

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
		System.out.println("End Results:");

		System.out.println("Player " + (playerTurn + 1) + " won!!");

	}

}
