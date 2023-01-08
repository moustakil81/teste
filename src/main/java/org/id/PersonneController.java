package org.id;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PersonneController {
 @GetMapping("/index")
	public String index(HttpServletRequest req,Model model) {
	  HttpSession session = req.getSession();
	session.setAttribute("message", "hello");
     String message = (String) session.getAttribute("message");
      model.addAttribute("message", message);
	 return "index";
 }

}
