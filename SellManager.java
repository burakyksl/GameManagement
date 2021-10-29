
public class SellManager {

	public SellManager(PlayerInformation player,GameInformation gamer) { 
		
		
		System.out.println("satýþýn yapýlacaðý müþteri : "+ player.getFirstName() + "   satýþý yapýlacak oyun :" + gamer.getGameName());
		System.out.println("oyun eski fiyatý : " + gamer.getGamePrice()+" tl");
		
	}
	
	public void campaignadapt(CampaignInformation offer,GameInformation[] games) {
		
		
		
		for (GameInformation gameInformation : games) {
			
			double price =gameInformation.getGamePrice()-(gameInformation.getGamePrice()*offer.getCampaignDiscount());
			System.out.println("kampanya sonrasý fiyatý : "+ price + " tl");
		}
		
		
	}
	
	
}
