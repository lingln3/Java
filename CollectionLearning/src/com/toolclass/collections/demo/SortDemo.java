package com.toolclass.collections.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.generic.demo.bean.Person;

public class SortDemo {

	public static void main(String[] args) {
		/*
		 * Collections：是集合框架的工具类
		 * 里面的方法都是static静态方法
		 */
		demo1();
	}
	public static void demo1()
	{
		List<String> list = new ArrayList<String>();
		list.add("abc");
		list.add("cbd");
		list.add("efe");
		list.add("adaskj");
		list.add("sldje");
		System.out.println(list);
		//对list结合进行指定顺序的排序
		/*
		 * String类自身实现了comparable，所以可以排序
		 */
		Collections.sort(list);
		System.out.println(list);
		/*mySort(list);
		System.out.println(list);
		Collections.sort(list, new MySort());
		System.out.println(list);*/
		mySort3(list,new MySort());
		System.out.println(list);
	}
	
	public static void mySort(List<String> list)
	{
		for(int i=0; i<list.size(); i++)
		{
			for(int j=i+1; j<list.size(); j++)
			{
				if(list.get(i).compareTo(list.get(j)) >0 )
				{
					/*String temp = list.get(i);
					list.set(i, list.get(j));
					list.set(j, temp);*/
					Collections.swap(list, i, j);
				}
			}
		}
	}
	
	public static<T extends Comparable<? super T>> void mySort2(List<T> list)
	{
		for(int i=0; i<list.size(); i++)
		{
			for(int j=i+1; j<list.size(); j++)
			{
				if(list.get(i).compareTo(list.get(j)) >0 )
				{
					T temp = list.get(i);
					list.set(i, list.get(j));
					list.set(j, temp);
				}
			}
		}
	}
	
	public static <T> void mySort3(List<T> list,Comparator<? super T> comp)
	{
		for(int i=0; i<list.size(); i++)
		{
			for(int j=i+1; j<list.size(); j++)
			{
				if(comp.compare(list.get(i), list.get(j))>0)
				{
					Collections.swap(list, i, j);
				}
			}
		}
	}
}

class MySort<T extends String> implements Comparator<T>
{
	@Override
	public int compare(T t1, T t2)
	{
		int temp = t1.length() - t2.length();
		return temp==0 ? t1.compareTo(t2) : temp;
	}
}
