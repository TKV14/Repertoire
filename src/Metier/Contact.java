package Metier;

import java.util.HashMap;

import persistance.ListAdresse;
import persistance.ListContact;

public class Contact {

	private String name;
	private String firstName;
	private String mail;
	
	private HashMap<String, Adresse> adresse;
	
	public Contact(String name, String firstName) {
		this.name = name;
		this.firstName = firstName;
	}
	
	public Contact(String name, String firstName, String mail) {
		this.name = name;
		this.firstName = firstName;
		this.mail = mail;
		
		this.adresse = new HashMap<String, Adresse>();
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

	public HashMap<String, Adresse> getAdresse() {
		return adresse;
	}
	
	public void addAdresse(Adresse a) {
		ListAdresse.getInstance().addAdresse(a);
		this.adresse.put(a.getKey(), ListAdresse.getInstance().getAllAdresse().get(a.getNum() + a.getRue() + a.getVille() + a.getCodePostal()));
	}
	
	public void removeAdresse(Adresse a) {
		boolean useAdresse = false;
		
		this.adresse.remove(a.getKey());

		for(Contact c : ListContact.getInstance().getAllContact().values()) {
			if(c.getAdresse().containsKey(a.getKey())) {
				useAdresse = true;
				break;
			}
		}
		
		if(useAdresse == false)
			ListAdresse.getInstance().getAllAdresse().remove(a.getKey());
	}
	
	public String getKey() {
		return this.name + this.firstName;
	}
}