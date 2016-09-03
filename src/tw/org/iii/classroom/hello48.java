package tw.org.iii.classroom;

import java.io.File;
import java.io.FileReader;

public class hello48 {

	public static void main(String[] args) {
		//專讀文字字元 
		File f1 = new File ("dir1/hello01.txt");
		try{
			FileReader reader = 
					new FileReader(f1);
			int c;
			while ((c=reader.read()) !=-1){
				System.out.print((char)c);
				
			}
			reader.close();
			
		}catch (Exception e){
	}

}
}
