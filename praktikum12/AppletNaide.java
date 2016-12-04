package praktikum12;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class AppletNaide extends Applet {
	
	
	private boolean leftPressed = false;
	private boolean rightPressed = false; 
	private static int posx = 100;
	

	
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
			 
			 while (true) {
					addKeyListener(new KeyInputHandler());
					
					if (leftPressed == true) {
						posx--;
					}
					if (rightPressed == true) {
						posx++;
					}
				}
		//	 g.drawRect(10,10,50,100);
		//	 g.fillRect(posx,100,50,100);
			 
			 
			
		}
		
		private class KeyInputHandler extends KeyAdapter {
			
			public void keyPressed(KeyEvent e) { //клавиша нажата
				if (e.getKeyCode() == KeyEvent.VK_LEFT) {
					leftPressed = true;
				}
				if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
					rightPressed = true;
				}	
			} 	
			public void keyReleased(KeyEvent e) { //клавиша отпущена
				if (e.getKeyCode() == KeyEvent.VK_LEFT) {
					leftPressed = false;
				}
				if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
					rightPressed = false;
				}
			}
			
		}
	
	
}
