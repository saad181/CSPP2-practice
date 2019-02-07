import java.util.*;
public class Solution {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int count = Integer.parseInt(scan.nextLine());
		Game game = new Game(count);
		game.addPlayer(new Player(scan.nextLine()));
		int totalScore = 0;
		int tempScore = 0;
		while (scan.hasNextLine()) {
			String lines[] = scan.nextLine().split(" got ");
					
			if (lines.length == 1) {
				if (game.indexOf(lines[0]) == -1) {
					
					game.addPlayer(new Player(lines[0]));
				}
			}  else if (lines.length == 2) {
				String player = lines[0];
				int index = game.indexOf(player);
				int score = Integer.parseInt(lines[1]);
				
				if (score == 1 ) {
					tempScore = 0;
					

				} else if (score == 6){
					
					tempScore += score;
					
					game.players[index].addScore(tempScore);
					tempScore = 0;
				} else {
					
					tempScore += score;
					
				}
				
				


			}
		}
		if (game.winner() != null) {
			System.out.println(game.winner().getName());	
		} else {
			System.out.println(game.higher().getName());
		}
		
	}
}