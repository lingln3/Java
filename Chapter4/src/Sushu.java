/*
 *��ӡ����
 */
public class Sushu {
	public void PrintSuShu(){
		int i = 0;
		boolean b = false;
		for(i = 2;i<100;i++){
			for(int j = 2; j <= i; j++){
				if(i == 2) {								
					System.out.print(i+",");
				}				
				else{
					if(i%j == 0&& i != j){
						break;//break��������for(int j)ѭ��
					}
					else if(i == j){
						System.out.print(i+",");
						break;
					}
				}
			}			
		}
	}
}
