package tw.org.iii.classroom;

public class hello10 {

	public static void main(String[] args) {
		// 20160820

		int month = (int)(Math.random()*12+1) ; //1-12月;
		System.out.println(month);
		switch (month){
		case 1: case 3: case 5: case 7: case 8:	case 10: case 12:
			System.out.println("31天");
			break;
		case 2:
			System.out.println("28天");
			break;
		case 4: case 6: case 9: case 11: 
			System.out.println("30天");
			break;
		default:
			System.out.println("NG"); // 若跑出NG 則(int)(Math.random()*12+1)設定錯誤
			break;
		}
		

	}

}
