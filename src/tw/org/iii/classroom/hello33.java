package tw.org.iii.classroom;

public class hello33 {

	public static void main(String[] args) {
		//
		hello332 obj1 = new hello332();
		obj1.m1();
		obj1.m2();
		obj1.m1(3);
		

	}

}
class hello331{
	int a;
	void m1(){System.out.println("hello331:m1()");a++;}
}
class hello332 extends hello331 {
//	void m1() {System.out.println("hello332:m1()");//繼承並且覆蓋
	
//	void m1(){
//		super.m1();
//		System.out.println("hello332:m1()");
//	} 
	void m1(int a){
		super.m1();
		a++;
		System.out.println("hello332:m1(int):" + this.a++);
	}
	void m2() {System.out.println("hello332:m2()");}
}