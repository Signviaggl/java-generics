package com.levo.generics.g_reflection;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReifiableGenericExamples {

	public static void main(String[] args) {
		List<String> strings = new ArrayList<>();
		Class<?> arrayList = strings.getClass();
		
		// normal
		System.out.println(arrayList.toString());
		
		// generic
		System.out.println(arrayList.toGenericString());
		
		// type parameter
		final TypeVariable<? extends Class<?>>[] typeParameters = 
				arrayList.getTypeParameters();
		System.out.println(Arrays.toString(typeParameters));
		
		// inner class parameter
		final ParameterizedType arrayListOfString =
				(ParameterizedType) StringList.class.getGenericSuperclass();
		
		System.out.println(Arrays.toString(arrayListOfString.getActualTypeArguments()));
	}
	
	public static class StringList extends ArrayList<String>
	{ }

}
