import java.util.Random;


public class Coin {
	public static void main(String[] args){
		Random rand = new Random();
		int x = 0, y = 0;
		for(int j = 0; j < 10000; j++){
			int i  = rand.nextInt(2);
			if(i == 1){
				x++;
			}
			else {
				y++;
			}			
		}
		System.out.println("x="+x);
		System.out.println("y="+y);
		System.out.println((float)(x/y));
	}
}
