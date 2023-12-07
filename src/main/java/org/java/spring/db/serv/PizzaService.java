package org.java.spring.db.serv;

import java.util.List;

import org.java.spring.db.pojo.Pizza;
import org.java.spring.db.repo.PizzaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PizzaService {

	@Autowired
	private PizzaRepository pizzarepository;

	public List<Pizza> finAll() {

		return pizzarepository.findAll();
	}

	public Pizza findById(int id) {

		return pizzarepository.findById(id).get();
	}

	public List<Pizza> findByName(String query) {

		return pizzarepository.findByNameIgnoreCase(query);
	}

	public void save(Pizza pizza) {

		pizzarepository.save(pizza);
	}

	public void delete(Pizza pizza) {

		pizzarepository.delete(pizza);
	}

	public void deleteById(int id) {

		pizzarepository.deleteById(id);
	}
}
