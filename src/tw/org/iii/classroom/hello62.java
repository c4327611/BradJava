package tw.org.iii.classroom;

import java.util.Iterator;
import java.util.TreeSet;

public class hello62 {

	public static void main(String[] args) {
		//Collection/set 沒有順序性.相同物件不會重覆
		TreeSet set =new TreeSet(); //TreeSet特性:排序 /但如果是不同東西則無法排序
		while(set.size()<6){ //利用不重複原則 做出樂透號碼
			set.add((int)Math.random()*49+1);
			
		}

//		set.add(12); //只能丟物件,不能丟基本型別 
//		set.add("Brad");
//		set.add(12.3);
//		set.add(false);
//		set.add(new Bike());
		System.out.println(set);
		System.out.println("-----");
		Iterator it = set.iterator();
		while (it.hasNext()){
			Object obj = it.next();
			System.out.println((Integer)obj);
			
		}
		System.out.println("-----");
		for (Object obj:set){
			System.out.println((int)obj);
		}

	}

}
