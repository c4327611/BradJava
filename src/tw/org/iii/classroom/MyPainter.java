package tw.org.iii.classroom;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.HashMap;
import java.util.LinkedList;

import javax.swing.JPanel;

public class MyPainter extends JPanel {
	private LinkedList<LinkedList<HashMap<String, Integer>>> //設定k為字串,V值為int
		lines, recycle; //多包一層LinkedList即可有多條線

	public MyPainter() {
		MyAdapter adapter = new MyAdapter();
		addMouseListener(adapter);
		addMouseMotionListener(adapter);
		lines = new LinkedList<>();
		recycle = new LinkedList<>();
	}

	@Override
	protected void paintComponent(Graphics g) { //Graphics 畫圖的物件實體
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g; //g 強制轉型成 Graphics2D

		g2d.setColor(Color.BLUE);
		g2d.setStroke(new BasicStroke(4)); //改變線的粗細
		for (LinkedList<HashMap<String,Integer>> line: lines){ //取得每一條線
			for (int i=1; i<line.size(); i++){
				HashMap<String,Integer> p0 = line.get(i-1); //第一個點
				HashMap<String,Integer> p1 = line.get(i); //第二個點
				int p0x = p0.get("x"), p0y = p0.get("y");
				int p1x = p1.get("x"), p1y = p1.get("y");
				g2d.drawLine(p0x, p0y, p1x, p1y);
			}
		}
	}

	void clear(){ //注意! 不可使用private，會使hello66叫不到
		lines.clear();
		repaint(); //把記憶體內的"清除"動作顯示在版面上
	}
	void undo(){
		if (lines.size()>0){
			recycle.add(lines.removeLast());
			repaint();
		}
	}
	void redo(){
		if (recycle.size()>0){
			lines.add(recycle.removeLast());
			repaint();
		}
	}
	private class MyAdapter extends MouseAdapter {
		@Override //手動@Override:右鍵>Source>Implement methods>選擇要@Override的項目
		public void mouseDragged(MouseEvent e) { //第二~N點
			super.mouseDragged(e);
			addPoint(e);
			repaint(); //call paint method 作畫面輸出的動作
		}

		@Override
		public void mousePressed(MouseEvent e) { //第一個點
			super.mousePressed(e);
			LinkedList<HashMap<String,Integer>> line =
				new LinkedList<>(); //新的線(新起點)
			lines.add(line);
			addPoint(e);
		}
		private void addPoint(MouseEvent e){
			HashMap<String, Integer> point = new HashMap<>();
			point.put("x", e.getX());
			point.put("y", e.getY());
			lines.getLast().add(point); //將最後一條線加入lines中，每形成一條線即視為最後一條處理
		}
	}

}
