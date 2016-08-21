package tw.org.iii.classroom;

public class hello24 {

	public static void main(String[] args) { // Bike.java
		Bike myBike, urBike;
		myBike = new Bike(); // 初始化 給值
		urBike = new Bike(); // 初始化 給值
		System.out.println("myBike:" + myBike.getSpeed());
		System.out.println("urBike:" + urBike.getSpeed());

		System.out.println("-----");
		myBike.upspeed();
		myBike.upspeed();
		myBike.upspeed();

		urBike.upspeed();
		urBike.upspeed();
		urBike.upspeed();
		System.out.println("myBike" + myBike.getSpeed());
		System.out.println("urBike" + urBike.getSpeed());
		System.out.println("=====");
		for (int i = 0; i < 14; i++) 
			myBike.upspeed();
		System.out.println("myBike" + myBike.getSpeed());

		}

	}


