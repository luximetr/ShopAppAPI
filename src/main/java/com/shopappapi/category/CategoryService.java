package com.shopappapi.category;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class CategoryService {

	private List<Category> categories = new ArrayList<>(Arrays.asList(
			new Category("1", "Earphones+"),
			new Category("2", "Smartphones"),
			new Category("3", "Laptops")
			));
	
	public List<Category>getAllCategories() {
		return categories;
	}
}
