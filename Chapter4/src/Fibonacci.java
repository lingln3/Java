import java.util.Scanner;
/*
 * Fibonacci����
 */

public class Fibonacci {
	
	public void Fibo(int x){
		int before1 = 1, before2 = 1;
		int sum = 0;
		if(x == 1){
			System.out.println("1");
		}
		else if(x == 2){
			System.out.println("1,1");
		}
		else{
			System.out.print("1,1,");
			for(int j = 0; j <(x-2) ; j++){
				sum = before1 + before2;
				before1 = before2;
				before2 = sum;
				System.out.print(sum+",");
			}
		}
	}
	
	public void Fibona(){
		System.out.println("������һ������");
		int m = 0;
		Scanner sc = new Scanner(System.in);
		m = sc.nextInt();
		Fibo(m);
	}

}