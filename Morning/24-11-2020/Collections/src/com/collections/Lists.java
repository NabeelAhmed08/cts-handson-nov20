package com.collections;

import java.util.*;



public class Lists {

	public static void main(String[] args) {
	 
		List<Integer> list = new ArrayList<Integer>();
		list.add(12);
		list.add(16);
		list.add(21);
		list.add(174);
		list.add(111);
		
		
		for (int i : list) {
		System.out.println("items in list :"+i);
		}
		System.out.println("*********Even Items in lists*********");
		for(int i : list) {
			if(i%2 == 0) {
				System.out.println("Even Items"+i);
			}
			
			
		}
		
		
	}
}
