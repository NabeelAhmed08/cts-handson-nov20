package com.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.*;
import java.util.List;

public class ComparatorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		List<Items> list = new ArrayList<Items>();
		list.add(new Items(444, "Samsung TV", 65000,3));
		list.add(new Items(222, "Mi TV", 30000,4));
		list.add(new Items(333, "LG TV", 50000,5));
		for(Items item : list) System.out.println(item);
		
		Comparator<Items> sortById = new Comparator<Items>() {
			public int compare(Items i1, Items i2) {
				return i1.getId() - i2.getId();
			}
		};	
	
	System.out.println("--- Sorting id by comparator in ascending order -----");
		Collections.sort(list, sortById); // sorting with Comparator
		for(Items item : list)  System.out.println(item);

	
	Comparator<Items> sortByR = new Comparator<Items>() {
		public int compare(Items i1, Items i2) {
			
			return i1.getRating() - i2.getRating();
		}	
	};
	
	System.out.println("-------------Sorting by rating--- ace----------");
	 Collections.sort(list, sortByR);
	 for (Items item :list) {
		 System.out.println(item);
	 }
	
		Comparator<Items> sortByRd = new Comparator<Items>() {
			public int compare(Items i1, Items i2) {
				
				return i2.getRating() - i1.getRating();
			}	
		};
	
		
		System.out.println("-------------Sorting by rating--- dec----------");
		 Collections.sort(list, sortByRd);
		 for (Items item :list) {
			 System.out.println(item);
		 }
		
	
	
	
	}

}
