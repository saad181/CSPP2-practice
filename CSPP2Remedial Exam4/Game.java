class Game {
	int playercount;
	int ind = 0;
	Player[] players;
	public Game(int count) {
		playercount = count;
		players = new Player[count];
	}

	public void addPlayer(Player name) {
		players[this.ind++] = name;
		
	}


	public int indexOf(String checkname) {
		for (int i = 0; i < this.ind; i++) {
			if(players[i].getName().equals(checkname)) {
				return i;
			}
		}
		return -1;

	}


	public Player winner() {
		int t= 0; 
		Player tem = null;
		for (int i = 0; i < this.ind; i++) {
			if (players[i].getScore() > t) {
				
				t = players[i].getScore();
				tem = players[i];
				
			}

		}
		return tem;
	}


	// public Player winner() {
		
		
	// 	return high();
		
	// }
}


class Player {
	String playername;
	int scored = 0;
	public Player(String name) {
		playername = name;
	}

	public String getName() {

		return playername;

	}

	public void addScore(int score) {
		// System.out.println(score);
		scored += score;
	}

	public int getScore() {
		return this.scored;
	}


}
