package Controller;

import java.util.HashMap;
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
		
		Contact c = new Contact();
		
		Map<String, Contact> model = new HashMap<String, Contact>();
		model.put("contactList", c);
		
		return new ModelAndView("home", model);
	}
}