package com.levo.generics.b_collections;

import java.util.HashMap;
import java.util.Map;

public class MapExamples {
	
	public static void main(String[] args) {
		Person donDraper = new Person("Don Draper", 89);
		Person peggyOlson = new Person("Peggy Olson", 65);
		Person bertCooper = new Person("Bert Cooper", 100);
		
		Map<String, Person> madMen = new HashMap<>();
		madMen.put(donDraper.getName(), donDraper);
		madMen.put(peggyOlson.getName(), peggyOlson);
		madMen.put(bertCooper.getName(), bertCooper);
		
		// Map Iteration #1 : keys
		System.out.println("Map Iteration #1 : keys;");
		for(String name : madMen.keySet()) {
			System.out.println(name);
		}
		
		// Map Iteration #2 : values
		System.out.println("\nMap Iteration #2 : values;");
		for(Person person : madMen.values()) {
			System.out.println(person);
		}
		
		// Map Iteration #3 : EntrySet
		System.out.println("\nMap Iteration #3 : entries;");
		for(Map.Entry<String, Person> entry : madMen.entrySet()) {
			System.out.println(entry.getKey() + "\t: " + entry.getValue());
		}
	}
	
}
