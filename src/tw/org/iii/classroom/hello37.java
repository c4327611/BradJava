package tw.org.iii.classroom;

public class hello37 {
	public static void main(String[] args) {
		// 
		final int d; //d位區域變數 與c不同,但仍只能給一次值
		d = 12;
		System.out.println(hello376.a);
	}
}
interface hello371 {void m1();}
interface hello372 {void m2();}
class hello373 implements hello371, hello372 {
	public void m1(){}
	public void m2(){}
}
interface hello374 extends hello371 {//介面除了有方法也可以有屬性
	int a = 10; //但直接宣告時就要給值
	void m3();
}
interface hello375 extends hello371, hello372 {
	int a = 10; //public final static/驗證 376m1()為final
	void m3(); //public
}
class hello376 implements hello375 {
	int b;
	final int c; //c為屬性 要給值,只能給一次 /final int c = 12;
	
	hello376(){c =12;} //建構式{}中變區域變數(給值)
	@Override
	public void m1() {
		b++;
		//a=1; 
	}

	@Override
	public void m2() {
		
	}

	@Override
	public void m3() {
		
	}
	
}