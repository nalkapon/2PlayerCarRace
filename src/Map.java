import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.Timer;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.event.*;



public class Map extends JFrame implements Runnable{
	int count = 0;
    int count2 =0;
    int count3 =0;
    
    JLabel label = new JLabel();
 int i=0;

	Player1 p1=new Player1();
	Player2 p2=new Player2();
	 public  void run() {
		 
		 n();
		 repaint();
	
		 try {
			
				Thread.sleep(500*1/CarRace.n);
				addKeyListener(p1);
				addKeyListener(p2);
				Thread.sleep(500*1/CarRace.n);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
			run();
	}
	 
 
	public void n() {
		Timer timer = new Timer(31, new ActionListener() {
	        
	        
	        public void actionPerformed(ActionEvent e) {
	        	count+=4;
	      	if(count==100) {
	        		count2++;
	        		count=0;
	        	}
	        	if(count2==60) {
	        		count3++;
	        		count2=0;
	        	}
	        	
	        	
	            label.setText(String.valueOf(count3) +":" +String.valueOf(count2)+" :" +String.valueOf(count));
	        
	        

	        }
	    });
	    
		
		
		
		label.setBounds(0,0,100,100);
		add(label);
		
	
		if(i==0) {
			timer.start();
			i++;
		}
		setSize(800,800);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		getContentPane().setBackground(Color.WHITE);
		setLayout(null);
		 	
		 
		
		
		if(Bot1.p==true&&Bot1.x>=20&&Bot1.x<=170&&(390>Bot1.y)) {
			repaint();
			
			
			
			JFrame f=new JFrame();
			f.setSize(500,500);
			timer.stop();
			JLabel p=new JLabel("Bot1 Kazandi Süresi " + String.valueOf(count3) +":" +String.valueOf(count2)+" :" +String.valueOf(count));
			f.add(p);
			f.setVisible(true);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			dispose();
			System.exit(0);
		}
		if(Bot2.p==true&&Bot2.x>=20&&Bot2.x<=170&&(390>Bot2.y)) {
			repaint();
			
			JFrame f=new JFrame();
			f.setSize(500,500);
			timer.stop();
			JLabel p=new JLabel("Bot2 Kazandi Süresi " + String.valueOf(count3) +":" +String.valueOf(count2)+" :" +String.valueOf(count));
			
			f.add(p);
			f.setVisible(true);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			dispose();
			System.exit(0);
		}
		if(Bot3.p==true&&Bot1.x>=20&&Bot3.x<=170&&(390>Bot3.y)) {
			repaint();
			
			
			JFrame f=new JFrame();
			f.setSize(500,500);
			timer.stop();
			JLabel p=new JLabel("Bot3 Kazandi Süresi " + String.valueOf(count3) +":" +String.valueOf(count2)+" :" +String.valueOf(count));
			f.add(p);
			f.setVisible(true);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			dispose();
			System.exit(0);
		}
		if(Bot4.p==true&&Bot4.x>=20&&Bot4.x<=170&&(390>Bot4.y)) {
			repaint();
			
			
			JFrame f=new JFrame();
			f.setSize(500,500);
			timer.stop();
			JLabel p=new JLabel("Bot4 Kazandi Süresi " + String.valueOf(count3) +":" +String.valueOf(count2)+" :" +String.valueOf(count));
			f.add(p);
			f.setVisible(true);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			dispose();
			System.exit(0);
		}
		if(Bot5.p==true&&Bot5.x>=20&&Bot5.x<=170&&(390>Bot5.y)) {
			repaint();
			
		
			JFrame f=new JFrame();
			f.setSize(500,500);
			timer.stop();
			JLabel p=new JLabel("Bot5 Kazandi Süresi " + String.valueOf(count3) +":" +String.valueOf(count2)+" :" +String.valueOf(count));
			f.add(p);
			f.setVisible(true);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			dispose();
			System.exit(0);
		}
		if(Player1.p==true&&Player1.x>=20&&Player1.x<=170&&390>Player1.y) {
		repaint();
			JFrame f=new JFrame();
			f.setSize(500,500);
			timer.stop();
			JLabel p=new JLabel("Player1 Kazandi Süresi " + String.valueOf(count3) +":" +String.valueOf(count2)+" :" +String.valueOf(count));
			f.add(p);
			f.setVisible(true);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			dispose();
			System.exit(0);
		}
		if(Player2.p==true&&Player2.c>=20&&Player2.c<=170&&390>Player2.z) {
			repaint();
			JFrame f=new JFrame();
			f.setSize(500,500);
			timer.stop();
			JLabel p=new JLabel("PLayer2 Kazandi Süresi " + String.valueOf(count3) +":" +String.valueOf(count2)+" :" +String.valueOf(count));
			f.add(p);
			f.setVisible(true);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			dispose();
			System.exit(0);
		}
		
		
        
 

	//	setResizable(false);
		setVisible(true);
		
	
		
		
		
		
	}
	public  void paint(Graphics g) {
		super.paint(g);
		g.setColor(Color.GREEN);
		g.fillRect(Player1.x,Player1.y,10,10);
		 g.setColor(Color.RED);
		g.fillRect(Player2.c,Player2.z,10,10);
		
		g.setColor(Color.DARK_GRAY);
		
		g.drawOval(20,40,700,700);
		g.drawOval(170,190,400,400);
		g.drawLine(20,390,170,390);
		
		g.fillRect(Bot1.x,Bot1.y,10,10);
		g.fillRect(Bot2.x,Bot2.y,10,10);
		g.fillRect(Bot3.x,Bot3.y,10,10);
		g.fillRect(Bot4.x,Bot4.y,10,10);
		g.fillRect(Bot5.x,Bot5.y,10,10);
		
	
	
 
		
	}


	
	
	

	
}
