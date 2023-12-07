package org.java.spring.controller;

import java.util.List;

import org.java.spring.db.pojo.Pizza;
import org.java.spring.db.repo.PizzaRepository;
import org.java.spring.db.serv.PizzaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.validation.Valid;

@Controller
public class MainController {

	@Autowired
	private PizzaService pizzaService;

	@GetMapping("/")
	public String getIndex(Model model, @RequestParam(required = false) String q) {

		List<Pizza> pizzas = q == null ? pizzaService.finAll() : pizzaService.findByName(q);

		model.addAttribute("pizzas", pizzas);
		model.addAttribute("q", q == null ? "" : q);

		return "pizzas";
	}

	@GetMapping("/pizzas/{id}")
	public String pizzaDetail(Model model, @PathVariable int id) {

		Pizza pizza = pizzaService.findById(id);

		model.addAttribute("pizza", pizza);

		return "pizza";
	}

	@GetMapping("/pizzas/create")
	public String createPizza(Model model) {

		Pizza pizza = new Pizza();

		model.addAttribute("pizza", pizza);

		return "pizza-form";
	}

	@PostMapping("/pizzas/create")
	public String storePizza(Model model, @Valid @ModelAttribute Pizza pizza, BindingResult bindingResult) {

		

		return savePizza(model, pizza, bindingResult);
	}
	
	@GetMapping("/pizzas/edit/{id}")
	public String editPizza(Model model, @PathVariable int id) {
		
		Pizza pizza = pizzaService.findById(id);
		
		model.addAttribute("pizza", pizza);
		
		return "pizza-form";
	}

	@PostMapping("/pizzas/edit/{id}")
	public String updatePizza(Model model, @Valid @ModelAttribute Pizza pizza, BindingResult bindingResult) {
		
		return savePizza(model, pizza, bindingResult);
	}
	
	@PostMapping("/pizzas/delete/{id}")
	public String deletePizza(@PathVariable int id) {
		
		Pizza pizza = pizzaService.findById(id);
		
		pizzaService.delete(pizza);
		
		System.out.println(pizza);
		
		return "redirect:/";
	}
	
	private String savePizza (Model model, @Valid @ModelAttribute Pizza pizza, BindingResult bindingResult) {
		
		System.out.println("Pizza:\n" + pizza);
		System.out.println("\n---------------\n");
		System.out.println("Error:\n" + bindingResult);

		if (bindingResult.hasErrors()) {

			System.out.println(bindingResult);
			model.addAttribute("pizza", pizza);

			return "pizza-form";
		}

		try {

			pizzaService.save(pizza);
		} catch (Exception e) {

			
			model.addAttribute("pizza", pizza);
			return "pizza-form";
		}
		
		return "redirect:/";
	}
}
