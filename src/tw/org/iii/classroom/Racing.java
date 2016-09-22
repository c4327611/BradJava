package tw.org.iii.classroom;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Racing extends JFrame{
	//賽車
	private JButton go;
	private JLabel[] lanes;
	private Car[] cars;
	private int rank;
	
	public Racing() {
		setLayout(new GridLayout(9, 1)); //
		
		add(go = new JButton("Go!"));
		lanes = new JLabel[8]; //陣列表示跑道 有8個
		for (int i=0; i<lanes.length; i++){
			add(lanes[i] = new JLabel((i+1) + ". ")); //add跑道編號
		}
		
		setSize(1024, 480); //跑道寬度
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		go.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				doGo();
			}
		});
	}
	private void doGo(){
		rank=1; //排名:1
		Car[] cars = new Car[8]; //宣告車子*8
		for (int i=0; i<lanes.length; i++){ //每輪開始時清除跑道
			lanes[i].setText((i+1) + ". ");
		}
		
		for (int i=0;i<cars.length;i++){
			cars[i] = new Car(i); //決定car在各自的跑道
		}
		for (int i=0;i<cars.length;i++){
			cars[i].start();
		}
	}
	private class Car extends Thread{
		private int whichland; 
		Car(int n){whichland = n;} //決定跑道
		@Override
		public void run(){
			for (int i=0;i<100;i++){ //百米賽跑
				lanes[whichland].setText(lanes[whichland].getText() + ">"); //前進
				if(i==99){ //最後一步
//					lanes[whichland].setText(lanes[whichland].getText()+ rank++); //依序排名
					lanes[whichland].setText(lanes[whichland].getText()+ "WINNER");
					stopGame(); //有"WINNER"時停止遊戲
					break; //脫離迴圈
				}
				try {
					Thread.sleep(50+(int)(Math.random()*200)); //控制前進頻率 (差異50~249)
				} catch (InterruptedException e) {
					break;
				}
			}
		}
	}
	private void stopGame(){ //對每個執行緒發出interrupt就break(60或65)結束迴圈
		for (int i=0; i<cars.length; i++){
			cars[i].interrupt(); //通通呼叫interrupt()來中斷
			
		}
	}
	
	public static void main(String[] args) {
		new Racing();
	}

}
