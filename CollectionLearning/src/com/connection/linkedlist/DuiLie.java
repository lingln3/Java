package com.connection.linkedlist;

import java.util.LinkedList;

public class DuiLie {
	private LinkedList<Object> link;
	public DuiLie()
	{
		link = new LinkedList<Object>();
	}
	//���Ԫ��
	public void myAdd(Object obj)
	{
		link.addLast(obj);
	}
	//��ȡԪ��
	public Object myGet()
	{
		return link.removeFirst();
	}
	//�ж��Ƿ�Ϊ��
	public boolean isKong()
	{
		return link.isEmpty();
	}
}
