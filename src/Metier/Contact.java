package Metier;

public class Contact {

	private String name;
	private String firstName;
	
	public Contact() {
		this.name = "nom";
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
}