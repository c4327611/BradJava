package tw.org.iii.classroom;

import java.io.File;
import java.io.IOException;

public class hello44 {

	public static void main(String[] args) {
		//
//		java.io.File f1 = new java.io.File("c:/test");
//		File f2 = new File("c:\\king");
//		
//		if (f2.exists()){ //是否存在
//			System.out.println("f1:OK");
//		}else{
//			System.out.println("f1:XX");
//		}
		 File f1 = new File("dir1/hello01.txt"); // .為所在目錄
		 //System.out.println(f1.getAbsolutePath()); //取得絕對路徑
		 if (f1.isFile()){ //是否為檔案?
			 System.out.println("OK");
		 }else{
			 try {
				if (f1.createNewFile()){ 
					System.out.println("create ok");
				}else{
					System.out.println("create fail");
				}
			} catch (IOException e) { 
				System.out.println(e.toString());  
			}
		 }
		 
		 
	}

}
