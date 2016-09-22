package tw.org.iii.classroom;

import java.util.Timer;
import java.util.TimerTask;

public class hello69 {

	public static void main(String[] args) {
		// Timer 一個Timer就可以處理多個任務
		Timer timer = new Timer();
		timer.schedule(new MyTask1(), 3000); //3000間隔時間3秒
		timer.schedule(new MyTask2(timer), 1000,1000); //每次間隔時間1秒

	}

}
class MyTask1 extends TimerTask{ //因MyTask1是抽象類別所以要@Override
	@Override
	public void run(){
		System.out.println("MyTask1");
		
	}
}
class MyTask2 extends TimerTask{
	private int i;
	private Timer timer;
	MyTask2(Timer timer){this.timer=timer;}
	@Override
	public void run(){
		System.out.println("MyTask2:"+ i++);
		if(i>10){
			timer.cancel();
		}
	}
}