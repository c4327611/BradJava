package tw.org.iii.classroom;

import java.util.LinkedList;

public class hello63 {

	public static void main(String[] args) {
		// list
		
		LinkedList list =new LinkedList();
		list.add(12);
		list.add("brad");
		list.add("brad");
		list.add(12);
		list.add(2,"iii"); //插隊至第2
		//list.add(7,34); //XX 不能排於最大總數之後
		System.out.println(list.size());
		System.out.println(list);
		System.out.println(list.get(4)); //抓出第四個
		list.remove(4); //移除第4個
		System.out.println(list);

	}

}
