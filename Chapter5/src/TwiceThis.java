/*
 * ��ͬһ��������2��������һ���������ڲ�����2����һ������
 */
public class TwiceThis {
	int x = 0;
	public void Test1(){
		int y = 0;
		x++;
		y++;
		System.out.println("x = " + x);
		System.out.println("y = " + y);
	}
	public void Test2(){
		Test1();
		this.Test1();
	}

}
