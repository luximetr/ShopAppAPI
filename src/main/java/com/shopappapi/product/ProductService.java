package com.shopappapi.product;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ProductService {

	// Data
	private List<Product> earphonesProducts = new ArrayList<>(Arrays.asList(
			new Product(
					"1", 
					"OPPO", 
					"Good earphones with microphone", 
					"https://images-na.ssl-images-amazon.com/images/I/61CkEyP9n3L._SL1500_.jpg", 
					4900),
			new Product(
					"2", 
					"Magnetic",
					"Well quality earphones",
					"https://ae01.alicdn.com/kf/HTB1DaPyX_jxK1Rjy0Fnq6yBaFXaN/Langsdom-L33-Bluetooth-Earphone-Wireless-Earphones-audifonos-Magnetic-Switch-Bluetooth-In-ear-Headset-With-Mic-Stereo.jpg", 
					2900),
			new Product(
					"3", 
					"AKG", 
					"Well known company's product", 
					"https://cf.shopee.sg/file/31f31524e73a77aaddf2b63c5b21a9e1",
					9900)
			));
	private List<Product> smartphonesProducts = new ArrayList<>(Arrays.asList(
			new Product(
					"4", 
					"IPhone X",
					"2018 Apple powerful product", 
					"https://static.digit.in/default/b4e18cd02ebe74dfd5fbf178853c08e9e1118cfb.jpeg?tr=w-1200",
					99900),
			new Product(
					"5", 
					"Huawei",
					"Powerful device with one of the best cameras", 
					"https://www.notebookcheck.net/fileadmin/_processed_/b/a/csm_4_zu_3_Teaser_Huawei_P40_Pro_7507_0546c7bf80.jpg",
					84900),
			new Product(
					"6", 
					"Samsung Galaxy Note 10",
					"Big phone with stilus", 
					"https://cdn.arstechnica.net/wp-content/uploads/2019/08/Note10-7-800x600.jpg",
					109900)
			));
	private List<Product> laptopsProducts = new ArrayList<>(Arrays.asList(
			new Product(
					"7", 
					"Microsoft Surface", 
					"Flexible laptop for office workers", 
					"https://zdnet1.cbsistatic.com/hub/i/r/2020/03/19/4d0e4e03-c980-43db-aa0f-2572aefcf89f/resize/1200x900/4a4509da96fc6d87280dc73238588f3e/surface-laptop-3-13-5-header.jpg", 
					139900),
			new Product(
					"8", 
					"HP",
					"Fast and light laptop for travelers", 
					"https://cdn.mos.cms.futurecdn.net/ahevYTh9pWRzkNPF85MQhb-1200-80.jpg",
					149900),
			new Product(
					"9", 
					"DELL",
					"Good for gamers", 
					"https://i.dell.com/sites/csimages/Video_Imagery/all/xps_7590_touch.png", 
					199900)
			));
	
	// Public
	public List<Product>getProducts(String categoryId) {
		switch (categoryId) {
		case "1": return earphonesProducts;
		case "2": return smartphonesProducts;
		case "3": return laptopsProducts;
		}
		return Arrays.asList();
	}
}
