package com.jai.script.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import com.jai.script.constants.AppConstant;
@Entity
@Table(name = AppConstant.MOVIE_INFO)
public class Movie implements Serializable {
	
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
    @Column(name="id")
	private Integer id;
	@Column(name = "name")
	private String name;
	@Column(name = "actor_name")
	private String actorName;
	@Column(name = "actress_name")
	private String actressName;
	@Column(name = "budget")
	private String budget;
	@Column(name = "rating")
	private String rating;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getActorName() {
		return actorName;
	}

	public void setActorName(String actorName) {
		this.actorName = actorName;
	}

	public String getActressName() {
		return actressName;
	}

	public void setActressName(String actressName) {
		this.actressName = actressName;
	}

	public String getBudget() {
		return budget;
	}

	public void setBudget(String budget) {
		this.budget = budget;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

}
