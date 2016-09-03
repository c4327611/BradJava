package tw.org.iii.classroom;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class hello53 {

	public static void main(String[] args) {
		//out 
		int a =123;
		boolean b =true;
		double c =12.3;
		try{
		DataOutputStream dout =
				new DataOutputStream(
						new FileOutputStream("dir1/data.dat"));
		dout.writeInt(a);
		dout.writeBoolean(b);
		dout.writeDouble(c);
		dout.flush();
		dout.close();
	}catch(Exception e){
		
	}
	}
}
