package tw.org.iii.classroom;

public class hello68 {

	public static void main(String[] args) {
		// thread
		hello681 obj1 = new hello681("A");
		hello681 obj2 = new hello681("B");
		obj1.start(); // 
		obj2.start();
		try {
			obj2.join();
		} catch (InterruptedException e) {
		}
		System.out.println("main");
	}

}
class hello681 extends Thread{
	private String name;
	private int delay;
	hello681 (String name){this.name = name;
	this.delay = delay;}
	@Override
	public void run(){
		for(int i=0;i<10;i++){
			System.out.println(name + ":" + i);
			try {
				Thread.sleep(delay);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}
}