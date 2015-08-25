package com.toolclass.collections.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchDemo {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("abc");
		list.add("ac");
		list.add("cbd");
		list.add("efe");
		list.add("adaskj");
		list.add("sldje");
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		int index = Collections.binarySearch(list, "ac");
		System.out.println(index);
		
	}

}
