package tw.org.iii.classroom;

public class Hello06 {

	public static void main(String[] args) {
		int Score = (int) (Math.random() * 101);// 0 - 100
        Score = 85;
        System.out.println(Score);

    if (Score >= 90){
	   System.out.println("A");
	} else if (Score >= 80) {
	   System.out.println("B");
	} else if (Score >= 70) {
	   System.out.println("C");
	} else if (Score >= 60) {
		System.out.println("D");
	} else {
		System.out.println("E");
	}
    System.out.println(Math.sqrt(Score) * 10); // 開根號 * 10
	
	// 該怎麼轉整數?
}
	}


