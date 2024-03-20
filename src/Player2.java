import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;

public class Player2 extends Player implements KeyListener{
	
	
	static int c=45;
	static int z=385;
	static int a;
	static boolean p=false;
	public synchronized void run() {

		 if(c>=570&&c<720&&z>400&&z<740) 
			 p=true;
		 
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} if(c>=20-CarRace.n&&c<=365+CarRace.n&&z<=385+CarRace.n&&z>=40-CarRace.n) {
		 if(Math.abs((c-365)*(c-365))+Math.abs((z-385)*(z-385))<42025){
			 try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 	c=c-10;
		 	z=z-10;
		 }
	 else if(Math.abs((c-365)*(c-365))+Math.abs((z-385)*(z-385))>119000){
		 try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 		
	 		z=z+10;
	 		c=c+10;
	 }else {
		 if((Math.abs(c-Bot5.x)<10&&(Math.abs(z-Bot5.y)<10))||(Math.abs(c-Bot4.x)<10&&(Math.abs(z-Bot4.y)<10))||(Math.abs(c-Bot3.x)<10&&(Math.abs(y+CarRace.n-Bot3.y)<10))||(Math.abs(c-Bot2.x)<10&&(Math.abs(z-Bot2.y)<10))||(Math.abs(c-Bot1.x)<10&&(Math.abs(z-Bot1.y)<10))||(Math.abs(c-Player1.x)<10&&(Math.abs(z-Player1.y)<10))) {
			 try {
				 Thread.sleep(500);
				
					
					if (Math.abs(c-Bot5.x)<10&&(Math.abs(z-Bot5.y)<10))	{
						Bot5.x+=10;
						Bot5.y+=10;
					}
					else if	(Math.abs(c-Bot4.x)<10&&(Math.abs(z-Bot4.y)<10))	{
						Bot4.x+=10;
						Bot4.y+=10;
					}
					else if	(Math.abs(c-Bot3.x)<10&&(Math.abs(z-Bot3.y)<10))	{
						Bot3.x+=10;
						Bot3.y+=10;
					}
					else if	(Math.abs(c-Bot2.x)<10&&(Math.abs(z-Bot2.y)<10))	{
						Bot2.x+=10;
						Bot2.y+=10;
					}
					else if	(Math.abs(c-Bot1.x)<10&&(Math.abs(z-Bot1.y)<10))	{
						Bot1.x+=10;
						Bot1.y+=10;
					}
					else if	(Math.abs(c-Player1.x)<10&&(Math.abs(z-Player1.y)<10))	{
						Player1.x+=10;
						Player1.y+=10;
					}
					 c=c-10;
						z=z-10;
					
					
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			 }
			 else {
	if(a==83)
		z+=2;
	if(a==87)
		z-=2;
	if(a==68)
		c+=2;
	if(a==65)
		c-=2;
	
			 }	
	 }
}if(c<=720+CarRace.n&&c>=365&&z>40-CarRace.n&&z<385) {
	 if(Math.abs((c-365)*(c-365))+Math.abs((z-385)*(z-385))<42025){
		 try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 		c=c+10;
	 		z=z-10;
	 	
	 }
 else if(Math.abs((c-365)*(c-365))+Math.abs((z-385)*(z-385))>119000){
	 try {
		Thread.sleep(500);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
 		
 		z=z+10;
 		c=c-10;
 }else {
	 if((Math.abs(c-Bot5.x)<10&&(Math.abs(z-Bot5.y)<10))||(Math.abs(c-Bot4.x)<10&&(Math.abs(z-Bot4.y)<10))||(Math.abs(c-Bot3.x)<10&&(Math.abs(y+CarRace.n-Bot3.y)<10))||(Math.abs(c-Bot2.x)<10&&(Math.abs(z-Bot2.y)<10))||(Math.abs(c-Bot1.x)<10&&(Math.abs(z-Bot1.y)<10))||(Math.abs(c-Player1.x)<10&&(Math.abs(z-Player1.y)<10))) {
		 try {
				Thread.sleep(500);
				if (Math.abs(c-Bot5.x)<10&&(Math.abs(z-Bot5.y)<10))	{
					Bot5.x+=10;
					Bot5.y+=10;
				}
				else if	(Math.abs(c-Bot4.x)<10&&(Math.abs(z-Bot4.y)<10))	{
					Bot4.x+=10;
					Bot4.y+=10;
				}
				else if	(Math.abs(c-Bot3.x)<10&&(Math.abs(z-Bot3.y)<10))	{
					Bot3.x+=10;
					Bot3.y+=10;
				}
				else if	(Math.abs(c-Bot2.x)<10&&(Math.abs(z-Bot2.y)<10))	{
					Bot2.x+=10;
					Bot2.y+=10;
				}
				else if	(Math.abs(c-Bot1.x)<10&&(Math.abs(z-Bot1.y)<10))	{
					Bot1.x+=10;
					Bot1.y+=10;
				}
				else if	(Math.abs(c-Player1.x)<10&&(Math.abs(z-Player1.y)<10))	{
					Player1.x+=10;
					Player1.y+=10;
					
				}
				
				c=c-10;
				z=z-10;
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		 }
		 else {
if(a==83)
	z+=2;
if(a==87)
	z-=2;
if(a==68)
	c+=2;
if(a==65)
	c-=2;

		 }	
 }
}if(c>=365&&c<=720+CarRace.n&&z>=385&&z<=730+CarRace.n) {
	 if(Math.abs((c-365)*(c-365))+Math.abs((z-385)*(z-385))<42025){
		 try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 		c=c+10;
	 		z=z+10;
	 	
	 }
 else if(Math.abs((c-365)*(c-365))+Math.abs((z-385)*(z-385))>119000){
	 try {
		Thread.sleep(500);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
 		
 		z=z-10;
 		c=c-10;
 }else {
	 if((Math.abs(c-Bot5.x)<10&&(Math.abs(z-Bot5.y)<10))||(Math.abs(c-Bot4.x)<10&&(Math.abs(z-Bot4.y)<10))||(Math.abs(c-Bot3.x)<10&&(Math.abs(y+CarRace.n-Bot3.y)<10))||(Math.abs(c-Bot2.x)<10&&(Math.abs(z-Bot2.y)<10))||(Math.abs(c-Bot1.x)<10&&(Math.abs(z-Bot1.y)<10))||(Math.abs(c-Player1.x)<10&&(Math.abs(z-Player1.y)<10))) {
		 try {
				Thread.sleep(500);
				if (Math.abs(c-Bot5.x)<10&&(Math.abs(z-Bot5.y)<10))	{
					Bot5.x+=10;
					Bot5.y+=10;
				}
				else if	(Math.abs(c-Bot4.x)<10&&(Math.abs(z-Bot4.y)<10))	{
					Bot4.x+=10;
					Bot4.y+=10;
				}
				else if	(Math.abs(c-Bot3.x)<10&&(Math.abs(z-Bot3.y)<10))	{
					Bot3.x+=10;
					Bot3.y+=10;
				}
				else if	(Math.abs(c-Bot2.x)<10&&(Math.abs(z-Bot2.y)<10))	{
					Bot2.x+=10;
					Bot2.y+=10;
				}
				else if	(Math.abs(c-Bot1.x)<10&&(Math.abs(z-Bot1.y)<10))	{
					Bot1.x+=10;
					Bot1.y+=10;
				}
				else if	(Math.abs(c-Player1.x)<10&&(Math.abs(z-Player1.y)<10))	{
					Player1.x+=10;
					Player1.y+=10;
				}
				c=c-10;
				z=z-10;
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		 }
		 else {
if(a==83)
	z+=2;
if(a==87)
	z-=2;
if(a==68)
	c+=2;
if(a==65)
	c-=2;

		 }	
 }
}if(c>=20-CarRace.n&&c<365&&z>385&&z<730+CarRace.n) {
	 if(Math.abs((c-365)*(c-365))+Math.abs((z-385)*(z-385))<42025){
		 try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 		c=c-10;
	 		z=z+10;
	 	
	 }
 else if(Math.abs((c-365)*(c-365))+Math.abs((z-385)*(z-385))>119000){
	 try {
		Thread.sleep(500);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
 		
 		z=z-10;
 		c=c+10;
 }else {
	 if((Math.abs(c-Bot5.x)<10&&(Math.abs(z-Bot5.y)<10))||(Math.abs(c-Bot4.x)<10&&(Math.abs(z-Bot4.y)<10))||(Math.abs(c-Bot3.x)<10&&(Math.abs(y+CarRace.n-Bot3.y)<10))||(Math.abs(c-Bot2.x)<10&&(Math.abs(z-Bot2.y)<10))||(Math.abs(c-Bot1.x)<10&&(Math.abs(z-Bot1.y)<10))||(Math.abs(c-Player1.x)<10&&(Math.abs(z-Player1.y)<10))) {
		 try {
				Thread.sleep(500);
				if (Math.abs(c-Bot5.x)<10&&(Math.abs(z-Bot5.y)<10))	{
					Bot5.x+=10;
					Bot5.y+=10;
				}
				else if	(Math.abs(c-Bot4.x)<10&&(Math.abs(z-Bot4.y)<10))	{
					Bot4.x+=10;
					Bot4.y+=10;
				}
				else if	(Math.abs(c-Bot3.x)<10&&(Math.abs(z-Bot3.y)<10))	{
					Bot3.x+=10;
					Bot3.y+=10;
				}
				else if	(Math.abs(c-Bot2.x)<10&&(Math.abs(z-Bot2.y)<10))	{
					Bot2.x+=10;
					Bot2.y+=10;
				}
				else if	(Math.abs(c-Bot1.x)<10&&(Math.abs(z-Bot1.y)<10))	{
					Bot1.x+=10;
					Bot1.y+=10;
				}
				else if	(Math.abs(c-Player1.x)<10&&(Math.abs(z-Player1.y)<10))	{
					Player1.x+=10;
					Player1.y+=10;
				}
				c=c-10;
				z=z-10;
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		 }
		 else {
if(a==83)
	z+=2;
if(a==87)
	z-=2;
if(a==68)
	c+=2;
if(a==65)
	c-=2;

		 }	
 }
}
		 a=0;
		run();
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	
	public synchronized void keyPressed(KeyEvent e) {
		 a=e.getKeyCode();		 
	}
	@Override
	public void keyReleased(KeyEvent e) {
		
		
	}





	
	
	
}
