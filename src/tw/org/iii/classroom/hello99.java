package tw.org.iii.classroom;

public class hello99 {

	public static void main(String[] args) {
		
		for (int k = 0; k <= 3; k++) {
		for (int t = 1; t <= 9; t++) {
		for (int i = 2; i <= 5; i++) {
				
				int newi = i + k * 2 ;
				int a = newi * t;
				
			System.out.print(newi + "x" + t + "=" +  a + "\t");
		}
			System.out.println();
		}
		System.out.println("-------------------");
	}
	}
}
