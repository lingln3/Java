/*
 * 在同一个类中有2个方法，一个方法在内部调用2次另一个方法
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
