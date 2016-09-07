package tw.org.iii.classroom;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class hello57 {

	public static void main(String[] args) {
		//猛虎出閘第一題
		/*物件序列化簡單來說就是將物件變成資料流，可以將物件儲存成檔案，可以永久儲存在硬碟中，而且可以在2台電腦之間傳遞物件能。
		物件解序列化就是將檔案還原成物件，並拿來使用。*/
		
		try{//序列化
		hello573 obj =new hello573();
		ObjectOutputStream oout =
				new ObjectOutputStream(
						new FileOutputStream("dir1/hello57")); //無副檔名為普通檔
		oout.writeObject(obj);
		oout.flush();
		oout.close();
		System.out.println("OK");
		}catch(Exception e){
			
		}
		System.out.println("-----");
		try{// 解序列化
		ObjectInputStream oin = 
				new ObjectInputStream(
						new FileInputStream("dir1/hello57"));
		hello573 obj2 = (hello573)(oin.readObject());
		oin.close();
		System.out.println("OK2");
		}catch (Exception e){
			
		}
	}
}
class hello571 {
	hello571(){System.out.println("hello571");}
}
class hello572 extends hello571 {
	hello572(){System.out.println("hello572");}
}
class hello573 extends hello572 implements Serializable { //在哪一代序列化,解序列化 則該代以前才產生物件實體
	hello573(){System.out.println("hello573");}
}
