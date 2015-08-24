package com.basic.learning;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorDemo {

	public static void main(String[] args) {

		Collection coll1 = new ArrayList();
		coll1.add("ab1");
		coll1.add("ab2");
		coll1.add("ab3");
		coll1.add("ab4");
		 Iterator iter = coll1.iterator();
		 for(Iterator it = coll1.iterator();it.hasNext();)
		 {
			 System.out.println(it.next());
		 }
	}

}
