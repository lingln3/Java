import java.util.ArrayList;
import java.util.Random;

/*
 * 产生25个随机数。
 * 对每个随机数，使用if-else语句将其分类为><=紧随他而随机生成的值。
 */
public class RandNum2 {
	public void randNum(){
		Random random = new Random();
		ArrayList<Integer> num = new ArrayList<Integer>();
		ArrayList<Integer> dayu = new ArrayList<Integer>();
		ArrayList<Integer> xiaoyu = new ArrayList<Integer>();
		ArrayList<Integer> dengyu = new ArrayList<Integer>();
		
		int i =0,m =0,n = 0,p = 0;
		do{
			num.add(random.nextInt(1000));
			i++;
		}while(i<=25);
		
		for(int j = 0; j <25; j++){
			if(num.get(j) > num.get(25)){
				dayu.add(num.get(j));							
			}
			else if(num.get(j) < num.get(25)){
				xiaoyu.add(num.get(j));
			}
			else{
				dengyu.add(num.get(j));
			}
		}
		
		System.out.println(dayu);
		System.out.println(xiaoyu);
		System.out.println(dengyu);
	}
}
