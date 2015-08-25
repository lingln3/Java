package com.generic.demo;

//import com.generic.demo.bean.Object;

/*public class Tool {
	
	private Object Object;

	public Object getObject() {
		return Object;
	}

	public void setObject(Object Object) {
		this.Object = Object;
	}	
}*/
//在jdk1.5后，使用泛型来接收类中要操作的引用数据类型。
//泛型类，什么时候用？当类中的操作的引用数据类型不确定的时候，就使用泛型来确定。
public class Tool<Q>
{
	private Q q;
	public Q getObject()
	{
		return q;
	}
	public void setObject(Q obj)
	{
		this.q = obj;
	}
	/*
	 * 将泛型定义在方法上
	 * 此时，该show方法可以打印任何类型
	 * 因为其泛型是定义在方法上的W
	 */
	public <W> void show(W str)
	{
		
		System.out.println("show:"+str.getClass());
	}
	//只能打印Q类型引用变量
	public void println(Q str)
	{
		System.out.println(str);
	}
	/*
	 * 当方法静态时，不能访问类上定义的泛型，如果静态方法使用泛型，
	 * 只能将泛型定义在方法上
	 */
	public static <Y> void method(Y q)
	{
		System.out.println(q);
	}
}
