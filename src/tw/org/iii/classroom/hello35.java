package tw.org.iii.classroom;

public class hello35 {

	public static void main(String[] args) {
		hello354 car = new hello354();
		hello352 t1 = new hello352();
		hello353 t2 = new hello353();
		car.m1(t2);
		

	}

}
interface hello351 {
	void m1();
	void m2();
	
}
class hello352 implements hello351 { 
	public void m1(){System.out.println("hello352:m1()");} // 有{}代表有實作
	public void m2(){System.out.println("hello352:m2()");} // 不能比原來小 因此+public
	void m3(){System.out.println("hello352:m3()");}
}
class hello353 implements hello351{
	public void m1(){System.out.println("hello352:m1()");} 
	public void m2(){System.out.println("hello352:m2()");}
	void m4(){System.out.println("hello352:m4()");}
}
class hello354{
	void m1(hello351 obj1){
		obj1.m1();
		obj1.m2();
		}
}