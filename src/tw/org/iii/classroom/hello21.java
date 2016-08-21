package tw.org.iii.classroom;

public class hello21 {

	public static void main(String[] args) {
		// 二維.多維
		
		int[][] a;
		int[] b[];
		int c[][];
		int[] d = new int[2];
		int e = 2;
		a = new int [3][2];
//		System.out.println(a); // [I@15db9742 表示記憶體位置
//		System.out.println(a.length); //a[3]
//		System.out.println(a[0][1]); //初始為0
		b = new int[4][];
		b[0] = new int[2];
		b[1] = new int[3];
		System.out.println(b[1].length); // b[4]
		//c = new int[][3]; //NG 要先設一維
		
		int[] f = {1,2,3,4};
		System.out.println(f.length);
		for (int i=0; i<f.length; i++);
		System.out.println();
		
		
		

	}

}
