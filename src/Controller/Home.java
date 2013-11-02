package Controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import Metier.Contact;

@WebServlet("/Controller")
public class Home implements Controller {
	
	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		Contact c1 = new Contact("Clouet", "Arthur");
		Contact c2 = new Contact("Louis", "Nicolas");
		
		List<Contact> contactList = new ArrayList<Contact>(1);
		
		contactList.add(c1);
		contactList.add(c2);
		
		Map<String, List<Contact>> model = new HashMap<String, List<Contact>>();
		model.put("contactList", contactList);
		
		return new ModelAndView("home", model);
	}
}