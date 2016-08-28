package tw.org.iii.classroom;

import java.awt.datatransfer.MimeTypeParseException;

import javax.xml.crypto.dsig.TransformException;

public class hello42 {

	public static void main(String[] args) {
		// try catch
		Bird b1 = new Bird();
		try{
			b1.setleg(3);
			System.out.println(b1.leg);
		}catch(RuntimeException re){
			System.out.println("ccccc");
		}
		hello421 obj1 = new hello421();
		try{
		obj1.m1(2);
	}catch(MimeTypeParseException ie){
		
	}catch(TransformException de){
	}
		hello422 
		
}
class Bird {
	int leg;
	void setleg(int n){
		if (n<0||n>2){ //設定條件,挑出例外
			throw new RuntimeException(); 

		}
	    leg = n;
	}
}

// checked exception
class hello421 {
	void m1(int n) throws MimeTypeParseException,
	TransformException {
		if (n<0){
			throw new MimeTypeParseException();
	    }else if (n>100){
		    throw new TransformException();
	}
}
}
class hello422 extends hello421 {
	void m1(int n) {
		int a = 10, b = 0;
		try{
			int c = a / b;
			return;
		}catch (RuntimeException re){
			System.out.println("catch");
		}finally {
			System.out.println("finally");
		}
		System.out.println("ok");
	}
}
}
