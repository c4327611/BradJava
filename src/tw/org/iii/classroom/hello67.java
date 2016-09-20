package tw.org.iii.classroom;

import java.util.HashMap;

public class hello67 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, String> map = new HashMap<>();
		map.put("username", "Jeff"); //
		map.put("Stage", "3");
		map.put("gender", "male");
		System.out.println(map.get("username")); //呼叫key(k)撈出 值(v)
	}

}
