package Metier;

public class Contact {

	private String name;
	private String firstName;
	private String mail;
	
	public Contact() {
		this.name = "nom";
	}
	
	public Contact(String name, String firstName) {
		this.name = name;
		this.firstName = firstName;
	}
	
	public Contact(String name, String firstName, String mail) {
		this.name = name;
		this.firstName = firstName;
		this.mail = mail;
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

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}
}