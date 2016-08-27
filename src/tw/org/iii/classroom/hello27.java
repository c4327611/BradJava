package tw.org.iii.classroom;

public class hello27 {

	public static void main(String[] args) {
		//TWid id1 = new TWid (true, 7); //男,地區7
		TWid id1 = new TWid (true, 5);
		System.out.println(id1.getId());
		
		
		if (TWid.isRight(id1.getId())){
			System.out.println("OK");
			
		}else{
			System.out.println("NG");
		}
	}

}
