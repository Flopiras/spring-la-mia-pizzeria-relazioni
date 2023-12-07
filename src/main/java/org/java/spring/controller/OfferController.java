package org.java.spring.controller;

import java.util.List;

import org.java.spring.db.pojo.Offer;
import org.java.spring.db.pojo.Pizza;
import org.java.spring.db.serv.OfferService;
import org.java.spring.db.serv.PizzaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import jakarta.validation.Valid;


@Controller
public class OfferController {

	@Autowired
	private PizzaService pizzaService;
	
	@Autowired
	private OfferService offerService;
	
	@GetMapping("/pizzas/{id}/offer")
	public String getOfferForm(Model model, @PathVariable int id) {
		
		Pizza pizza = pizzaService.findById(id);
		model.addAttribute("pizza", pizza);
		
		Offer offer = new Offer();
		model.addAttribute("offer", offer);		
		
		return "offer-form";
	}
	
	@PostMapping("/pizzas/{id}/offer")
	public String storeOffer(Model model,@Valid @ModelAttribute Offer offer, BindingResult bindingResult) {
		
		System.out.println("Offerta:\n" + offer);
		System.out.println("\n---------------\n");
		System.out.println("Error:\n" + bindingResult);

		if (bindingResult.hasErrors()) {

			System.out.println(bindingResult);
			model.addAttribute("offer", offer);

			return "offer-form";
		}

		try {

			offerService.save(offer);
		} catch (Exception e) {

			
			model.addAttribute("pizza", offer);
			return "offer-form";
		}
		
		return "redirect:/";
	}
}
