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
		
		return new ModelAndView("modify", model);
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public ModelAndView handleRequestForm(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		System.out.println(request.getParameter("submit"));
		
//		Contact c = ListContact.getInstance().getAllContact().get(request.getParameter("keyValue"));
//		Collection<Adresse> adresseList = c.getAdresse().values();
		
//		Map<String, Object> model = new HashMap<String, Object>();
//		model.put("contact", c);
//		model.put("adresseList", adresseList);
		
		return null;
//		return new ModelAndView("modify", model);
	}
}