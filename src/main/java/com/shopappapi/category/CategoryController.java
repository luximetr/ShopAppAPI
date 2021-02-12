package com.shopappapi.category;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shopappapi.product.Product;
import com.shopappapi.product.ProductService;


@RestController
public class CategoryController {
	
	@Autowired
	private CategoryService categoryService;
	@Autowired
	private ProductService productService;

	@RequestMapping("/categories")
	public List<Category> getAllCategories() {
		return categoryService.getAllCategories();
	}
	
	@RequestMapping("categories/{categoryId}/products")
	public List<Product>getProducts(@PathVariable String categoryId) {
		return productService.getProducts(categoryId);
	}
}
