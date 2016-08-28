package tw.org.iii.classroom;

public class hello32 {

	public static void main(String[] args) {
		hello321 obj11 = new hello321();
		hello321 obj12 = new hello321();
//		hello322 obj2 = new hello322();
//		hello323 obj3 = new hello323();

	}

}
class hello321 {
	int a = 12; //物件建構(初始)之前要預先處理的 {物件程式區塊}==>需有物件  
	{
		System.out.println("hello321:{}" + ++a);
	}
	static { // 
		System.out.println("hello321:static{}");
	}
	hello321(){ 
		System.out.println("hello321()");}
	static void m1(){ //void不傳回
		System.out.println("hello321:m1()");
		
	}
}
class hello322 extends hello321 {
	hello322(){
		System.out.println("hello322()");
	}
	class hello323 extends hello322{
		hello323(){
			System.out.println("hello323()");
		}
	}
}