package tw.org.iii.classroom;

public class hello19 {

	public static void main(String[] args) {
		// 20160820 hello17-2 一維陣列
		
//		int[] p = new int[6];
//		for (int i=0; i<100; i++){
//		int point = (int) (Math.random()*6); // 0~5
//		p[point]++;
//		}
//		for (int i=0; i<p.length; i++){
//		System.out.println((i+1) + ":" + p[i]);
//}
		int[] p =new int[6]; //骰子共六面
		for (int i=0; i<10000; i++){ //共測1W次
			int point = (int) (Math.random()*9); //作弊,使骰子變9面
			p[(point>=6?point-3:point)]++;	//
		}
		for (int i=0; i<p.length; i++){
				System.out.println((i+1) + ":" + p[i]);
				
			}
			
			
			
			
		}
}
