package com.kumar.backend.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Entity
@Table(name = "product")
public class Product {

	@Id
	@GeneratedValue
	@ApiModelProperty(hidden = true)
	private Long id;
	
	
	private Long itemId;
	private String category;
	private String productName;
	private String productDescription;
	private Float price;

	@Override
	public String toString() {
		return "Product [id=" + id + ", itemId=" + itemId + ", category=" + category + ", productName=" + productName
				+ ", productDescription=" + productDescription + ", price=" + price + "]";
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getItemId() {
		return itemId;
	}

	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}
}
