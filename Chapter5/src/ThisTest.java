
public class ThisTest {
	int i = 0;
	ThisTest increment(){
		i++;
		return this;
	}
	void print(){
		System.out.println("i = "+i);
	}	
}
