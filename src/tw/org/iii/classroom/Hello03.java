package tw.org.iii.classroom;

public class Hello03 {

	public static void main(String[] args) {
		// char 2^16 => 0 - 65535 
		// Unicode 萬國碼 ASCII
		
		char v1 = 'a'; //小寫a為97
		char v2 = 98;  //ASCII為小寫b
		char v3 = '資';
		System.out.println(v1);
		System.out.println(v2);
		System.out.println(v3);
		
		int v4 = v1 + v2;
				System.out.println(v4);
				
		char v5 = 'A'; //65
		char v6 = 66;  //大寫B
		int v7 = v5 + v6;
		System.out.println(v5);
		System.out.println(v6);
		System.out.println(v7);
	
		
	}

}
