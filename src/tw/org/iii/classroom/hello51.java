package tw.org.iii.classroom;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import jdk.jfr.events.FileWriteEvent;

public class hello51 extends JFrame {  
	private JButton open, save, exit; //設定具體存在的這三個按鈕
	private JTextArea edit;
	private File openFile;
	
	public hello51(){
		super("My Window App");
		
		open = new JButton("Open"); //建立物件實體
		save = new JButton("Save");
		exit = new JButton("Exit");
		edit = new JTextArea();
		
		JScrollPane jsp =new JScrollPane(edit); //把edit塞入jsp,設定UI使其右側有滾動條
		
		//setLayout(new FlowLayout()); //JFrame/setLayout/LayoutManager/FlowLayout()
		setLayout(new BorderLayout()); //java.awt/
		
		JPanel top = new JPanel(new FlowLayout(FlowLayout.LEFT));
		
		top.add(open);top.add(save);top.add(exit);
		
		add(top,BorderLayout.NORTH);
		add(jsp, BorderLayout.CENTER); //中間
		
		open.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				doOpen();
				}
		});
		save.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				doSave();
			}
		});
		
		setSize(640, 480); //設定大小
		setVisible(true); //顯示
		setDefaultCloseOperation(EXIT_ON_CLOSE); //結束視窗.定義在JFram
	}
	private void doOpen(){
		// 建立檔案選擇器
		JFileChooser jfc = new JFileChooser();
		if (jfc.showOpenDialog(this) ==
				JFileChooser.APPROVE_OPTION) { //CANCEL_OPTION 取消
			//APPROVE_OPTION 選擇(傳回int) //ERROR_OPTION 有錯誤發生
			
			openFile = jfc.getSelectedFile(); //取得上面所選擇的檔案
			//System.out.println(openFile.getAbsolutePath()); //輸出取得路徑
			readFlie();
		}
	
				
	}
	private void readFlie(){
		try{
		FileReader reader = new FileReader(openFile);
		int c;
		while ((c = reader.read()) != -1){
			edit.append(""+(char)c); //append要字串,用""字串相加即可
		}
		
		reader.close();
	}catch (Exception e){
	}
	}
	private void doSave(){
		if (openFile != null){ //確認有抓到檔案
			try{
			FileWriter writer =
					new FileWriter(openFile);
			writer.write(edit.getText());  //抓edit上面編寫的東西
			writer.flush();
			writer.close();
			
		}catch(IOException e){
		}
		}
			
		
	}
		public static void main(String[] args) {
			new hello51();
		}
	}
