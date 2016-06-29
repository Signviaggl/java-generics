package com.levo.generics.f_rawtypes_erasure;

import java.util.List;

public class Overloading {
	
	public void print(String param) {
		
	}
	
	public void print(Integer param) {
		
	}
	
	public void print(List<String> param) {
		
	}

	// Same method signature, generic type erased, all are
	// considered as java.util.List by compiler
//	public void print(List<Integer> param) {
//		
//	}
	
}
