package tw.org.iii.classroom;

public class TWid {
	private String id = "A123456789";
	static String check = "ABCDEFGHJKLMNPQRSTUVXYWZIO";
	
	//建構子(初始化)
	TWid(){
		this((int)(Math.random()*2)==0,(int)(Math.random()*26));
	}
	TWid(boolean gender){ 
		this(gender,(int)(Math.random()*26));
	}
	TWid(int area){ 
		this ((int)(Math.random()*2)==0, area); //Math.random()*2)==0 性別*2==0為true
	}
	TWid(boolean gender,int area){
//		String c0 = check.substring(area, area);
//		String c1 = gender?"1":"2";
//		String c2 = "" + (int)(Math.random()*10); //數字0-9
		
//		id = check.substring(area, area+1);
//		id += gender?"1":"2";
//		for (int i=0;i<7;i++){ 
//			id +=(int)(Math.random()*10);
//		}
//		for (int i=0;i<10;i++){
//			if(isRight(id+i)){
//				id = id+i;
//						break; //此串改用StringBuffer	
//			}
//		}
		StringBuffer temp = 
				new StringBuffer(check.substring(area, area+1));
		temp.append(gender?"1":"2");
		for (int i=0;i<7;i++){
			temp.append((int)(Math.random()*10));
		}
		for (int i=0;i<10;i++){
			if(isRight(to))www
		
		id = temp.append
		}
	} 
	TWid(String id){
		this.id = id; 
	}
	
	//傳回身分證字串
	String getId(){
		return id;
		
	}
	//傳回性別
	boolean getGender(){
		if(id.charAt(1)=='1'){ //字元和字元比較
		return true;
		}else{ return false;
		}
		
	}
	//傳回地區
	String getArea(){
		return "台中市";
		
	}
	//是否正確 驗證 (regex)
	static boolean isRight(String testid){
		boolean ret = false;
		if(testid.matches("^[A-Z][12][0-9]{8}$")){ //要有^開頭,結尾$,[]內取一字元,{}內代表前面[]內出現次數
			//驗證公式
			//String check = "ABCDEFGHJKLMNPQRSTUVXYWZIO";
			int n12 = check.indexOf(testid.charAt(0))+10; 
			//先按照轉換字元排序英文字母,而後+10以符合轉換字元 
			//System.out.println(n12);
			int n1 = n12 / 10;
			int n2 = n12 % 10;
			//將字串轉成數字
			// 例子 B120863158
			int n3 = Integer.parseInt(testid.substring(1, 2));
			int n4 = Integer.parseInt(testid.substring(2, 3));
			int n5 = Integer.parseInt(testid.substring(3, 4));
			int n6 = Integer.parseInt(testid.substring(4, 5));
			int n7 = Integer.parseInt(testid.substring(5, 6));
			int n8 = Integer.parseInt(testid.substring(6, 7));
			int n9 = Integer.parseInt(testid.substring(7, 8));
			int n10 = Integer.parseInt(testid.substring(8, 9));
			int n11 = Integer.parseInt(testid.substring(9, 10));
			int total = n1*1 +n2*9 +n3*8 +n4*7 +n5*6 +n6*5 +n7*4 +n8*3 +n9*2 +n10*1+n11*1; //公式
			
			ret = total%10==0;
		}else{
			ret = false;
		}
		return ret;
		}


//	static boolean preCheck(String testid){
//		if (testid.length()==10 && (testid.charAt(1)=='1' ||testid.charAt(1)=='2')){
//			// 抽出第一碼==>testid.length(0),是否為"A~Z".indexOf();
//			if (testid.charAt(0)=="ABCDEFGHIJKLMNOPQRSTUVWXYZ".indexOf(testid)){
		
//				boolean isOK = false;
//				if(test.matches("")){
//					isOK = true;
//					
//			}
//	
//		return true;
//		
	
}

