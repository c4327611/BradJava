package tw.org.iii.classroom;

public class hello43 {
	public static void main(String[] args) {
		// 呼叫的堆疊
		hello433 obj1 = new hello433();
		try{
		    obj1.m3();
		}catch(Exception ee){
			
		}
	}

}
class hello431{
	void m1() throws Exception {
		throw new Exception();
	}
}
class hello432 extends hello431{
	void m2()throws Exception{
		m1();
	}
}
class hello433 extends hello432{
	void m3()throws Exception{
		 m2();
	}
}