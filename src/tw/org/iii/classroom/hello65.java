package tw.org.iii.classroom;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;

import javafx.print.Collation;

public class hello65 {

	public static void main(String[] args) {
		//產生4位數(不重複數字)
		//HashSet<String> set = new HashSet<>();  //只能丟字串
		String answer = createAnswerV2(4);
		System.out.println(answer);
	}
	static String createAnswer(int n){
		HashSet<Integer> set = new HashSet<>();
		while (set.size()<n){
			set.add((int)(Math.random()*10));
		}
		StringBuffer sb = new StringBuffer(n);
		for (Integer i : set) sb.append(i);
		return sb.toString();
	}
	
	static String createAnswerV2 (int n){
		LinkedList<Integer> list = new LinkedList<>();
		for(int i=0;i<10; i++) list.add(i);
		// shuffle(list) 洗list
		Collections.shuffle(list);
		StringBuffer sb = new StringBuffer(n);
		for(int i=0;i<n;i++) sb.append(list.get(i));
		return sb.toString();
		
		}
	}
