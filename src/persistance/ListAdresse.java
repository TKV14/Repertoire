package persistance;

import java.util.HashMap;

import Metier.Adresse;

public class ListAdresse {

	private static volatile ListAdresse instance = null;
	private HashMap<String, Adresse> allAdresse;
	
	private ListAdresse() {
		super();
		allAdresse = new HashMap<String, Adresse>(0);
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
	
	public int addAdresse(Adresse a) {
		if(this.allAdresse.put(a.getKey(), a) == null)
			return 0;
		else
			return 1;
	}
	
	public HashMap<String, Adresse> getAllAdresse() {
		return this.allAdresse;
	}
}