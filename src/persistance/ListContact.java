package persistance;

import java.util.HashMap;

import Metier.Contact;

public class ListContact {

	private static volatile ListContact instance = null;
	private HashMap<String, Contact> allContact;
	
	private ListContact() {
		super();
		allContact = new HashMap<String, Contact>();
	}
	
	public final static ListContact getInstance() {

		if(ListContact.instance == null) {
			synchronized(ListContact.class) {
				if(ListContact.instance == null) {
					ListContact.instance = new ListContact();
				}
			}
		}
		
		return ListContact.instance;
	}
	
	public int addContact(Contact c) {
		if(this.allContact.put(c.getName() + c.getFirstName() ,c) == null)
			return 0;
		else
			return 1;
	}
	
	public void removeContact(Contact c) {
		this.allContact.remove(c);
	}
	
	public HashMap<String, Contact> getAllContact() {
		return this.allContact;
	}
	
	public void printAll() {
		for(Contact c : this.allContact.values()) {
			System.out.println("Nom: " + c.getName() + "; Prenom: " + c.getFirstName());
		}
	}
}