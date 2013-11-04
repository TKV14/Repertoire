package Controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import persistance.ListContact;
import Metier.Contact;

public class Modify {

	@RequestMapping(method=RequestMethod.POST)
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		Contact c = ListContact.getInstance().getAllContact().get(request.getParameter("keyValue"));
		
		Map<String, Contact> model = new HashMap<String, Contact>();
		model.put("contact", c);
		
		return new ModelAndView("modify", model);
	}
}