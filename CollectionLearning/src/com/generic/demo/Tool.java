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
//��jdk1.5��ʹ�÷�������������Ҫ�����������������͡�
//�����࣬ʲôʱ���ã������еĲ����������������Ͳ�ȷ����ʱ�򣬾�ʹ�÷�����ȷ����
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
	 * �����Ͷ����ڷ�����
	 * ��ʱ����show�������Դ�ӡ�κ�����
	 * ��Ϊ�䷺���Ƕ����ڷ����ϵ�W
	 */
	public <W> void show(W str)
	{
		
		System.out.println("show:"+str.getClass());
	}
	//ֻ�ܴ�ӡQ�������ñ���
	public void println(Q str)
	{
		System.out.println(str);
	}
	/*
	 * ��������̬ʱ�����ܷ������϶���ķ��ͣ������̬����ʹ�÷��ͣ�
	 * ֻ�ܽ����Ͷ����ڷ�����
	 */
	public static <Y> void method(Y q)
	{
		System.out.println(q);
	}
}