package tw.org.iii.classroom;

import java.util.Arrays;

public class poker {

	public static void main(String[] args) {
		long begin = System.currentTimeMillis();
		// 洗牌
		int[] poker = new int[52]; 
		for (int i=0; i<poker.length; i++){
			int rand; //取出作宣告 不然會只活在DO{}內
			boolean isOK; //取出作宣告 不然會只活在DO{}內
			do {
		rand = (int)(Math.random()*poker.length);
		// 檢查機制
		isOK = true; 
		for (int j=0; j<i; j++){
			if (poker[j]==rand){
				isOK = false;
				break;
			}
		}
		} while(!isOK);
		
		poker[i] = rand;
		System.out.println(poker[i]); // 顯示不重複牌
		}
//		System.out.println(
//				System.currentTimeMillis()-begin); //過程所需時間 (單位:千分之一秒)
		
		System.out.println("-----");
		// 發牌 =>給四個玩家
		int[][] player = new int[4][13]; //4人,每人13張牌
		for (int i=0; i<poker.length; i++){
			player[i%4][i/4] = poker[i];
		
		}
		System.out.println("+++++");
		// 理牌=>攤牌
		String[] suit = {"黑桃","紅心","方塊","梅花"}; 
		String[] value = {"A","2","3","4","5","6","7","8","9","10","J","Q","k"};
		for (int[] cards:player){
			Arrays.sort(cards);
			for (int card:cards){
				
			System.out.print(suit[card/13] + value[card%13] + "\t");
		}
			System.out.println();
		}
		}
		

	}

