package com.basic.learning;

import java.util.LinkedList;

public class DuiLie {
	private LinkedList link;
	DuiLie()
	{
		link = new LinkedList();
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
