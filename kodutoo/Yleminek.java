package kodutoo;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyAdapter;

public class Yleminek extends Applet{
	
	
	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		int h = getHeight();
		int w = getWidth();
		
		
		for (int y = 0; y < h; y++) {
			
			double concentrate = (double) y/ h;
			concentrate = 1 - concentrate;
			int a = (int) (concentrate * 255);
			
			Color color = new Color(a, 255, 150);
			g.setColor(color);
			g.drawLine(0, y, w, y);
			
			
		}
	}
	


}
