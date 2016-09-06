package tw.org.iii.classroom;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class hello52 {

	public static void main(String[] args) {
		//io //把excel檔存.csv格式
		try{
		FileInputStream fin = 
				new FileInputStream("dir1/staff.csv");
		InputStreamReader irs = new InputStreamReader(fin);
		BufferedReader br = new BufferedReader(irs);
		
		String line = br.readLine();  //傳回一個字串
		String[] row = line.split(","); //切割
		//System.out.println(row.length);
		for (String data:row){
			//System.out.println(data);
			while ((data = br.readLine())!=null){
				System.out.println(data);
			}
		}
//		String line;
//		while ((line = br.readLine())!= null){
//			System.out.print(line);
//		}
		
		fin.close(); //找任一個"關"都可以
		}catch(Exception e){
			
		}
	}

}
