package com.levo.generics.h_advanced;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class LambdaExamples {

	public static void main(String[] args) {
		final Person donDraper = new Person("Don Draper", 89);
		final Person peggyOlson = new Person("Peggy Olson", 75);
		final Person bertCooper = new Person("Bert Cooper", 100);
		
		Predicate<Person> isOld = person -> person.getAge() > 80;
		
		System.out.println(isOld.test(donDraper));
		System.out.println(isOld.test(peggyOlson));
		
		List<Person> people = new ArrayList<>();
		people.add(donDraper);
		people.add(peggyOlson);
		people.add(bertCooper);
		
//		final Map<Boolean, List<Person>> oldAndYoungPeople =
//				people.stream().collect(Collectors.partitioningBy(isOld));
		
		// or use
//		final Map<Boolean, List<Person>> oldAndYoungPeople =
//				people.stream().collect(Collectors.partitioningBy(person -> person.getAge() > 80));
		
		// type inference, target type on left side should be changed
//		final Map<Boolean, List<Person>> oldAndYoungPeople =
//		people.stream().collect(Collectors.partitioningBy(person -> person.getAge() > 80, Collectors.counting()));
		
		final Map<Boolean, Long> oldAndYoungPeople =
				people.stream().collect(
						Collectors.partitioningBy(person -> person.getAge() > 80, Collectors.counting()));
		
		System.out.println(oldAndYoungPeople);
		// this is my comment
		//this my commit to the new test branch
	}

}
