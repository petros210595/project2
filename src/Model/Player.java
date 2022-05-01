package Model;

public class Player {
	String name;
	long numOfGames;
	GameRecord[] lastGames;
	GameRecord[] bestGames;
	
	public Player(String name)
	{
		this.name= name;
		this.numOfGames= 0;
		this.lastGames= new GameRecord[5];
		this.bestGames= new GameRecord[5];		
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getNumOfGames() {
		return numOfGames;
	}
	public void setNumOfGames(long numOfGames) {
		this.numOfGames = numOfGames;
	}
	public GameRecord[] getLastGames() {
		return lastGames;
	}
	public void setLastGames(GameRecord[] lastGames) {
		this.lastGames = lastGames;
	}
	public GameRecord[] getBestGames() {
		return bestGames;
	}
	public void setBestGames(GameRecord[] bestGames) {
		this.bestGames = bestGames;
	}
	

	
	
	
}
