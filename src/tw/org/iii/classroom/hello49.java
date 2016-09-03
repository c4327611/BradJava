package tw.org.iii.classroom;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;

public class hello49 {

	public static void main(String[] args) {
		// 開 flush close 即產生檔案
		File f1 = new File ("dir1/hello03.txt");
		try{
		FileOutputStream fout =
		new FileOutputStream(f1, true); //FileOutputStream(file, append);
		fout.write("哈囉,Jeff \r\n".getBytes()); //換列\r\n
		
		fout.flush(); //在網路上一定要沖出
		fout.close();
		System.out.println("OK");
		}catch (Exception e){
		System.out.println(e.toString());	
}
}
}