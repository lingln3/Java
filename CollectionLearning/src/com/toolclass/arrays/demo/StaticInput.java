package com.toolclass.arrays.demo;

import java.util.ArrayList;
import java.util.Collections;
import static java.util.Collections.*;//��̬���룬��ʵ����������еľ�̬��Ա
import static java.lang.System.*;
/*
 * ��̬����
 */
public class StaticInput {

	public static void main(String[] args) {
		java.util.List<String> list = new ArrayList<String>();
		list.add("abc1");
		list.add("abc2");
		list.add("abc3");
		list.add("abc4");
//		System.out.println(list);
		out.println(list);
		sort(list);
		out.println(max(list));
		
	}

}
