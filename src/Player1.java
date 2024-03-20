import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;

public class Player1 extends Player implements KeyListener{
	
	
	static int x=25;
	static int y=385;
	static int a;
	static boolean p=false;
	public synchronized void run() {
	
		 if(x>=570&&x<720&&y>400&&y<740) 
			 p=true;
		 
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} if(x>=20-CarRace.n&&x<=365+CarRace.n&&y<=385+CarRace.n&&y>=40-CarRace.n) {
		 if(Math.abs((x-365)*(x-365))+Math.abs((y-385)*(y-385))<42025){
			 try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 	x=x-10;
		 	y=y-10;
		 	
		 }
	 else if(Math.abs((x-365)*(x-365))+Math.abs((y-385)*(y-385))>119000){
		 try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	 		y=y+10;
	 		x=x+10;
	 }else {
		 if((Math.abs(x-Bot5.x)<10&&(Math.abs(y-Bot5.y)<10))||(Math.abs(x-Bot4.x)<10&&(Math.abs(y-Bot4.y)<10))||(Math.abs(x-Bot3.x)<10&&(Math.abs(y+CarRace.n-Bot3.y)<10))||(Math.abs(x-Bot2.x)<10&&(Math.abs(y-Bot2.y)<10))||(Math.abs(x-Bot1.x)<10&&(Math.abs(y-Bot1.y)<10))||(Math.abs(x-Player2.c)<10&&(Math.abs(y-Player2.z)<10))){
			 try {
				
					Thread.sleep(500);
					if (Math.abs(x-Bot5.x)<10&&(Math.abs(y-Bot5.y)<10))	{
						Bot5.x+=10;
						Bot5.y+=10;
					}
					else if	(Math.abs(x-Bot4.x)<10&&(Math.abs(y-Bot4.y)<10))	{
						Bot4.x+=10;
						Bot4.y+=10;
					}
					else if	(Math.abs(x-Bot3.x)<10&&(Math.abs(y-Bot3.y)<10))	{
						Bot3.x+=10;
						Bot3.y+=10;
					}
					else if	(Math.abs(x-Bot2.x)<10&&(Math.abs(y-Bot2.y)<10))	{
						Bot2.x+=10;
						Bot2.y+=10;
					}
					else if	(Math.abs(x-Bot1.x)<10&&(Math.abs(y-Bot1.y)<10))	{
						Bot1.x+=10;
						Bot1.y+=10;
					}
					else if	(Math.abs(x-Player2.c)<10&&(Math.abs(y-Player2.z)<10))	{
						Player2.c+=10;
						Player2.z+=10;
					}
					 x=x-10;
				 		y=y-10;
				
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			 }
			 else {
	if(a==40)
		y+=2;
	if(a==38)
		y-=2;
	if(a==39)
		x+=2;
	if(a==37)
		x-=2;
	
			 }	
	 }
} else if(x<=720+CarRace.n&&x>=365&&y>40-CarRace.n&&y<385) {
	 if(Math.abs((x-365)*(x-365))+Math.abs((y-385)*(y-385))<42025){
		 try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 		x=x+10;
	 		y=y-10;
	 	
	 }
 else if(Math.abs((x-365)*(x-365))+Math.abs((y-385)*(y-385))>119000){
	 try {
		Thread.sleep(500);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
 		
 		y=y+10;
 		x=x-10;
 }else {
	 if((Math.abs(x-Bot5.x)<10&&(Math.abs(y-Bot5.y)<10))||(Math.abs(x-Bot4.x)<10&&(Math.abs(y-Bot4.y)<10))||(Math.abs(x-Bot3.x)<10&&(Math.abs(y+CarRace.n-Bot3.y)<10))||(Math.abs(x-Bot2.x)<10&&(Math.abs(y-Bot2.y)<10))||(Math.abs(x-Bot1.x)<10&&(Math.abs(y-Bot1.y)<10))||(Math.abs(x-Player2.c)<10&&(Math.abs(y-Player2.z)<10))) {
		 try {
				Thread.sleep(500);
				if (Math.abs(x-Bot5.x)<10&&(Math.abs(y-Bot5.y)<10))	{
					Bot5.x+=10;
					Bot5.y+=10;
				}
				else if	(Math.abs(x-Bot4.x)<10&&(Math.abs(y-Bot4.y)<10))	{
					Bot4.x+=10;
					Bot4.y+=10;
				}
				else if	(Math.abs(x-Bot3.x)<10&&(Math.abs(y-Bot3.y)<10))	{
					Bot3.x+=10;
					Bot3.y+=10;
				}
				else if	(Math.abs(x-Bot2.x)<10&&(Math.abs(y-Bot2.y)<10))	{
					Bot2.x+=10;
					Bot2.y+=10;
				}
				else if	(Math.abs(x-Bot1.x)<10&&(Math.abs(y-Bot1.y)<10))	{
					Bot1.x+=10;
					Bot1.y+=10;
				}
				else if	(Math.abs(x-Player2.c)<10&&(Math.abs(y-Player2.z)<10))	{
					Player2.c+=10;
					Player2.z+=10;
				}
				x=x-10;
				y=y-10;
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		 }
		 else {
if(a==40)
	y+=2;
if(a==38)
	y-=2;
if(a==39)
	x+=2;
if(a==37)
	x-=2;

		 }	
 }
}else if(x>=365&&x<=720+CarRace.n&&y>=385&&y<=730+CarRace.n) {
	 if(Math.abs((x-365)*(x-365))+Math.abs((y-385)*(y-385))<42025){
		 try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 		x=x+10;
	 		y=y+10;
	 	
	 }
 else if(Math.abs((x-365)*(x-365))+Math.abs((y-385)*(y-385))>119000){
	 try {
		Thread.sleep(500);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
 		
 		y=y-10;
 		x=x-10;
 }else {
	 if((Math.abs(x-Bot5.x)<10&&(Math.abs(y-Bot5.y)<10))||(Math.abs(x-Bot4.x)<10&&(Math.abs(y-Bot4.y)<10))||(Math.abs(x-Bot3.x)<10&&(Math.abs(y+CarRace.n-Bot3.y)<10))||(Math.abs(x-Bot2.x)<10&&(Math.abs(y-Bot2.y)<10))||(Math.abs(x-Bot1.x)<10&&(Math.abs(y-Bot1.y)<10))||(Math.abs(x-Player2.c)<10&&(Math.abs(y-Player2.z)<10))) {
		 try {
				Thread.sleep(500);
				if (Math.abs(x-Bot5.x)<10&&(Math.abs(y-Bot5.y)<10))	{
					Bot5.x+=10;
					Bot5.y+=10;
				}
				else if	(Math.abs(x-Bot4.x)<10&&(Math.abs(y-Bot4.y)<10))	{
					Bot4.x+=10;
					Bot4.y+=10;
				}
				else if	(Math.abs(x-Bot3.x)<10&&(Math.abs(y-Bot3.y)<10))	{
					Bot3.x+=10;
					Bot3.y+=10;
				}
				else if	(Math.abs(x-Bot2.x)<10&&(Math.abs(y-Bot2.y)<10))	{
					Bot2.x+=10;
					Bot2.y+=10;
				}
				else if	(Math.abs(x-Bot1.x)<10&&(Math.abs(y-Bot1.y)<10))	{
					Bot1.x+=10;
					Bot1.y+=10;
				}
				else if	(Math.abs(x-Player2.c)<10&&(Math.abs(y-Player2.z)<10))	{
					Player2.c+=10;
					Player2.z+=10;
				}
				x=x-10;
				y=y-10;
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		 }
		 else {
if(a==40)
	y+=2;
if(a==38)
	y-=2;
if(a==39)
	x+=2;
if(a==37)
	x-=2;

		 }	
 }
} else if(x>=20-CarRace.n&&x<365&&y>385&&y<730+CarRace.n) {
	 if(Math.abs((x-365)*(x-365))+Math.abs((y-385)*(y-385))<42025){
		 try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 		x=x-10;
	 		y=y+10;
	 	
	 }
 else if(Math.abs((x-365)*(x-365))+Math.abs((y-385)*(y-385))>119000){
	 try {
		Thread.sleep(500);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
 		
 		y=y-10;
 		x=x+10;
 }else {
	 if((Math.abs(x-Bot5.x)<10&&(Math.abs(y-Bot5.y)<10))||(Math.abs(x-Bot4.x)<10&&(Math.abs(y-Bot4.y)<10))||(Math.abs(x-Bot3.x)<10&&(Math.abs(y+CarRace.n-Bot3.y)<10))||(Math.abs(x-Bot2.x)<10&&(Math.abs(y-Bot2.y)<10))||(Math.abs(x-Bot1.x)<10&&(Math.abs(y-Bot1.y)<10))||(Math.abs(x-Player2.c)<10&&(Math.abs(y-Player2.z)<10))) {
		 try {
				Thread.sleep(500);
				if (Math.abs(x-Bot5.x)<10&&(Math.abs(y-Bot5.y)<10))	{
					Bot5.x+=10;
					Bot5.y+=10;
				}
				else if	(Math.abs(x-Bot4.x)<10&&(Math.abs(y-Bot4.y)<10))	{
					Bot4.x+=10;
					Bot4.y+=10;
				}
				else if	(Math.abs(x-Bot3.x)<10&&(Math.abs(y-Bot3.y)<10))	{
					Bot3.x+=10;
					Bot3.y+=10;
				}
				else if	(Math.abs(x-Bot2.x)<10&&(Math.abs(y-Bot2.y)<10))	{
					Bot2.x+=10;
					Bot2.y+=10;
				}
				else if	(Math.abs(x-Bot1.x)<10&&(Math.abs(y-Bot1.y)<10))	{
					Bot1.x+=10;
					Bot1.y+=10;
				}
				else if	(Math.abs(x-Player2.c)<10&&(Math.abs(y-Player2.z)<10))	{
					Player2.c+=10;
					Player2.z+=10;
					
				}
				
				x=x-10;
				y=y-10;
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		 }
		 else {
if(a==40)
	y+=2;
if(a==38)
	y-=2;
if(a==39)
	x+=2;
if(a==37)
	x-=2;

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
