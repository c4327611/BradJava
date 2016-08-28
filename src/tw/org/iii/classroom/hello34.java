package tw.org.iii.classroom;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class hello34 extends JFrame implements ActionListener {  
	private JButton open, save, exit; //設定具體存在的這三個按鈕
	private JTextArea edit;
	private int count;
	
	public hello34(){
		super("My Window App");
		
		open = new JButton("Open"); //建立物件實體
		save = new JButton("Save");
		exit = new JButton("Exit");
		edit = new JTextArea();
		
		//setLayout(new FlowLayout()); //JFrame/setLayout/LayoutManager/FlowLayout()
		setLayout(new BorderLayout()); //java.awt/
		
		JPanel top = new JPanel(new FlowLayout(FlowLayout.LEFT));
		
		top.add(open);top.add(save);top.add(exit);
		
		add(top,BorderLayout.NORTH);
		add(edit, BorderLayout.CENTER); //中間
		
		setSize(640, 480); //設定大小
		setVisible(true); //顯示
		setDefaultCloseOperation(EXIT_ON_CLOSE); //結束視窗.定義在JFram
		
		open.addActionListener(this); 
		save.addActionListener(this);
		open.addActionListener(new MyListener()); // 外部.可提供其他使用
		open.addActionListener(new tw.org.iii.classroom.MyListener()); 
		open.addActionListener(new ActionListener() { 
			
			@Override
			public void actionPerformed(ActionEvent e) {
				doOpen();
				
			}
		}); // 內部.自行設計在new出來
		
	}
	private void doOpen(){
		System.out.println("InnerListener");
	}
	

	public static void main(String[] args) {
	
	
		new hello34();
		}
		
		class MyListener implements ActionListener {
			@Override
			public void actionPerformed(ActionEvent e){
				System.out.println("MyListener2" + count++);
			}
		}

	

	@Override
	public void actionPerformed(ActionEvent event) {
		if (event.getSource().equals(open)){
		System.out.println("open");
		}else if (save.equals(event.getSource())){
			System.out.println("save");
		
		}
	}

}

class MyListener implements ActionListener {
	@Override
	public void actionPerformed(ActionEvent e){
		System.out.println("MyListener1");
	}
}