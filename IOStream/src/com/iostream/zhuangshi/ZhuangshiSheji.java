package com.iostream.zhuangshi;

public class ZhuangshiSheji {

	public static void main(String[] args) {
		
		Person p = new Person();
//		p.chifan();
		
		NewPerson p1 = new NewPerson(p);
		p1.chifan();
	}

}

class Person
{
	void chifan(){
		System.out.println("�Է�");
	}
}
//�����ĳ�����Ϊ����ǿPerson�����ֵ�
class NewPerson
{
	private Person p;
	NewPerson(Person p)
	{
		this.p = p;
	}
	
	public void chifan()
	{
		System.out.println("��θ��");
		p.chifan();
		System.out.println("���");
	}
	
	
}