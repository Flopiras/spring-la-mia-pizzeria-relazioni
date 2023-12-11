package org.java.spring.db.serv;

import java.util.List;

import org.java.spring.db.pojo.Ingredient;
import org.java.spring.db.repo.IngredientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IngredientService {

	@Autowired
	private IngredientRepository ingreRepository;

	public List<Ingredient> findAll() {

		return ingreRepository.findAll();
	}

	public Ingredient findById(int id) {

		return ingreRepository.findById(id).get();
	}

	public void save(Ingredient ingredient) {

		ingreRepository.save(ingredient);
	}
}
