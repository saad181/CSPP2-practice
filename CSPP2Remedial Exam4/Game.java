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
		//System.out.println(Arrays.toString(players));
	}


	public int indexOf(String checkname) {
		for (int i = 0; i < this.ind; i++) {
			if(players[i].getName().equals(checkname)) {
				return i;
			}
		}
		return -1;

	}


	public Player higher() {
		int tmpp = 0;
		Player tmp = null;
		for (int i = 0; i < this.ind; i++) {
			if (players[i].getScore() > tmpp) {
				//System.out.println("inside");
				//System.out.println(players[i].getScore());
				tmpp = players[i].getScore();
				tmp = players[i];
				// System.out.println(players[i].getName() + players[i].getScore());
			}

		}
		return tmp;
	}


	public Player winner() {
		
		for (int i = 0; i < this.ind; i++) {
			//System.out.println("inside");
			//System.out.println(players[i].getScore());

			if (players[i].getScore() >= 100) {
				//System.out.println("inside");
				//System.out.println(players[i].getScore());
				return players[i];
			}

		}
		return null;
	}
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
