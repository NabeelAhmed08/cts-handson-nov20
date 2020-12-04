package com.java.withoutStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.java.stream.Laptop;



public class TestProductSelection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Laptop> laptops = Laptop.getLaptops();
		
		List<Laptop> particularLaptops = new ArrayList<Laptop>();
		for(Laptop laptop : laptops) {
			if(laptop.getBrandName().equals("Lenova"))
				particularLaptops.add(laptop);
		}

		Collections.sort(particularLaptops, new Comparator<Laptop>() {
			@Override
			public int compare(Laptop o1, Laptop o2) {
				return Double.compare(o2.getRatings(), o1.getRatings());
			}
		});
		
		for(Laptop laptop : particularLaptops) {
			System.out.println(laptop);
		}
		
		
		}

}
