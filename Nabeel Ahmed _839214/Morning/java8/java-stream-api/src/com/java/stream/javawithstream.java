package com.java.stream;

import java.util.List;
import java.util.stream.Collectors;

public class javawithstream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   List <Laptop> laptops = Laptop.getLaptops();
   
   
   List<Laptop> specLaptop = laptops.stream()
   .filter(item -> item.getBrandName().equals("Lenova"))
   .sorted((l1,l2) -> Double.compare(l2.getRatings(),l1.getRatings()))
   .collect((Collectors.toList()));
   System.out.println("--------------------------ONLY LENOVA SORTED BY RATINGS (DEC) COLLECTED TO LIST----------------------------------------------");
    specLaptop.forEach(i -> System.out.println(i));
	System.out.println("------------------------LAPTOPS WITH RATINGS > 4.0 ------------------------------------------------");
   laptops.stream().filter(item -> item.getRatings() > 4.0).forEach(x ->  System.out.println(x));
	System.out.println("-----------------DISTINCT BRAND NAME -------------------------------------------------------");

	
	System.out.println("~~~~~~~~~~~~~~~~~~~~~DONE AT INTERMEDIATE~~~~~[FILTER,SORTED,MAP,DISTINCT]~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	
 laptops.stream().map(item -> item.getBrandName()).distinct().forEach(i -> System.out.println(i));
 System.out.println("----------------------NO OF ACER BRAND LAPTOPS --------------------------------------------------");
 System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~DONE AT TERMINAL~~~~~~~~~[FOREACH COUNT COLLECT]~~~~~~~~~~~~~~~~~~~~~~~~~~~");
 long count = laptops.stream().filter(item -> item.getBrandName().equals("Acer")).count();
 System.out.println("Count : " +count);
 
}
}
