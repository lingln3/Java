package com.connection.linkedlist;

import com.basic.learning.DuiLie;


/*
 * ʹ��LinkedList��ģ��һ����ջ��������ݽṹ��
 * ��ջ���Ƚ������FILO��first in last out����
 * ���У��Ƚ��ȳ���FIFO����
 * 
 * ����Ӧ����������һ����������ʹ�����ṩһ������������������ֽṹ�е�һ��
 */

public class LinkedListTest {
	
	public static void main(String[] args) {
		DuiLie dui = new DuiLie();
		dui.myAdd("abc1");
		dui.myAdd("abc2");
		dui.myAdd("abc3");
		while(!dui.isKong())
			System.out.print(dui.myGet());
	}

}
