package com.basic.learning;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		Vector v = new Vector();
		v.addElement("abc1");
		v.addElement("abc2");
		v.addElement("abc3");
		v.addElement("abc4");
		System.out.println(v.elements());
		
		Enumeration enumer = v.elements();
		while(enumer.hasMoreElements())
		{
			System.out.print(enumer.nextElement());
		}
		System.out.println();
		Iterator it = v.iterator();
		while(it.hasNext())
		{
			System.out.print(it.next());
		}
	}

}
