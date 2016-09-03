package tw.org.iii.classroom;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class hello47 {
	//File read 
	public static void main(String[] args) {
		File f1 = new File("dir1/hello01.txt");
		long len = f1.length(); //看檔案多大
		try{
		FileInputStream fin = new FileInputStream(f1);
		
		int c; byte[] temp = new byte[(int)len]; //最大到int(檔案<2G)
		fin.read(temp);
		System.out.println(new String(temp));
//		while ((c=fin.read(temp)) != -1){ //若等於-1就結束 //(c=fin.read())先把讀的指定給c
//			System.out.print(new String(temp,0,c));
//		}
		
		
		
		fin.close();
		//System.out.println("OK");
	}catch (FileNotFoundException fe){
		System.out.println(fe.toString());
	}catch(IOException fe){
		System.out.println(fe.toString());
	}
		
	}
}
