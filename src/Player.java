import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;

public class Player extends Thread implements KeyListener{
	
	static int x=25;
	static int y=385;
	static int c=45;
	static int z=385;
	static int a;

	public synchronized void run() {
		System.out.println("*");		
	/*if(Map.a==40)
		y+=2;
	if(Map.a==38)
		y-=2;
	if(Map.a==39)
		x+=2;
	if(Map.a==37)
		x-=2;
		
	
	if(Map.a==83)
		z+=2;
	if(Map.a==87)
		z-=2;
	if(Map.a==68)
		c+=2;
	if(Map.a==65)
		c-=2;
		
	*/	
			
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		run();
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		int a=e.getKeyCode();
		 System.out.println("qq");
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}





	
	
	
}
