package com.collections.user;

import java.util.ArrayList;
import java.util.List;

public class UserData {

	public static void main(String[] args) {
		
		List<User> list = new ArrayList<User>();
		list.add(new User(123,"Nabeel","nab123"));
		list.add(new User(234,"Abc","123abc"));
		list.add(new User(345,"xyz","12xyz3"));
		list.add(new User(456,"pqrstu","pqrst444"));
		
		System.out.println("Names whose length is/are more than 5");
		for(User user:list) {
			
			if(user.getName().length() >5 ) {
				
				System.out.println(user.getName());
			}
			
		}
	}
	
	
}
