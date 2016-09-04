package tw.org.iii.classroom;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.net.InetAddress;
import java.net.Socket;

public class TCPClient {

	public static void main(String[] args) {
		// 1. read from local file system
		long start = System.currentTimeMillis(); //傳送所需時間
		try{
			File sendFile = new File("dir1/dog.jpg");
			byte[] sendBuf = new byte[(int)sendFile.length()];
			
			BufferedInputStream bin = 
				new BufferedInputStream(
						new FileInputStream("dir1/dog.jpg"));
			bin.read(sendBuf);
			bin.close();
			
			//2. send by TCP
			Socket client = 
					new Socket(InetAddress.getByName("10.2.12.126"),6666);
			BufferedOutputStream bout = 
					new BufferedOutputStream(client.getOutputStream());
			bout.write(sendBuf);
			bout.flush();
			bout.close();
			client.close();
			System.out.println("OK");
			System.out.println(System.currentTimeMillis() - start); //顯示傳送所需時間
		}catch(Exception e){
			System.out.println(e.toString());
		}
		
//		------
//		try{
//		Socket socket =
//				new Socket(InetAddress.getByName("10.2.12.126"),7777);
//		OutputStream out = socket.getOutputStream();
//		out.write("Hello, 陳俊瑋".getBytes());
//		out.flush();
//		out.close();
//		
//				socket.close();
//				}catch(IOException e){
//					
//				}
	
		}

}
