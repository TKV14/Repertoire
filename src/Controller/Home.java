package Controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import persistance.ListContact;
import Metier.Contact;

@WebServlet("/Controller")
public class Home{
	
	@RequestMapping(method=RequestMethod.GET)
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		return printContact(request, response);
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public ModelAndView handleRequestForm(HttpServletRequest request, HttpServletResponse response) throws Exception {

		Contact c = new Contact(request.getParameter("contact_LastName"), request.getParameter("contact_FirstName"), request.getParameter("contact_Email"));
		
		ListContact.getInstance().addContact(c);
		
		return printContact(request, response);
	}
	
	private ModelAndView printContact(HttpServletRequest request, HttpServletResponse response) throws Exception {

		ListContact contactList = ListContact.getInstance();
		
		Map<String, List<Contact>> model = new HashMap<String, List<Contact>>();
		model.put("contactList", contactList.getAllContact());
		
		return new ModelAndView("home", model);
	}
}