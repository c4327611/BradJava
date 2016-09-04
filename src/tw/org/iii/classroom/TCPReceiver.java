package tw.org.iii.classroom;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;



public class TCPReceiver {

	public static void main(String[] args) {
		try{ 
		ServerSocket server = new ServerSocket(6666);
		System.out.println("Before");
		Socket socket = server.accept();
		
		BufferedInputStream bin = 
				new BufferedInputStream(socket.getInputStream());
		
		BufferedOutputStream bout = 
				new BufferedOutputStream(
						new FileOutputStream("dir1/upload/Brad.jpg"));
		
		int b;
		while((b = bin.read()) != -1){
			bout.write(b); //
		}
		bout.flush();
		bout.close();
		
		bin.close();
		
		server.close();
		System.out.println("OK");
		}catch(IOException e){
			System.out.println("Server:"+ e.toString());
		}
	}

}
