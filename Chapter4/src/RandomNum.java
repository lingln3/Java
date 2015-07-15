import java.util.Random;

/*
 * 产生随机数，直到符合特定的条件为止
 */
public class RandomNum {
	public boolean condition(){
		boolean result = Math.random()<0.99;
		return result;
	}
	public void compare(){
		while(condition()){
			System.out.println("在循环中");
		}
		System.out.println("出循环");
	}
}
