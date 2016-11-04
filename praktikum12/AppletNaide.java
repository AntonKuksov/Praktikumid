package praktikum12;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;

public class AppletNaide extends Applet {

		@Override
		public void init() {
			
			setSize(600, 500);
		}
		
		@Override
		public void paint(Graphics g) {
			
			
			g.setColor(Color.red);
			
			Polygon p = new Polygon();
			p.addPoint(0, 0);
			p.addPoint(10, 0);
			p.addPoint(0, 60);
			
			 g.drawPolygon (p);
			 g.fillPolygon (p);
			
		}
	
}
