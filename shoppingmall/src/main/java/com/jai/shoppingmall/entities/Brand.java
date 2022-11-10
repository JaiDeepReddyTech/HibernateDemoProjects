package com.jai.shoppingmall.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.jai.shoppingmall.constants.AppConstants;

@Entity
@Table(name = AppConstants.BRAND)
public class Brand {
	@Id
	@Column(name = "id")
	private Integer id;
	@Column(name = "name")
	private String name;
	@Column(name = "estd_year")
	private String estdYear;
	@Column(name = "brand_value")
	private String brandValue;
	@Column(name = "head_qtr")
	private String headQtrs;

	public Brand() {
	}

	public Brand(Integer id, String name, String estdYear, String brandValue, String headQtrs) {
		super();
		this.id = id;
		this.name = name;
		this.estdYear = estdYear;
		this.brandValue = brandValue;
		this.headQtrs = headQtrs;
	}

	@Override
	public String toString() {
		return "Brand [id=" + id + ", name=" + name + ", estdYear=" + estdYear + ", brandValue=" + brandValue
				+ ", headQtrs=" + headQtrs + "]";
	}

}
