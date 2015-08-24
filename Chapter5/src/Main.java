class Print{
	public static void print(String s){
		System.out.println(s);
	}
}
class Bowl{
	
	Bowl(int marker){
		Print.print("Bowl"+"("+marker+")");
		}
	void f1(int marker){
		Print.print("f1("+marker+")");	
	}
}
class Table{
	static Bowl bowl1 = new Bowl(1);
	Table(){
		Print.print("Table()");
		bowl2.f1(1);
	}
	void f2(int marker){
		Print.print("f2("+marker+")");
	}
	static Bowl bowl2 = new Bowl(2);
}
class Cupboard{
	Bowl bowl3 = new Bowl(3);
	static Bowl bowl4 = new Bowl(4);
	Cupboard(){
		Print.print("Cupboard()");
		bowl4.f1(2);
	}	
	void f3(int marker){
		Print.print("f3("+marker+")");
	}
	static Bowl bowl5 = new Bowl(5);
}

public class Main {
	static String s;
	public static void main(String[] args){
//		
//		StringYY strYY = new StringYY(s);	
//		StringYY strYY2 = new StringYY();
//		ThisTest x = new ThisTest();
//		x.increment().increment().increment().print();
//		TwiceThis test = new TwiceThis();
//		test.Test2();
		Print.print("Creating new Cupboard() in main");
		new Cupboard();
		Print.print("Creating new Cupboard() in main");
		new Cupboard();
		table.f2(1);
		cupboard.f3(1);
	}
	static Table table = new Table();
	static Cupboard cupboard = new Cupboard();
}
