package com.levo.generics.e_wildcards;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

public class PersonStorageTest {
	
	private Partner donDraper = new Partner("Don Draper", 89);
	private Partner bertCooper = new Partner("Bert Cooper", 100);
	private Employee peggyOlson = new Employee("Peggy Olson", 65);
	
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
		persons.add(donDraper);
		persons.add(bertCooper);
		
		saver.saveAll(persons);
		
		assertEquals(donDraper, loader.load());
		assertEquals(bertCooper, loader.load());
	}
	
	@Test
	public void loadsListsOfPeople() throws Exception {
		saver.save(donDraper);
		saver.save(peggyOlson);
		
		List<Hayvan> people = new ArrayList<>();
		loader.loadAll(people);
		
		assertEquals(donDraper, people.get(0));
		assertEquals(peggyOlson, people.get(1));
	}
	
}
