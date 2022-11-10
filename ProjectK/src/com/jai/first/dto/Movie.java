package com.jai.first.dto;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Movie implements Serializable{
private String name;
private Double budget;
private String rating;
private  String actorName;

Movie(){}

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Double getBudget() {
	return budget;
}
public void setBudget(Double budget) {
	this.budget = budget;
}
public String getRating() {
	return rating;
}
public void setRating(String rating) {
	this.rating = rating;
}
public String getActorName() {
	return actorName;
}
public void setActorName(String actorName) {
	this.actorName = actorName;
}



}
