package persistance;

import java.util.ArrayList;
import java.util.List;

import Metier.Adresse;
import Metier.Contact;

public class ListAdresse {

	private static volatile ListAdresse instance = null;
	private List<Adresse> allAdresse;
	
	private ListAdresse() {
		super();
		allAdresse = new ArrayList<Adresse>(0);
	}
	
	public final static ListAdresse getInstance() {
		
		if(ListAdresse.instance == null) {
			synchronized(ListAdresse.class) {
				if(ListAdresse.instance == null) {
					ListAdresse.instance = new ListAdresse();
				}
			}
		}
		
		return ListAdresse.instance;
	}
	
	public void addAdresse(Adresse a) {
		this.allAdresse.add(a);
	}
	
	public void removeContact(Contact c) {
		this.allAdresse.remove(0);
	}
	
	public List<Adresse> getAllAdresse() {
		return this.allAdresse;
	}
}