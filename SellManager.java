
public class SellManager {

	public SellManager(PlayerInformation player,GameInformation gamer) { 
		
		
		System.out.println("sat���n yap�laca�� m��teri : "+ player.getFirstName() + "   sat��� yap�lacak oyun :" + gamer.getGameName());
		System.out.println("oyun eski fiyat� : " + gamer.getGamePrice()+" tl");
		
	}
	
	public void campaignadapt(CampaignInformation offer,GameInformation[] games) {
		
		
		
		for (GameInformation gameInformation : games) {
			
			double price =gameInformation.getGamePrice()-(gameInformation.getGamePrice()*offer.getCampaignDiscount());
			System.out.println("kampanya sonras� fiyat� : "+ price + " tl");
		}
		
		
	}
	
	
}
