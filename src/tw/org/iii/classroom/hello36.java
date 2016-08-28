package tw.org.iii.classroom;

public class hello36 {

	public static void main(String[] args) {
		// 
		String a = "Jeff";
		String b = "Jeff";
		String c = new String("Jeff");
		String d = new String("Jeff");
		
		//if (c ==d ) { //會顯示會XX,因是指定在不同位置的"Jeff"
		
		if (a.equals(c)){ //變成比較字串內容
			System.out.println("OK");
		} else {
			System.out.println("XX");
		}

	}

}
