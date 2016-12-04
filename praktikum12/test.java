package praktikum12;
import java.applet.Applet;
import java.awt.event.KeyEvent;

public class test extends Applet implements Runnable {

public static final long serialVersionUID = 1L;

public void start() {
    setSize(500, 500);
    
 
}

public void run() {
	 
}   

public void keyPressed(KeyEvent e) {
    if(e.getKeyCode() == KeyEvent.VK_ENTER) {
        System.out.println("You are pressing ENTER!");
    }
}

public void keyReleased(KeyEvent e) {
    if(e.getKeyCode() == KeyEvent.VK_ENTER) {
        System.out.println("You are releasing ENTER!");
    }
}

public void keyTyped(KeyEvent e) {

}
}