
public class PlayerManager {

	public void add(PlayerInformation player) {
		if (CheckPerson.checkPerson(player)) {
			System.out.println("yeni kullanýcý kayýt edildi " + player.getFirstName());
		} 
		else {
			
			System.out.println("yanlýþ tc girildi");

		}

	}

	public void delete(PlayerInformation player) {
		System.out.println(player.getFirstName() + "   sistemden silindi  ");
	}

	public void update(PlayerInformation player) {
		System.out.println(player.getFirstName() + "  bilgileri güncellendi  ");
	}

}
