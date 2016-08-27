package tw.org.iii.classroom;

public class hello31 {

	public static void main(String[] args) {
		// TWid.java
		
		String a = "0123";
		System.out.println(a.concat("hello")); // a不會改變,只在輸出時+hello
		System.out.println(a);
		System.out.println(a.replace('2', 'k')); // a不變,只在輸出時替換
		System.out.println(a); //驗證上述a未變
		
		StringBuffer sb1 = new StringBuffer(); //如數字不變用String,會變用StringBuffer 效能
		sb1.append("abc");
		System.out.println(sb1);
		System.out.println(sb1.capacity()); //容量原16字元
		sb1.append("1234567890123456789012345678901234");
		System.out.println(sb1.capacity());
		sb1.append("12");
		System.out.println(sb1.capacity());
		

	}

}
