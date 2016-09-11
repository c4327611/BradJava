package tw.org.iii.classroom;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Racing extends JFrame{
	private JButton go;
	private JLabel[] lanes;
	private int cars[];
	private int rank;
	
	public Racing(){
		setLayout(new GridLayout(9, 1));
		
		add(go = new JButton("GO"));
		lanes = new JLabel[8]; 
		for(int i=0;i<lanes.length;i++){
			add(lanes[i] = new JLabel((i+1) + ". "));
		}
		
		
		setSize(1024,500);
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
		rank=1;
		Car[] cars = new Car[8]; //宣告車子
		
		for (int i=0;i<cars.length;i++){
			cars[i] = new Car(i); 
		}
		for (int i=0;i<cars.length;i++){
			cars[i].start();
		}
	}
	private class Car extends Thread{
		private int whichland;
		Car(int n){whichland = n;}
		@Override
		public void run(){
			for (int i=0;i<100;i++){
				lanes[whichland].setText(lanes[whichland].getText() + ">");
				if(i==99){
//					lanes[whichland].setText(lanes[whichland].getText()+ rank++);
					lanes[whichland].setText(lanes[whichland].getText()+ "WINNER");
					stopGame();
					break;
				}
				try {
					Thread.sleep(50+(int)(Math.random()*200));
				} catch (InterruptedException e) {
					break;
				}
			}
		}
	}
	private void stopGame(){
		for (int i=0;i<cars.length;i++){
			cars[i].inter
		}
	}
	
	public static void main(String[] args) {
		new Racing();
	}

}
