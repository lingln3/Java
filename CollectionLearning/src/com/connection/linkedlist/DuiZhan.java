package com.connection.linkedlist;

import java.util.LinkedList;

public class DuiZhan {
	
	private LinkedList<Object> list;
	
	DuiZhan()
	{
		list = new LinkedList<Object>();
	}
	//���Ԫ��
	public void addElement(Object obj)
	{
		list.add(obj);
	}
	//��ȡԪ��
	public Object getElement()
	{
		return list.removeLast();
	}
	//�ж��Ƿ�Ϊ��
	public boolean isKong()
	{
		return list.isEmpty();
	}
	
}
