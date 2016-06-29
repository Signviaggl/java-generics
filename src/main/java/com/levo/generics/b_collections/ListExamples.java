package com.levo.generics.b_collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListExamples {

	public static void main(String[] args) {
		Person donDraper = new Person("Don Draper", 89);
		Person peggyOlson = new Person("Peggy Olson", 65);
		
		List<Person> madMen = new ArrayList<>();
		madMen.add(donDraper);
		madMen.add(peggyOlson);
		
		madMen.add(new Person("Bert Cooper", 100));
		
//		madMen.add(new Object());	// Unresolved compilation problem: 
									// Type Safety check at compile-time
		
//		final Iterator<Person> iterator = madMen.iterator();
//		while(iterator.hasNext()) {
//			final Person person = iterator.next();
//			System.out.println(person);
//		}
		
		for(Person person : madMen) {
			System.out.println(person);
		}
		
	}

}
