package com.jai.shoppingmall.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.jai.shoppingmall.constants.AppConstants;

@Entity
@Table(name = AppConstants.MODEL)
public class Model {
	@Id
	@Column(name = "id")
	private Integer id;
	@Column(name = "name")
	private String name;
	@Column(name = "brand_name")
	private String brandName;
	@Column(name = "price")
	private Double price;
	@Column(name = "color")
	private String color;

	public Model() {
	}

	public Model(Integer id, String name, String brandName, Double price, String color) {
		super();
		this.id = id;
		this.name = name;
		this.brandName = brandName;
		this.price = price;
		this.color = color;
	}

}
