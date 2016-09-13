package tw.org.iii.classroom;

public class hello64 {

	public static void main(String[] args) {
		// 繼承介面

	}

}
interface hello641{ //interface 介面  不能實作,但可以被繼承
	void m1();
		
	}
interface hello642{
	void m2();
}
interface hello643 extends hello641, hello642 {
	void m3();
	
}
class hello644 implements hello643{
	public void m1(){}
	public void m2(){}
	public void m3(){}
}