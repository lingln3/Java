package com.collection.map;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

import com.collection.treeset.CompareByLength;

public class TreeMapDemo {
	public static void main(String[] args) {

		/*
		 * ��ѧ�������ѧ���Ĺ�����ͨ��key-value�洢��map�����С�
		 * ��ѧ�����������������
		 */
//		demo1();
//		demo2();
		demo3();
	}
	//�Զ���Ƚ����������������ȱȽϣ�������ͬ���ٸ��������Ƚ�
	public static void demo3() {
		TreeMap<Student,String> tm = new TreeMap<Student,String>(new CompareByLength());
		tm.put(new Student("lisi",38),"����");
		tm.put(new Student("zhaoliu",24),"�Ϻ�");
		tm.put(new Student("xiaoqiang",31),"����");
		tm.put(new Student("wangwu",28),"����");
		tm.put(new Student("zhaoliu",24),"����");
		tm.put(new Student("zhaoliu",24),"����");
		Iterator<Map.Entry<Student,String>> it = tm.entrySet().iterator();
		while(it.hasNext())
		{
			Map.Entry<Student, String> me = it.next();
			String value = me.getValue();
			System.out.println(me.getKey().getName()+":"+me.getKey().getAge()+"����"+value);
		}
	}
	//�Զ���Ƚ����������������бȽ�
	public static void demo2() {
		@SuppressWarnings("unchecked")
		TreeMap<Student,String> tm = new TreeMap<Student,String>(new CompareByName());
		tm.put(new Student("lisi",38),"����");
		tm.put(new Student("zhaoliu",24),"�Ϻ�");
		tm.put(new Student("xiaoqiang",31),"����");
		tm.put(new Student("wangwu",28),"����");
		tm.put(new Student("zhaoliu",24),"����");
		tm.put(new Student("zhaoliu",24),"����");
		Iterator<Map.Entry<Student,String>> it = tm.entrySet().iterator();
		while(it.hasNext())
		{
			Map.Entry<Student, String> me = it.next();
			String value = me.getValue();
			System.out.println(me.getKey().getName()+":"+me.getKey().getAge()+"����"+value);
		}
	}
	//ͨ��Ԫ���������Խ�������
	public static void demo1() {
		TreeMap<Student,String> tm = new TreeMap<Student,String>();
		tm.put(new Student("lisi",38),"����");
		tm.put(new Student("zhaoliu",24),"�Ϻ�");
		tm.put(new Student("xiaoqiang",31),"����");
		tm.put(new Student("wangwu",28),"����");
		tm.put(new Student("zhaoliu",24),"����");
		tm.put(new Student("zhaoliu",24),"����");
		Iterator<Map.Entry<Student,String>> it = tm.entrySet().iterator();
		while(it.hasNext())
		{
			Map.Entry<Student, String> me = it.next();
			String value = me.getValue();
			System.out.println(me.getKey().getName()+":"+me.getKey().getAge()+"����"+value);
		}
	}
}