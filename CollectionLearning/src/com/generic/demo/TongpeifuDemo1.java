package com.generic.demo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import com.generic.demo.bean.Person;
import com.generic.demo.bean.Student;
import com.generic.demo.bean.Worker;

public class TongpeifuDemo1 {

	public static void main(String[] args) {
		ArrayList<Worker> al1 = new ArrayList<Worker>();
		al1.add(new Worker("abc",20));
		al1.add(new Worker("abc2",25));
		ArrayList<Student> al2 = new ArrayList<Student>();
		al2.add(new Student("haha",20));
		al2.add(new Student("haha2",25));
		ArrayList<Integer> al3 = new ArrayList<Integer>();
		al3.add(3);
		al3.add(4);
		ArrayList<String> al4 = new ArrayList<String>();
		al4.add("aa");
		al4.add("hh");
		ArrayList<String> al5 = new ArrayList<String>();
		al5.addAll(al4);
//		printCollection(al1);
//		printCollection(al2);
		printPersonCol(al1);
		printPersonCol(al2);
//		printPersonCol(al3);//��ΪprintPersonCol����ֻ�ܴ���Person����ļ���
//		printSuperCol(al1);//��ΪWorker����Student�ĸ��࣬���Բ��ܴ���
		printSuperCol(al2);
	}
	//��ӡ��������
	public static void printCollection(Collection<?> c)
	{
		Iterator<?> it = c.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next().toString());
		}
	}
	//��ӡPerson���༯��
	/*
	 * ���͵��޶�
	 */
	public static void printPersonCol(Collection<? extends Person> c)
	{
		Iterator<? extends Person> it = c.iterator();
		while(it.hasNext())
		{
			Person p = it.next();
			System.out.println(p.getName()+":"+p.getAge());
		}
	}
	/*
	 * ��������
	 * ����Student��Student�ĸ����Ͷ���
	 */
	public static void printSuperCol(Collection<? super Student> c)
	{
		Iterator<? super Student> it = c.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}
}

//���弯��
class MyCollection<E>
{
	public void add(E e)
	{
		
	}
	public void addAll(MyCollection<? extends E> e)
	{
		
	}
}