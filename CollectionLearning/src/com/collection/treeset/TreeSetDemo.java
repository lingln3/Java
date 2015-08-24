package com.collection.treeset;

import java.util.Iterator;
import java.util.TreeSet;

import com.basic.learning.bean.Person;

public class TreeSetDemo {

	public static void main(String[] args) {
//		demo1();
//		demo2();
//		demo3();
		TreeSet ts = new TreeSet(new ComparatorByLength());
		ts.add(new Person("zhangsan",30));
		ts.add(new Person("lisi",24));
		ts.add(new Person("wangwu",23));
		ts.add(new Person("zhaoliu",23));
		ts.add(new Person("bigan",23));
		Iterator it = ts.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}

	//�ڼ��ϳ�ʼ��ʱ�Ͷ����˱Ƚ��������Ƚ���������Ϊ�������ݸ�TreeSet���ϵĹ��캯��
	public static void demo3() {
		TreeSet ts = new TreeSet(new ComparatorName());
		ts.add(new Person("zhangsan",30));
		ts.add(new Person("lisi",24));
		ts.add(new Person("wangwu",23));
		ts.add(new Person("zhaoliu",23));
		ts.add(new Person("bigan",23));
		Iterator it = ts.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}
	//��Person����ʵ����Comparable�ӿڣ�������compareTo�������бȽ�
	public static void demo2() {
		TreeSet ts = new TreeSet();
		ts.add(new Person("zhangsan",30));
		ts.add(new Person("lisi",24));
		ts.add(new Person("wangwu",23));
		ts.add(new Person("zhaoliu",23));
		ts.add(new Person("bigan",23));
		Iterator it = ts.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}

	public static void demo1() {
		TreeSet ts = new TreeSet();
		ts.add("abc5");
		ts.add("bbc3");
		ts.add("cbc2");
		ts.add("dbc4");
		ts.add("abc3");
		Iterator it = ts.iterator();
		while(it.hasNext())
		{
			Object obj = it.next();
			System.out.println(obj);
		}
	}

}