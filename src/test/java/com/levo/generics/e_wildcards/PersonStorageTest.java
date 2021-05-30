package com.levo.generics.e_wildcards;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

public class PersonStorageTest {
	
	private Partner parntner1 = new Partner("Don Draper part1", 89);
	private Partner partner2 = new Partner("Bert Cooper part2", 100);
	private Employee emp1 = new Employee("Peggy Olson Emp1", 65);
	
	static File file;
	static PersonSaver saver;
	static PersonLoader loader;
	
	static {
		file = new File("persons");
		try {
			saver = new PersonSaver(file);
			loader = new PersonLoader(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		System.out.println("static part ran !");

	}
	
	@Test
	@Ignore
	public void savesAndLoadsPerson() throws Exception {
		Person person = new Person("Bob", 20);
		saver.save(person);
		
		assertEquals(person, loader.load());
	}
	
	@Test
	public void savesAndLoadsArraysOfPeople() throws Exception {
		
		List<Partner> persons = new ArrayList<>();
		persons.add(parntner1);
		persons.add(partner2);
		
		saver.saveAll(persons);
		
		assertEquals(parntner1, loader.load());
		assertEquals(partner2, loader.load());
	}
	
	@Test
	public void loadsListsOfPeople() throws Exception {
		saver.save(parntner1);
		saver.save(emp1);
		
		List<Hayvan> people = new ArrayList<>();
		loader.loadAll(people);
		
		assertEquals(parntner1, people.get(0));
		assertEquals(emp1, people.get(1));
	}
	
}
