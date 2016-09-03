package tw.org.iii.classroom;

import java.io.DataInputStream;
import java.io.FileInputStream;

public class hello54 {

	public static void main(String[] args) {
		// in
		try{
			DataInputStream din =
					new DataInputStream(
							new FileInputStream("dir1/data.dat"));
			int data = din.readInt();
			boolean data2 = din.readBoolean();
			double data3 = din.readDouble();
			
			din.close();
			System.out.println(data);
			System.out.println(data2);
			System.out.println(data3);
		}catch(Exception e){
			
		}
	}

}
