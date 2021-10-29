
public class PlayerManager {

	public void add(PlayerInformation player) {
		if (CheckPerson.checkPerson(player)) {
			System.out.println("yeni kullan�c� kay�t edildi " + player.getFirstName());
		} 
		else {
			
			System.out.println("yanl�� tc girildi");

		}

	}

	public void delete(PlayerInformation player) {
		System.out.println(player.getFirstName() + "   sistemden silindi  ");
	}

	public void update(PlayerInformation player) {
		System.out.println(player.getFirstName() + "  bilgileri g�ncellendi  ");
	}

}
