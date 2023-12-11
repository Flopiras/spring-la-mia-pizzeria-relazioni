package org.java.spring.db.pojo;

import java.util.Arrays;
import java.util.List;

import org.hibernate.validator.constraints.Length;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;

@Entity
public class Pizza {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column
	@Length(min = 3, max = 60, message = "Il nome della pizza deve essere dai 3 ai 60 caratteri")
	private String name;
	
	@Column(columnDefinition = "TEXT")
	@Length(min = 3, message = "La descrizione deve essere di almeno 3 caratteri")
	private String description;
	
	@Column(columnDefinition = "TEXT")
	private String urlImage;
	
	@Column
	private float price;
	
	@OneToMany(mappedBy = "pizza")
	private List<Offer> offers;
	
	@ManyToMany
	private List<Ingredient> ingredients;
	
	public Pizza() { } 
	public Pizza(String name, String description, String urlImage, float price, Ingredient...ingredients) {
		
	setName(name);
	setDescription(description);
	setUrlImage(urlImage);
	setPrice(price);
	setIngredients(ingredients);
	
	}
	
	
	public List<Ingredient> getIngredients() {
		return ingredients;
	}
	public void setIngredients(List<Ingredient> ingredients) {
		this.ingredients = ingredients;
	}
	public void setIngredients(Ingredient... ingredients) {	
		setIngredients(Arrays.asList(ingredients));
	}
	public void clearIngredients() {
		getIngredients().clear();
	}
	public List<Offer> getOffers() {
		return offers;
	}
	public void setOffers(List<Offer> offers) {
		this.offers = offers;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getUrlImage() {
		return urlImage;
	}
	public void setUrlImage(String urlImage) {
		this.urlImage = urlImage;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		
		return "Pizza [" + getId() + "]" + "n"
				+ getDescription() + "\n"
				+ "Prezzo: € " + getPrice();
	}

}
