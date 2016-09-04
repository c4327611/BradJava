package tw.org.iii.classroom;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class hello60 {

	public static void main(String[] args) {
		// 接收
		byte[] buf = new byte[1024];
		try{
		DatagramSocket socket = 
				new DatagramSocket(8888);
		DatagramPacket packet = 
				new DatagramPacket(buf, buf.length);
		System.out.println("Before");
		socket.receive(packet);
		System.out.println("After");
		socket.close();
		InetAddress urip = packet.getAddress(); //挖出對方的IP
		byte[] data = packet.getData(); //收到多大的封包
		int len =packet.getLength(); //取出對方封包長度
		
		System.out.println("Send OK" + urip.getHostAddress() + ":" + 
		new String(data,0,len));

	}catch (Exception e) {
		System.out.println(e.toString());
	}
	}

}
