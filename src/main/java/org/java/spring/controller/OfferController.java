package org.java.spring.controller;

import java.util.List;

import org.java.spring.db.pojo.Pizza;
import org.java.spring.db.serv.OfferService;
import org.java.spring.db.serv.PizzaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class OfferController {

	@Autowired
	private PizzaService pizzaService;
	
	@Autowired
	private OfferService offerService;
	
	@GetMapping("/pizzas/offer")
	public String getOfferForm(Model model) {
		
		List<Pizza> pizzas = pizzaService.finAll();
		model.addAttribute("pizzas", pizzas);
		
		return "offer-form";
	}
}
