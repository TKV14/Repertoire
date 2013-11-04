package Controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import persistance.ListAdresse;
import persistance.ListContact;
import Metier.Adresse;
import Metier.Contact;

public class Modify {

	@RequestMapping(method=RequestMethod.GET)
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		Contact c = ListContact.getInstance().getAllContact().get(request.getParameter("keyValue"));
		Collection<Adresse> adresseList = c.getAdresse().values();
		
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("contact", c);
		model.put("adresseList", adresseList);
		model.put("keyAdd", c.getKey());
		
		return new ModelAndView("modify", model);
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public ModelAndView handleRequestForm(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		String typeMaj = request.getParameter("maj");
		Contact c = ListContact.getInstance().getAllContact().get(request.getParameter("keyValue"));
		
		if(typeMaj.equalsIgnoreCase("infos")) {
			c.setName(request.getParameter("contact_LastName"));
			c.setFirstName(request.getParameter("contact_FirstName"));
			c.setMail(request.getParameter("contact_Email"));
			
			if(request.getParameter("actif").equalsIgnoreCase("oui"))
				c.setActif(true);
			else
				c.setActif(false);
		}
		else if(typeMaj.equalsIgnoreCase("majadresse")) {
			Adresse a = ListAdresse.getInstance().getAllAdresse().get(request.getParameter("keyValueAd"));
			
			a.setNum(request.getParameter("adresse_numero"));
			a.setRue(request.getParameter("adresse_rue"));
			a.setVille(request.getParameter("adresse_ville"));
			a.setCodePostal(request.getParameter("adresse_cp"));
			a.setType(request.getParameter("adresse_intitule"));
		}
		else if(typeMaj.equalsIgnoreCase("newadresse")) {
			String num = request.getParameter("adresse_numero");
			String rue = request.getParameter("adresse_rue");
			String ville = request.getParameter("adresse_ville");
			String cp = request.getParameter("adresse_cp");
			String type = request.getParameter("adresse_intitule");
			
			Adresse a = new Adresse(type, num, rue, cp, ville);
			
			ListAdresse.getInstance().getAllAdresse().put(a.getKey(), a);
			c.addAdresse(a);
		}
		
		ListContact contactList = ListContact.getInstance();
		
		Map<String, Collection<Contact>> model = new HashMap<String, Collection<Contact>>();
		model.put("contactList", contactList.getAllContact().values());
		
		return new ModelAndView("home", model);
	}
}