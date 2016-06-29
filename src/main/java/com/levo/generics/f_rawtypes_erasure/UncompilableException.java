package com.levo.generics.f_rawtypes_erasure;

public class UncompilableException /*<T>*/ extends Exception {

	public static void main(String[] args) {
			try{
				throw new UncompilableException();
			} catch(UncompilableException /*<T>*/ e) { // runtime-check at a generic type is banned
				e.printStackTrace();
			}
	}

}
