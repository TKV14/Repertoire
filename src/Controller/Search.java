package Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

public class Search {

	@RequestMapping(method=RequestMethod.GET)
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		return new ModelAndView("search", null);
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public ModelAndView handleRequestForm(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		String name = request.getParameter("name");
		String firstName = request.getParameter("firstName");
		
		System.out.println("Nom: " + name + "Prenom: " + firstName);
		
		return new ModelAndView("result", null);
	}
}