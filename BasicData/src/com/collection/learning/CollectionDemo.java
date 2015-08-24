package com.collection.learning;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo {

	public static void main(String[] args) {
		Collection coll = new ArrayList();
		Collection coll2 = new ArrayList();
		show(coll);
		coll2.add("hehe");
		coll2.add("ac1");
		coll2.add("ac2");
//		coll.removeAll(coll2);
		coll.retainAll(coll2);
		System.out.println(coll);
	}
	
	public static void show(Collection coll)
	{
		coll.add("ac");
		coll.add("ac1");
		coll.add("ac2");
		coll.add("ac3");
		System.out.println(coll);
	}

}
