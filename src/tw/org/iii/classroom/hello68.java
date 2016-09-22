package tw.org.iii.classroom;

public class hello68 {

	public static void main(String[] args) {
		// thread 
		hello681 obj1 = new hello681("A",200); //給物件名字A、B，數字為間隔時間
		hello681 obj2 = new hello681("B",100); 
		hello682 obj3 = new hello682("C",150);
		Thread t3 = new Thread(obj3); //需由此處Thread才會有執行緒的生命
		obj1.start(); // 表現生命特徵要呼叫start()方法，進入cpu候選區 //同一個物件只能呼叫一次 
		obj2.start(); //若使用run()方法會先把單一物件執行完畢在接下一個物件，而不是同時執行
		t3.start();
		try {
			obj2.join(); //使用join()，後面的物件要等此方法結束才會接續執行
		} catch (InterruptedException e) {//join() 有可能拋出InterruptedException例外，所以要try-catch
		}
		System.out.println("main"); //其他物件用start()呼叫時，main第一輪被執行 //若前面有使用join()則需等待其作完
	}

}
class hello681 extends Thread{ // 如要表現執行緒生命特徵"必須"繼承thread 
	private String name;
	private int delay;
	hello681 (String name, int delay){this.name = name;
	this.delay = delay;} //分別是物件名稱和處理速度
	@Override
	public void run(){ // run@Override
		for(int i=0;i<10;i++){
			System.out.println(name + ":" + i);
			try {
				Thread.sleep(delay); //告訴他執行後該睡多久 //由於睡覺可能被中斷所以要try-catch
			} catch (InterruptedException e) {
				
			}
			
		}
	}
}
class hello682 implements Runnable{ //第二種方法,可以在認其他類別為副類別(彈性較大、較佳)，例:Runnable
	private String name;
	private int delay;
	hello682 (String name, int delay){this.name = name;
	this.delay = delay;}
	@Override
	public void run(){ 
		for(int i=0;i<10;i++){
			System.out.println(name + ":" + i);
			try {
				Thread.sleep(delay); 
			} catch (InterruptedException e) {
				
				}
			
		}
	}
}