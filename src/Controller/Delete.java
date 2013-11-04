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

public class Delete {

	@RequestMapping(method=RequestMethod.GET)
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {

		
		ListContact.getInstance().getAllContact().remove(request.getParameter("keyValue"));
		return printContact(request, response);
	}

	private ModelAndView printContact(HttpServletRequest request, HttpServletResponse response) throws Exception {

		ListContact contactList = ListContact.getInstance();
	
		Map<String, Collection<Contact>> model = new HashMap<String, Collection<Contact>>();
		model.put("contactList", contactList.getAllContact().values());
	
		return new ModelAndView("home", model);
	}
}