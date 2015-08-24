package com.basic.learning;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		List list = new ArrayList();
		show(list);
	}

	public static void show(List list) {
		//添加
		list.add("abc1");
		list.add("abc2");
		list.add("abc3");
		list.add("abc4");
		System.out.println(list);
		//插入
		list.add(1, "abc9");
		System.out.println(list);
		//删除
		System.out.println("remove:"+list.remove(2));
		System.out.println(list);
		//修改		
		System.out.println(list.set(0, "abc8"));
		//查
		System.out.println("get:"+list.get(3));
		System.out.println(list.subList(1, 3));
	}

}
