package com.connection.hashset;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet hash = new HashSet();
		hash.add("ha1");
		hash.add("ha1");
		hash.add("ha2");
		hash.add("ha3");
		hash.add("ha4");
		String s = "abc";
		s.hashCode();
		Iterator it = hash.iterator();
		while(it.hasNext())
			System.out.println(it.next());
	}

}
