package tw.org.iii.classroom;

public class hello18 {

	public static void main(String[] args) {
		// 20160820 陣列 
		
		int[] a;
		int b[];
		int c; c = 12;
		a = new int[7]; //a內有7個元素 sysout(a.length)
		// 宣告.給new代表(int.double.short.char等等)已有預設值0,boolean預設為false
		a[2] = 12;
		a[5] = 100;
		a[6] = 7;
		for (int i=0; i<a.length; i++){
		System.out.println(a[i]);
		}
		System.out.println("-----");
		int[] d = new int[3];
		int[] e = new int[]{1,2,3,5,7};
		for (int i=0; i<e.length; i++) {
			System.out.println(e[i]);
		}
		System.out.println("-----");
		int[] f = {1,2,3,5,7};
		for (int i=0; i<f.length; i++){
			System.out.println(f[i]);
		}

	}

}
