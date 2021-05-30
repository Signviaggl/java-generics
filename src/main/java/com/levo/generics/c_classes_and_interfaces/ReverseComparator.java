package com.levo.generics.c_classes_and_interfaces;

import java.util.Comparator;

public class ReverseComparator<T> implements Comparator<T> {
	
	private final Comparator<T> delegateComparator;
	
	public ReverseComparator(final Comparator<T> delegateComparator) {
		this.delegateComparator = delegateComparator;
	}
	
	@Override
	public int compare(final T left, final T right) {
		return -1 * delegateComparator.compare(left, right);
	}

}

/*public class ReverseComparator implements Comparator<Person> {

	@Override
	public int compare(final Person left, final Person right) {
		return -1* Integer.compare(left.getAge(), right.getAge());
	}

}
*/