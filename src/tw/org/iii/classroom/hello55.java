package tw.org.iii.classroom;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class hello55 {

	public static void main(String[] args) {
		//序列化
		Student s1 = new Student(new PM(),"David",90,50,75);
		Student s2 = new Student(new PM(),"Tony",80,70,45);
		
		try{
		ObjectOutputStream oout = 
				new ObjectOutputStream(
						new FileOutputStream("dir1/student.brad"));
		oout.writeObject(s1);
		oout.writeObject(s2);
		oout.flush();
		oout.close();
		
		}catch(IOException e){
			System.out.println(e.toString());
		}

	}

}
class Student implements Serializable { //宣告"可序列化"
	int ch;
	transient int eng; //transient 該屬性不被序列化 (0,null)
	int math;
	String name;
	PM pm;
	Student(PM pm,String name,int ch, int eng, int math){
		this.ch =ch; this.eng =eng; this.math =math;
		this.name=name;
		this.pm=pm;
	}
	int calTotal(){return ch+eng+math;} //總分
	double calAvg(){return calTotal()/3.0;} //平均
}
class PM implements Serializable {
	
}