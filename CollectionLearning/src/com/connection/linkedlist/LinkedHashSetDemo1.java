package com.connection.linkedlist;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo1 {

	public static void main(String[] args) {
		Set set = new LinkedHashSet();
		set.add("abc1");
		set.add("abc2");
		set.add("abc3");
		set.add("abc4");
		set.add("abc1");
		System.out.println(set);
		set.add("abc3");
		System.out.println(set);
	}

}
