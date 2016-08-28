package tw.org.iii.classroom;

public class hello39 {

	public static void main(String[] args) {
		// abstract 抽象類別 
		
		hello391 obj1 = new hello391();
		//hello392 obj2 = new hello392(); //如是抽象內容則無法具體化
		hello392 obj2 = new hello393();
		hello393 obj3 = new hello393();
		hello393 obj4 = (hello393)obj2; //obj2強制轉型

	}

}
class hello391 {
	void m1(){}
	void m2(){}
}
abstract class hello392 {
	hello392(){System.out.println("hello392()");}
	void m1(){System.out.println("hello392:m1()");}
	abstract void m2();
	
}
class hello393 extends hello392 { 
	void m2(){System.out.println("hello392:m2()");} //如不實作仍需要宣告為抽象類別
	void m3(){System.out.println("hello392:m3()");} 
}
final class hello394 {
	
}