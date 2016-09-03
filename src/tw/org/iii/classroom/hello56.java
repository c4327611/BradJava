package tw.org.iii.classroom;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class hello56 {

	public static void main(String[] args) {
		//解序列化
		try{
		ObjectInputStream oin =
				new ObjectInputStream(
						new FileInputStream("dir1/student.brad"));
		Object obj1 = oin.readObject();
		Student s1 = (Student)obj1;
		Student s2 = (Student)(oin.readObject());
		oin.close();
		System.out.println(s1.name+":"+s1.calTotal());
		System.out.println(s2.name+":"+s2.calTotal());
		}catch(Exception e){
			System.out.println(e.toString());
		}
	}

}
