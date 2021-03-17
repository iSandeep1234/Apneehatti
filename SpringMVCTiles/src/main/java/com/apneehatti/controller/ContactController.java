package com.apneehatti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.apneehatti.model.RegisterDao;
import com.apneehatti.pojo.Contact;

@Controller
@SessionAttributes
public class ContactController {
	@Autowired
	private RegisterDao registerDao;
	@RequestMapping(value = "/addContact", method = RequestMethod.POST)
	
	public String addContact(@ModelAttribute("contact") Contact contact, BindingResult result) {
		
		System.out.println("insertion in progress");
		//model.addAttribute("command", new Contact());
		// write the code here to add contact
		registerDao.save(contact);
		System.out.println("inserted");
		return "redirect:contact.html";
	
	}

	

	@RequestMapping("/contact")
	public String showContacts(Model m) {
		m.addAttribute("command", new Contact());
		return "contact";
	}

	
	  @RequestMapping("/login") public String showlogin(Model m) {
	  m.addAttribute("command", new Contact()); return "login"; }
	 

	  @RequestMapping(value = "/addlogin", method = RequestMethod.POST)
		public String addLogin(@ModelAttribute("login") Contact contact, BindingResult result) {
			// write the code here to add contact
			return "redirect:login.html";
		}


}
