import java.util.Random;

/*
 * �����������ֱ�������ض�������Ϊֹ
 */
public class RandomNum {
	public boolean condition(){
		boolean result = Math.random()<0.99;
		return result;
	}
	public void compare(){
		while(condition()){
			System.out.println("��ѭ����");
		}
		System.out.println("��ѭ��");
	}
}
