package com.connection.linkedlist;

import java.util.LinkedList;

public class DuiZhan {
	
	private LinkedList<Object> list;
	
	DuiZhan()
	{
		list = new LinkedList<Object>();
	}
	//添加元素
	public void addElement(Object obj)
	{
		list.add(obj);
	}
	//获取元素
	public Object getElement()
	{
		return list.removeLast();
	}
	//判断是否为空
	public boolean isKong()
	{
		return list.isEmpty();
	}
	
}
