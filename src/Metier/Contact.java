package Metier;

import java.util.Date;
import java.util.HashMap;

import persistance.ListAdresse;
import persistance.ListContact;

public class Contact {

	private String name;
	private String firstName;
	private String mail;
	private String keyValue;
	private Date dateDeNaissance;
	private boolean actif;
	
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
		
		this.actif = true;
		
		this.setKeyValue();
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
	
/*	public String getKey() {
		return this.name + this.firstName;
	}
*/
	public Date getDateDeNaissance() {
		return dateDeNaissance;
	}

	public void setDateDeNaissance(Date dateNaissance) {
		this.dateDeNaissance = dateNaissance;
	}

	public String isActif() {
		if(actif)
			return "oui";
		else
			return "non";
	}

	public void setActif(boolean actif) {
		this.actif = actif;
	}

	public String getKey() {
		return keyValue;
	}

	private void setKeyValue() {
		this.keyValue = this.name + this.firstName;
	}
}