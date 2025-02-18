package com.levo.generics.h_advanced;

import java.io.*;

public class PersonReader {
	
	
	public static void main(String[] args) throws FileNotFoundException {
		PersonReader reader = new PersonReader();
		
		DataInputStream stream = new DataInputStream(new FileInputStream("src/main/resources/person"));
		Person person = reader.read(stream);
		System.out.println(person);
		
		RandomAccessFile randomAccess = new RandomAccessFile("src/main/resources/person", "rw");
		person = reader.read(randomAccess);
		System.out.println(person);
	}
	
	public Person read(final DataInputStream source) {
		try(DataInputStream input = source) {
			return new Person(input.readUTF(), input.readInt());
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
	
	// T extends DataInput and Closeable
	public <T extends DataInput & Closeable> Person read(final T source) {
		try(T input = source) {
			return new Person(input.readUTF(), input.readInt());
		} catch(IOException e) {
			throw new RuntimeException(e);
		}
	}
}

// what is this happening and why is this happening?!!

