package com.shopappapi.product;

public class Product {

	private String id;
	private String name;
	private String description;
	private String previewImageUrl;
	private int price;

	public Product(String id, String name, String description, String previewImageUrl, int price) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.previewImageUrl = previewImageUrl;
		this.price = price;
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPreviewImageUrl() {
		return previewImageUrl;
	}

	public void setPreviewImageUrl(String previewImageUrl) {
		this.previewImageUrl = previewImageUrl;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
}
