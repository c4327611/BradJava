package tw.org.iii.classroom;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class hello58 {

	public static void main(String[] args) {
		try{
			InetAddress[] ips = InetAddress.getAllByName("lms.taichung.iii.org.tw"); //""給主機名稱或ip位址
			for(InetAddress ip : ips){ //該網站所有ip
			System.out.println(ip.getHostAddress()); //如果輸入ip只會檢查合理性(0-255)
			}
		}catch (UnknownHostException ue){
			System.out.println("XX");
		}
	
	}

}
