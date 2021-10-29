
public class PlayerInformation {

	
	private int  id ;
	private String FirstName;
	private String LastName;
	private long Nationalty;
	private int YearOfBirth;
	
	public PlayerInformation(int id, String firstName, String lastName, long nationalty, int yearOfBirth) {
		super();
		this.id = id;
		this.FirstName = firstName;
		this.LastName = lastName;
		this.Nationalty = nationalty;
		this.YearOfBirth = yearOfBirth;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	
	public long getNationalty() {
		return Nationalty;
	}

	public void setNationalty(long nationalty) {
		Nationalty = nationalty;
	}

	public int getYearOfBirth() {
		return YearOfBirth;
	}

	public void setYearOfBirth(int yearOfBirth) {
		YearOfBirth = yearOfBirth;
	}
	
	
}
