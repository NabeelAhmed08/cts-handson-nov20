package com.java.stream;
import java.util.ArrayList;
import java.util.List;

public class Laptop {
	private String brandName;
	private double ratings;
	private double price;
	private String Memmory;
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public double getRatings() {
		return ratings;
	}
	public void setRatings(double ratings) {
		this.ratings = ratings;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getMemmory() {
		return Memmory;
	}
	public void setMemmory(String memmory) {
		Memmory = memmory;
	}
	public Laptop(String brandName, double ratings, double price, String memmory) {
		super();
		this.brandName = brandName;
		this.ratings = ratings;
		this.price = price;
		Memmory = memmory;
	}
	@Override
	public String toString() {
		return "Laptop [brandName=" + brandName + ", ratings=" + ratings + ", price=" + price + ", Memmory=" + Memmory
				+ "]";
	}
	public Laptop() {
		super();
	}
	
	public static List<Laptop> getLaptops(){
		List<Laptop> laptops = new ArrayList<Laptop>();
		laptops.add(new Laptop("HP", 4.2, 60000, "2TB"));
		laptops.add(new Laptop("Acer", 4.1, 55000, "2TB"));
		laptops.add(new Laptop("Dell", 4.3, 65000, "3TB"));
		laptops.add(new Laptop("Lenova", 4.0, 50000, "1TB"));
		laptops.add(new Laptop("HP", 4.5, 65000, "2TB"));
		laptops.add(new Laptop("Acer", 4.3, 60000, "3TB"));
		laptops.add(new Laptop("Dell", 3.9, 30000, "2TB"));
		laptops.add(new Laptop("Lenova", 3.5, 25000, "3TB"));
		laptops.add(new Laptop("HP", 4.8, 80000, "2TB"));
		laptops.add(new Laptop("Acer", 4.6, 63000, "2TB"));
		laptops.add(new Laptop("Dell", 4.4, 50000, "3TB"));
		laptops.add(new Laptop("Lenova", 4.3, 75000, "2TB"));
		
		
		return laptops;
		
		
		
	}

}
