/*
 * 找出4为所有的吸血鬼数字
 */

public class XiXueGuiNum {
	public void XixueNum(){
		int x = 0;
		int y = 0;
		int num = 0;
		for(x=10; x<100; x++){			
			for(y = 10; y<100; y++){
				if(x*y <10000){
					if((x%10 + y%10)!=0 ){
					num = x*y;
					System.out.print(num + " ");
					}
				}		
				else break;
			}
		}
	}
}
