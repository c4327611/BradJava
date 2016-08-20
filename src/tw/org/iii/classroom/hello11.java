package tw.org.iii.classroom;

import javax.swing.JOptionPane;

public class hello11 {

	public static void main(String[] args) {
		// 萬年曆
		
		String strYear = 
				JOptionPane.showInputDialog("year");
		String strMonth = 
				JOptionPane.showInputDialog("month");
		int intYear = Integer.parseInt(strYear);
		int intMonth = Integer.parseInt(strMonth);
		System.out.println(intYear + "/" + intMonth);

	}

}
