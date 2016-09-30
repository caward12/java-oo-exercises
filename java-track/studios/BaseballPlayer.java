
public class BaseballPlayer {
	
	private String name;
	private int jersey;
	private String hand;
	private int games;
	private int rbi;
	private int runs;
	
	public BaseballPlayer(String name, int jersey, String hand, int games, int rbi, int runs){
		this.name = name;
		this.jersey = jersey;
		this.hand = hand;
		this.games = games;
		this.rbi = rbi;
		this.runs = runs;
	}
	
	public void completedGame(int rbi, int runs){
		this.games = this.games+1;
		this.rbi = this.rbi + rbi;
		this.runs = this.runs + runs;
	}
	
	public int getGames(){
		return this.games;
	}
	
	public int getRbi(){
		return this.rbi;
	}
	
	public int getRuns(){
		return this.runs;
	}
	
	

	public static void main(String[] args) {
		
		BaseballPlayer joe = new BaseballPlayer("Joe", 12, "left", 0,0,0);
		
		joe.completedGame(2, 1);
		System.out.println(joe.getGames());
		System.out.println(joe.getRbi());
		System.out.println(joe.getRuns());
		
		joe.completedGame(3, 2);
		System.out.println(joe.getGames());
		System.out.println(joe.getRbi());
		System.out.println(joe.getRuns());
		

	}

}
