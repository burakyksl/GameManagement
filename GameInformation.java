
public class GameInformation {

	private int  id;
	private String GameName;
	private double GamePrice;
	public GameInformation(int id, String gameName, double gamePrice) {
		super();
		this.id = id;
		GameName = gameName;
		GamePrice = gamePrice;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getGameName() {
		return GameName;
	}
	public void setGameName(String gameName) {
		GameName = gameName;
	}
	public double getGamePrice() {
		return GamePrice;
	}
	
	
	
	


}

