package Model;

public class ListOfPlayers {
	Player[] players;
	
	
	public void listOfPlayers ()
	{
		players= new Player[30];
	}


	public Player[] getPlayers() {
		return players;
	}
	public void setPlayers(Player[] players) {
		this.players = players;
	}	
	
	public void printPlayers()
	{
		System.out.println("List of all the players");
		System.out.println(" ");
		for(Player p : this.players)
		{
			System.out.println(p.name);
		}
	}
	
	public Player findPlayerByName(String name)
	{
		for(Player p: this.players)
		{
			if(p!=null && p.name.equals(name))
			{
				return p;
			}
		}		
		return null;		
	}
	
	public Player findThe_n_BestPlayers(int n)
	{
		for (int i=0 ; i<n ; i++)
		{
			for(Player p: this.players)
			{
				
			}		
			return null;
		}
	}
}
