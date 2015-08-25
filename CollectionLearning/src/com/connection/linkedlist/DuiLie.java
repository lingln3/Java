package com.connection.linkedlist;

import java.util.LinkedList;

public class DuiLie {
	private LinkedList<Object> link;
	public DuiLie()
	{
		link = new LinkedList<Object>();
	}
	//添加元素
	public void myAdd(Object obj)
	{
		link.addLast(obj);
	}
	//获取元素
	public Object myGet()
	{
		return link.removeFirst();
	}
	//判断是否为空
	public boolean isKong()
	{
		return link.isEmpty();
	}
}
