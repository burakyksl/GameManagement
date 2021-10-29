
public class Main {

	public static void main(String[] args) {
		
		
		PlayerInformation burak = new PlayerInformation(1, "burak", "yüksel",Long.parseLong("17122007718"), 1997);
		PlayerManager playerManager = new PlayerManager();
		playerManager.add(burak);
		
		GameInformation csgo = new GameInformation(1,"CS GO", 100);
		GameInformation fifa = new GameInformation(2,"Fifa", 200);
		GameInformation[] games = {fifa};
		GameManager gameManager = new GameManager();
		gameManager.add(csgo);
		
		CampaignInformation firsat = new CampaignInformation(1, "Fýrsat", 30, 0.10);
		CampaignManager offer = new CampaignManager();
		offer.add(firsat);
		
		SellManager sell = new SellManager(burak, fifa);
		sell.campaignadapt(firsat, games);

	}

}
