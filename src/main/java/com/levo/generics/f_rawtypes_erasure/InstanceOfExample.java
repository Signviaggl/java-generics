package com.levo.generics.f_rawtypes_erasure;

public class InstanceOfExample<T> {
	
	public static void main(String[] args) {
		System.out.println(new InstanceOfExample<>() instanceof Object);
//		System.out.println(new InstanceOfExample<>() instanceof Integer);	// banned
	}
	
	@Override
	public boolean equals(Object o /*<T>*/) {	// Generic Type banned
		if(o instanceof InstanceOfExample) {
			return true;
		}
		
		return false;
	}
	
}
