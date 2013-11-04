package Controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import persistance.ListContact;
import Metier.Contact;

public class Search {

	@RequestMapping(method=RequestMethod.GET)
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		return new ModelAndView("search", null);
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public ModelAndView handleRequestForm(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		Map<String, Collection<Contact>> model = new HashMap<String, Collection<Contact>>();
		HashMap<String, Contact> contactList = new HashMap<String, Contact>();
		
		String name = request.getParameter("name");
		String firstName = request.getParameter("firstName");
		String mail = request.getParameter("mail");
		String actif = request.getParameter("actif");
		
		if(name.length() > 0) {
			for(Contact c : ListContact.getInstance().getAllContact().values()) {
				if(c.getName().equalsIgnoreCase(name)) {
					if(actif != null) {
						if(c.isActif().equalsIgnoreCase("oui"))
							contactList.put(c.getKey(), c);
					}
					else
						contactList.put(c.getKey(), c);
				}
			}
		}
		
		if(firstName.length() > 0) {
			for(Contact c : ListContact.getInstance().getAllContact().values()) {
				if(c.getFirstName().equalsIgnoreCase(firstName))
					contactList.put(c.getKey(), c);
			}
		}
		
		if(mail.length() > 0) {
			for(Contact c : ListContact.getInstance().getAllContact().values()) {
				if(c.getMail().equalsIgnoreCase(mail))
					contactList.put(c.getKey(), c);
			}
		}
		
		model.put("contactList", contactList.values());
		
		System.out.println("Actif: " + actif + "Prenom: " + firstName);
	
		return new ModelAndView("result", model);
	}
}