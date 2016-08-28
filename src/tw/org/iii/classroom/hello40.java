package tw.org.iii.classroom;

public class hello40 {
	public static void main(String[] args) {
		// 
		hello401 obj1 = new hello401();
		hello402 obj2 = new hello402();
		hello401 obj3 = new hello402();
		//hello402 obj4 = new hello401();  //xx  
		obj1.m1();
		obj2.m1();
		obj3.m1(); //宣告為401 
	}

}
class hello401 {
	int a = 1;
	void m1(){System.out.println("hello401:m1():" + a);}

}
class hello402 extends hello401 {
	int a = 2;
	void m1(){System.out.println("hello402:m1():" + a);}
	void m2(){System.out.println("hello402:m2():");}
}