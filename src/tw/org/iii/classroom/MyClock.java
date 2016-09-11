package tw.org.iii.classroom;

import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JLabel;

public class MyClock extends JLabel {
	// 抓現在時間的時鐘
	private Timer timer;
	public MyClock(){
		timer = new Timer();		
	}
	private class MyTask extends TimerTask{
		@Override
		public void run(){
			Calendar now = Calendar.getInstance();
			int hh = now.get(Calendar.HOUR_OF_DAY);
			int mm = now.get(Calendar.MINUTE);
			int ss = now.get(Calendar.SECOND);
			setText(hh+":"+mm+":"+ss);
			
		}
	}

}
