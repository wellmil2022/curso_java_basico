package sec9_class.problema;

public class PeopleHouse {
	private String name;
	private String email;
	
	public PeopleHouse(String name, String email) {
		super();
		this.name = name;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return String.format("%s, %s", name, email);
	}
	
	
	
	
}
