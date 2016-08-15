package tw.org.iii.classroom;

public class Year2 {

	public static void main(String[] args) {
		// 由使用者輸入年份後再判斷是否為閏年
		
		 System.out.println("請輸入西元年分");
    	
    	
		
		if (year % 400 == 0) {
			System.out.println("該年度為閏年");
		} else if (year % 100 == 0) {
			System.out.println("該年度為平年");
		} else if (year % 4 == 0) {
			System.out.println("該年度為閏年");
		} else {
			System.out.println("該年度為平年");
		}
		

	}

}
