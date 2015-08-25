package com.toolclass.collections.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MaxDemo {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("abc");
		list.add("ac");
		list.add("cbd");
		list.add("efe");
		list.add("adaskj");
		list.add("sldje");
		
		//获取最大值
		String max = Collections.max(list,new MySort());
		System.out.println(max);
		System.out.println(list);
		Collections.reverse(list);
		System.out.println(list);
	}

}
