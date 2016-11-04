package praktikum12;


import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

/**
 * Ringjoone valemi jĆ¤rgi ringi joonistamise nĆ¤ide
 * @author Mikk Mangus
 */
@SuppressWarnings("serial")
public class Spiraali extends Applet {

    private Graphics g;
    
    public void paint(Graphics g) {
        this.g = g;
        joonistaTaust();
        joonistaRing();
    }
    
    /**
     * Katab tausta valgega
     */
    public void joonistaTaust() {
        int w = getWidth();
        int h = getHeight();
        g.setColor(Color.white);
        g.fillRect(0, 0, w, h);
    }
    
    /**
     * Joonistab ringi
     */
    public void joonistaRing() {
        g.setColor(Color.black);
        int keskkohtX = getWidth() / 2;
        int keskkohtY = getHeight() / 2;
        int lastX = -1;
        int lastY = -1;
        
        for (double nurk = 0; nurk <= Math.PI * 20; nurk = nurk + 1.55) {

        	double raadius = 10 + nurk *3;
        	int x = (int) (raadius * Math.cos(nurk)) + keskkohtX;
            int y = (int) (raadius * Math.sin(nurk)) + keskkohtY;
            
            if (0 != lastX)
            {g.drawLine(x, y, lastX, lastY);}
            
            lastX = x;
            lastY = y;
            
          //  g.fillRect(keskkohtX + x, keskkohtY + y, 2, 2);
        }
    }
}
