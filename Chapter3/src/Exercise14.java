import java.util.Scanner;


public class Exercise14 {
	String string1 = null,string2 = null;
	String[] str = null;
	
	public void Exer(){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("������2���ַ���");
		string1 = sc.next();
		string2 = sc.next();	
		System.out.println(string1 +"   " + string2);
		if(string1 == string2){
			System.out.println("���");
		}
		else{
			System.out.println("�����");
		}
	}
}
