package com.generic.demo;

public class GenericDemo5 implements GenericInterface<String>{

	public void show(String s)
	{
		System.out.println(s);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterInp<Integer> in = new InterInp<Integer>();
		in.show(5);
	}

}
class InterInp<Q> implements GenericInterface<Q>
{
	public void show(Q q)
	{
		System.out.println(q);
	}
}
