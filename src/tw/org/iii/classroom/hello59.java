package tw.org.iii.classroom;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class hello59 {

	public static void main(String[] args) {
		//send
		String data = "Hello, World";
		byte[] sendData = data.getBytes();
		try {
			DatagramSocket socket = 
				new DatagramSocket();
			DatagramPacket packet = 
				new DatagramPacket(sendData,sendData.length,
						InetAddress.getByName("10.2.12.126"), 8875); //port<1024
			socket.send(packet);
			System.out.println("Send OK");
			socket.close();
		} catch (SocketException e) {
			
		} catch (UnknownHostException e) {
			
		} catch (IOException e) {
		}
		
	}

}
