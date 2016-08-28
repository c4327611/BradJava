package tw.org.iii.classroom;

public class hello41 {
	public static void main(String[] args) {
		// Exception
		int a = 10, b = 3;
		int[] c = {1,2,3};
		
		try{
		System.out.println(a / b); //
		System.out.println(c[3]); //上一段如果有錯,且下面抓到錯誤就不會執行此段
		}catch(ArithmeticException ae){
			System.out.println("Jeff");
		}catch (ArrayIndexOutOfBoundsException e2){
			System.out.println("iii");
		}catch(RuntimeException re){ //統一處理,但會不知哪裡出錯
			System.out.println("Big"); 
		}
		System.out.println("OK");
	}
}



