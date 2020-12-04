package com.map;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Students> listA = new ArrayList<Students>();
		List<Students> listB = new ArrayList<Students>();
		
		listA.add(new Students("Nabeel"));
		listA.add(new Students("Ahmed"));
		listA.add(new Students("kareemi"));
	
		listB.add(new Students("Ravi"));
		listB.add(new Students("Goutham"));
		listB.add(new Students("Sravan"));
	
		
		//System.out.println(listA);
		//System.out.println(listB);
		
		
		Map<String, List> map = new HashMap<String, List>();
		map.put("ECE",listA);
		map.put("CSE", listB);
		
		System.out.println(map);
		
	}

}
