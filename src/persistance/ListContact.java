package persistance;

import java.util.ArrayList;
import java.util.List;

import Metier.Contact;

public class ListContact {

	private static volatile ListContact instance = null;
	private List<Contact> allContact;
	
	private ListContact() {
		super();
		allContact = new ArrayList<Contact>(0);
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
	
	public void addContact(Contact c) {
		this.allContact.add(c);
	}
	
	public void removeContact(Contact c) {
		this.allContact.remove(0);
	}
	
	public List<Contact> getAllContact() {
		return this.allContact;
	}
}