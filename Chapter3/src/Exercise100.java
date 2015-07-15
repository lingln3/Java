
public class Exercise100 {
	int x = 0xaaaaaaaa;
	int y = 0x55555555;
	public void output(){
		System.out.println(Integer.toBinaryString((x&y)));
		System.out.println(Integer.toBinaryString((x^y)));
		System.out.println(Integer.toBinaryString((x|y)));
	}
	
}
