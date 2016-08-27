package tw.org.iii.classroom;

public class hello30 {

	public static void main(String[] args) {
		//依不同型別 跑不同建構式
		//hello301 obj1 = new hello301();
		//hello302 obj2 = new hello302();
		//hello302 obj2 = new hello302(3);
		hello302 obj2 = new hello302("3");
	}

}
class hello301{
	hello301(){
		System.out.println("A");
	}
	hello301(int a){
		System.out.println("B");
	}
	hello301(byte a){
		System.out.println("c");
	}
	}
//繼承 extends
class hello302 extends hello301{
	hello302(){ // 此{}內不能為空,否則將呼叫無傳參數建構式
		// super(); 
		super(1); 
		System.out.println("d");
	}
	hello302(int a){
		//super();
		this(); //呼叫hello302()
		System.out.println("e");
	}
	hello302 (String b){
		this(1); //呼叫hello302(int a)
		System.out.println("f");
		
	}
}

