package com.basic.learning;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		List list = new ArrayList();
		show(list);
	}

	public static void show(List list) {
		//����
		list.add("abc1");
		list.add("abc2");
		list.add("abc3");
		list.add("abc4");
		System.out.println(list);
		//����
		list.add(1, "abc9");
		System.out.println(list);
		//ɾ��
		System.out.println("remove:"+list.remove(2));
		System.out.println(list);
		//�޸�		
		System.out.println(list.set(0, "abc8"));
		//��
		System.out.println("get:"+list.get(3));
		System.out.println(list.subList(1, 3));
	}

}