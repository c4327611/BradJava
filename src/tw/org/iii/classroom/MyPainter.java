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

import tw.brad.bradjava.MyPainter.MyAdapter;

public class MyPainter extends JPanel{
		// 簽名板
		//super();
	private LinkedList<LinkedList<HashMap<String, Integer>>> 
	lines, recycle;
	
	public MyPainter() {
	MyAdapter adapter = new MyAdapter();
	addMouseListener(adapter);
	addMouseMotionListener(adapter);
	lines = new LinkedList<>();
	recycle = new LinkedList<>();
	
	}
		@Override
		protected void paintComponent(Graphics g) {
		// Component
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D)g;
		
		g2d.setColor(Color.blue);
		g2d.setStroke(new BasicStroke(4));
		for(LinkedList<HashMap<String, Integer>> line:lines){
		for (int i=1;i<line.size();i++){
			HashMap<String, Integer> p0 = line.get(i-1);
			HashMap<String, Integer> p1 = line.get(i);
			int p0x = p0.get("x"), p0y = p0.get("y");
			int p1x = p1.get("x"), p1y = p1.get("y");
			g2d.drawLine(p0x, p0y, p1x, p1y);
//		g2d.fillOval(0, 0, 30, 30);
//		g2d.drawOval(100,100,30,30); 
//		g2d.drawLine(x1, y1, x2, y2);
		}
		}
		}
		void clear(){
			lines.clear();
			repaint();
		}
		void undo(){
			lines.clear();
			repaint();
		}
		void redo(){
			lines.clear();
			repaint();
		}
		private class MyAdapter extends MouseAdapter{

			@Override
			public void mouseDragged(MouseEvent e) {
				super.mouseDragged(e);
				addpoint(e);
				repaint();
			}

			@Override
			public void mousePressed(MouseEvent e) {
				super.mousePressed(e);
				LinkedList<E>
				
			}
			private void addpoaint(MouseEvent e) {
				HashMap<String, Integer> point = new HashMap<>();
				point.put("x", e.getX());
				point.put("y", e.getY());
				line.
			
			}
			
		}
}
