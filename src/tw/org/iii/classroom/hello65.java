package tw.org.iii.classroom;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;

import javafx.print.Collation;

public class hello65 {

	public static void main(String[] args) {
		//HashSet<String> set = new HashSet<>();
		String answer = CreatAnswerV2(4);
		System.out.println(answer);
	}
	static String CreateAnswer(int n){
		HashSet<Integer> set = new HashSet<>();
		while(set.size()<n){
			set.add((int)Math.random()*10);
		}
		StringBuffer sb = new StringBuffer(n);
		for (Integer i:set) sb.append(i);
		return sb.toString();
	}
	// shuffle(list) 洗list
	static String CreatAnswerV2 (int n){
		LinkedList<Integer> list = new LinkedList<>();
		for(int i=0;i<10; i++) list.add(i);
		Collections.shuffle(list);
		StringBuffer sb = new StringBuffer(n);
		for(int i=0;i<n;i++) sb.append(list.get(i));
		return sb.toString();
				
				
}
}