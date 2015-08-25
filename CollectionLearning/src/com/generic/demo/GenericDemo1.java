package com.generic.demo;

import java.util.ArrayList;
import java.util.Iterator;

public class GenericDemo1 {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("abc1");
		al.add("abc2");
		al.add("abc3");
		al.add("abc4");
		
		Iterator<String> it = al.iterator();
		while(it.hasNext())
		{
			String str =(String)it.next();
			System.out.println(str);
		}
	}

}
