package tw.org.iii.classroom;

public class hello14 {

	public static void main(String[] args) {
	 
//		for(int i=1; i<=100; i++){
//			System.out.println(i + " ");
//			int a = i;
//			if (a % i == 0){
//				System.out.println(a + "*");
//			} else if (a % i ! 0) {
//				System.out.println(a);
//			}
		
		for (int j = 0; j < 10; j++){
			for (int i = 1; i <=10; i++){
				int v = j * 10 + i;
			//System.out.print(v + "\t");
				//判斷是否為質數 1-100
				boolean isok = true;
				for (int k=2; k<v; k++){
					if (v % k == 0) {
			//你不是質數
						isok = false;
						break;
					}
				
			}
			System.out.print(v + (isok?"*":" ") + "\t");
		}
		System.out.println();

	}

}}