package com.kgf.first.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "howle")
public class Movie {
	@Id
	@GenericGenerator(name="mov",strategy = "increment")
	@GeneratedValue(generator="mov")
	@Column(name="id")
	private int id;
	@Column(name="movie_name")
	private String movieName;
@Column(name="budget")
	private String budget;
@Column(name="hero")
	private String hero;

Movie(){
	
}
	public Movie( String movieName, String budget, String hero) {
	
		this.movieName = movieName;
		this.budget = budget;
		this.hero = hero;
	}

	

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getBudget() {
		return budget;
	}

	public void setBudget(String budget) {
		this.budget = budget;
	}

	public String getHero() {
		return hero;
	}

	public void setHero(String hero) {
		this.hero = hero;
	}

	@Override
	public String toString() {
		return "Movie [id=" + id + ", movieName=" + movieName + ", budget=" + budget + ", hero=" + hero + "]";
	}

}
