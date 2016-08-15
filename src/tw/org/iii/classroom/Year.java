package tw.org.iii.classroom;

public class Year {

	public static void main(String[] args) {
		// 判斷是否為閏年
	
		int year = 2345;
		
		
				
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
