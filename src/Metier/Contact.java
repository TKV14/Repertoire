package Metier;

import java.util.HashSet;

import persistance.ListContact;

public class Contact {

	private String name;
	private String firstName;
	private String mail;
	
	private HashSet<Adresse> adresse;
	
	public Contact(String name, String firstName) {
		this.name = name;
		this.firstName = firstName;
	}
	
	public Contact(String name, String firstName, String mail) {
		this.name = name;
		this.firstName = firstName;
		this.mail = mail;
		
		this.adresse = new HashSet<Adresse>();
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

	public HashSet<Adresse> getAdresse() {
		return adresse;
	}
	
	public void addAdresse(Adresse a) {
		this.adresse.add(a);
	}
	
	public int getIndex() {
		return ListContact.getInstance().getAllContact().indexOf(this);
	}
}