package tw.org.iii.classroom;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class hello61 {

	public static void main(String[] args) {
		//Http
		try{ //http://pdfmyurl.com/ 輔助網站轉pdf
		URL url = new URL("http://pdfmyurl.com/?url=http://www.opttools.com/"); //定位
		HttpURLConnection conn = 
				(HttpURLConnection)url.openConnection(); //開啟URL連線.轉http
		conn.connect();
		
//		BufferedReader reader =  //串接
//				new BufferedReader(
//						new InputStreamReader(
//								conn.getInputStream()));
//		String line;
//		while ((line=reader.readLine())!=null){
//			System.out.println(line);
//		}
//		reader.close();
		
		InputStream in = conn.getInputStream(); //抓圖用InputStream,文字用reader
		FileOutputStream fout = 
				new FileOutputStream("dir1/upload/brad3.pdf");
		int b;
		while((b = in.read())!=-1){
			fout.write(b);
			
		}
		fout.flush();
		fout.close();
		in.close();
		System.out.println("OK");
		}catch (IOException e) {
			System.out.println(e.toString()); //判斷問題
		}

	}

}
