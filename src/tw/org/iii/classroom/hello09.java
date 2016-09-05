package tw.org.iii.classroom;

public class hello9 {

	public static void main(String[] args) {
		// switch (只能是byte.short.int.char,有各自範圍值)可+String或Enum

		int dir = 0;
		final int b = 9;
		final int stop = 0;
		final int right = 1;
		final int left = 2;
		final int up = 3;
		final int down = 4;
		
		switch (dir) {
		case 10:
			System.out.println("F");
			break; // 若無break則會執行到下一個break為止
		case b+2:
			System.out.println("G");
			break;
		case stop: // case值不能為變數,ex.case b,須設定final int
			System.out.println("A");
			break;
		case right:
			System.out.println("B");
			break;
		case left:
			System.out.println("C");
			break;
		case up:
			System.out.println("D");
			break;
		case down:
			System.out.println("E");
			break;
		default:
			System.out.println("X");
			break;
			
			

		}

	}

}
