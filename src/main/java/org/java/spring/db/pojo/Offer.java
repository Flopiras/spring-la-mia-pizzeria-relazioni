package org.java.spring.db.pojo;

import java.time.LocalDate;

import org.hibernate.annotations.ManyToAny;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Offer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private LocalDate startDate;
	private LocalDate finishDate;
	private String title;
	
	@ManyToOne
	private Pizza pizza;
	
	public Offer( ) { }
	public Offer(LocalDate startDate, LocalDate finishDate, String title, Pizza pizza) {
		
		setStartDate(startDate);
		setFinishDate(finishDate);
		setTitle(title);
		setPizza(pizza);
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public LocalDate getStartDate() {
		return startDate;
	}
	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}
	public LocalDate getFinishDate() {
		return finishDate;
	}
	public void setFinishDate(LocalDate finishDate) {
		this.finishDate = finishDate;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Pizza getPizza() {
		return pizza;
	}
	public void setPizza(Pizza pizza) {
		this.pizza = pizza;
	}
	
	@Override
	public String toString() {
		
		return "OFFERTA " + getTitle() + " - dal " + getStartDate() + " al " + getFinishDate();
	}
	
}
