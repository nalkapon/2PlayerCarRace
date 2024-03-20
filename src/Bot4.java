import java.util.Random;

public class Bot4 extends Bot{
	static int x=125;
	static int y=385;
	static boolean p=false;
	 Random random = new Random();
	 public synchronized void run() {
		 if(x>=570&&x<720&&y>400&&y<730) 
			 p=true;
		 try {
				Thread.sleep((1000)/CarRace.n);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 int r = random.nextInt(2);
		
		 if((x>=20-CarRace.n||x>=10)&&x<=365+CarRace.n&&y<=385+CarRace.n&&(y>=40-CarRace.n||y>=30)) {
		 if(Math.abs((x-365)*(x-365))+Math.abs((y-385)*(y-385))<42050){
				 try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			 		x=x-CarRace.n;
			 		y=y-CarRace.n;
			 	
			 }
		 else if(Math.abs((x-365)*(x-365))+Math.abs((y-385)*(y-385))>119000){
			 try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 x=x+CarRace.n;
		 		y=y+CarRace.n;
		 		
		 }
		 else {
			 if(r==0) {
				 if((Math.abs(x-Bot5.x)<10&&(Math.abs(y-Bot5.y)<10))||(Math.abs(x-Bot1.x)<10&&(Math.abs(y-Bot1.y)<10))||(Math.abs(x-Bot3.x)<10&&(Math.abs(y+CarRace.n-Bot3.y)<10))||(Math.abs(x-Bot2.x)<10&&(Math.abs(y-Bot2.y)<10))||(Math.abs(x-Player1.x)<10&&(Math.abs(y-Player1.y)<10))||(Math.abs(x-Player2.c)<10&&(Math.abs(y-Player2.z)<10))) {
				 try {
					 Thread.sleep(500);
					if (Math.abs(x-Bot5.x)<10&&(Math.abs(y-Bot5.y)<10))	{
						Bot5.x+=10;
						Bot5.y+=10;
					}
					else if	(Math.abs(x-Bot1.x)<10&&(Math.abs(y-Bot1.y)<10))	{
						Bot1.x+=10;
						Bot1.y+=10;
					}
					else if	(Math.abs(x-Bot3.x)<10&&(Math.abs(y-Bot3.y)<10))	{
						Bot3.x+=10;
						Bot3.y+=10;
					}
					else if	(Math.abs(x-Bot2.x)<10&&(Math.abs(y-Bot2.y)<10))	{
						Bot2.x+=10;
						Bot2.y+=10;
					}
					else if	(Math.abs(x-Player1.x)<10&&(Math.abs(y-Player1.y)<10))	{
						Player1.x+=10;
						Player1.y+=10;
					}
					else if	(Math.abs(x-Player2.c)<10&&(Math.abs(y-Player2.z)<10))	{
						Player.x+=10;
						Player.y+=10;
					}
						x=x-10;
						y=y-10;
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				 }
				
				 else {
				 x+=CarRace.n;
			 }
			 }
			 if(r==1) {
				 if((Math.abs(x-Bot5.x)<10&&(Math.abs(y-Bot5.y)<10))||(Math.abs(x-Bot1.x)<10&&(Math.abs(y-Bot1.y)<10))||(Math.abs(x-Bot3.x)<10&&(Math.abs(y+CarRace.n-Bot3.y)<10))||(Math.abs(x-Bot2.x)<10&&(Math.abs(y-Bot2.y)<10))||(Math.abs(x-Player1.x)<10&&(Math.abs(y-Player1.y)<10))||(Math.abs(x-Player2.c)<10&&(Math.abs(y-Player2.z)<10))) {
				 	try {
							Thread.sleep(500);
							if (Math.abs(x-Bot5.x)<10&&(Math.abs(y-Bot5.y)<10))	{
								Bot5.x+=10;
								Bot5.y+=10;
							}
							else if	(Math.abs(x-Bot1.x)<10&&(Math.abs(y-Bot1.y)<10))	{
								Bot1.x+=10;
								Bot1.y+=10;
							}
							else if	(Math.abs(x-Bot3.x)<10&&(Math.abs(y-Bot3.y)<10))	{
								Bot3.x+=10;
								Bot3.y+=10;
							}
							else if	(Math.abs(x-Bot2.x)<10&&(Math.abs(y-Bot2.y)<10))	{
								Bot2.x+=10;
								Bot2.y+=10;
							}
							else if	(Math.abs(x-Player1.x)<10&&(Math.abs(y-Player1.y)<10))	{
								Player1.x+=10;
								Player1.y+=10;
							}
							else if	(Math.abs(x-Player2.c)<10&&(Math.abs(y-Player2.z)<10))	{
								Player.x+=10;
								Player.y+=10;
							}
							x=x-10;
							y=y-10;
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
			}
				 else {
			 y-=CarRace.n;
				 }
			 }
		 }	 
		 }
		 
		 
		 else if((x<=720+CarRace.n||x<=730)&&x>=365&&(y>40-CarRace.n||y>=30)&&y<385) {
			 if(Math.abs((x-365)*(x-365))+Math.abs((y-385)*(y-385))<42050){
				 try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			 		x=x+CarRace.n;
			 		y=y-CarRace.n;
			 	
			 }
		 else if(Math.abs((x-365)*(x-365))+Math.abs((y-385)*(y-385))>119000){
			 try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 		x=x-CarRace.n;
		 		y=y+CarRace.n;
		 }
		 else {
			 if(r==0) {
				 if((Math.abs(x-Bot5.x)<10&&(Math.abs(y-Bot5.y)<10))||(Math.abs(x-Bot1.x)<10&&(Math.abs(y-Bot1.y)<10))||(Math.abs(x-Bot3.x)<10&&(Math.abs(y+CarRace.n-Bot3.y)<10))||(Math.abs(x-Bot2.x)<10&&(Math.abs(y-Bot2.y)<10))||(Math.abs(x-Player1.x)<10&&(Math.abs(y-Player1.y)<10))||(Math.abs(x-Player2.c)<10&&(Math.abs(y-Player2.z)<10))) {				 
				 try {
						Thread.sleep(500);
						if (Math.abs(x-Bot5.x)<10&&(Math.abs(y-Bot5.y)<10))	{
							Bot5.x+=10;
							Bot5.y+=10;
						}
						else if	(Math.abs(x-Bot1.x)<10&&(Math.abs(y-Bot1.y)<10))	{
							Bot1.x+=10;
							Bot1.y+=10;
						}
						else if	(Math.abs(x-Bot3.x)<10&&(Math.abs(y-Bot3.y)<10))	{
							Bot3.x+=10;
							Bot3.y+=10;
						}
						else if	(Math.abs(x-Bot2.x)<10&&(Math.abs(y-Bot2.y)<10))	{
							Bot2.x+=10;
							Bot2.y+=10;
						}
						else if	(Math.abs(x-Player1.x)<10&&(Math.abs(y-Player1.y)<10))	{
							Player1.x+=10;
							Player1.y+=10;
						}
						else if	(Math.abs(x-Player2.c)<10&&(Math.abs(y-Player2.z)<10))	{
							Player.x+=10;
							Player.y+=10;
						}
						x=x-10;
						y=y-10;
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				 }
				 else {
				 x+=CarRace.n;
			 }
			 }
			 if(r==1) {
				 if((Math.abs(x-Bot5.x)<10&&(Math.abs(y-Bot5.y)<10))||(Math.abs(x-Bot1.x)<10&&(Math.abs(y-Bot1.y)<10))||(Math.abs(x-Bot3.x)<10&&(Math.abs(y+CarRace.n-Bot3.y)<10))||(Math.abs(x-Bot2.x)<10&&(Math.abs(y-Bot2.y)<10))||(Math.abs(x-Player1.x)<10&&(Math.abs(y-Player1.y)<10))||(Math.abs(x-Player2.c)<10&&(Math.abs(y-Player2.z)<10))) {
				 try {
							Thread.sleep(500);
							if (Math.abs(x-Bot5.x)<10&&(Math.abs(y-Bot5.y)<10))	{
								Bot5.x+=10;
								Bot5.y+=10;
							}
							else if	(Math.abs(x-Bot1.x)<10&&(Math.abs(y-Bot1.y)<10))	{
								Bot1.x+=10;
								Bot1.y+=10;
							}
							else if	(Math.abs(x-Bot3.x)<10&&(Math.abs(y-Bot3.y)<10))	{
								Bot3.x+=10;
								Bot3.y+=10;
							}
							else if	(Math.abs(x-Bot2.x)<10&&(Math.abs(y-Bot2.y)<10))	{
								Bot2.x+=10;
								Bot2.y+=10;
							}
							else if	(Math.abs(x-Player1.x)<10&&(Math.abs(y-Player1.y)<10))	{
								Player1.x+=10;
								Player1.y+=10;
							}
							else if	(Math.abs(x-Player2.c)<10&&(Math.abs(y-Player2.z)<10))	{
								Player.x+=10;
								Player.y+=10;
							}
							x=x-10;
							y=y-10;
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
			}
				 else {
			 y+=CarRace.n;
				 }
			 }
		 } 
		 } 
		 
		 else if(x>=365&&(x<=720+CarRace.n||x<=730)&&y>=385&&(y<=730+CarRace.n||y<=740)) {
			 if(Math.abs((x-365)*(x-365))+Math.abs((y-385)*(y-385))<42050){
				 try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			 		x=x+CarRace.n;
			 		y=y+CarRace.n;
			 	
			 }
		 else if(Math.abs((x-365)*(x-365))+Math.abs((y-385)*(y-385))>119000){
			 try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
				x=x-CarRace.n;
		 		y=y-CarRace.n;
		 	
		 }else {
			 if(r==0) {
				 if((Math.abs(x-Bot5.x)<10&&(Math.abs(y-Bot5.y)<10))||(Math.abs(x-Bot1.x)<10&&(Math.abs(y-Bot1.y)<10))||(Math.abs(x-Bot3.x)<10&&(Math.abs(y+CarRace.n-Bot3.y)<10))||(Math.abs(x-Bot2.x)<10&&(Math.abs(y-Bot2.y)<10))||(Math.abs(x-Player1.x)<10&&(Math.abs(y-Player1.y)<10))||(Math.abs(x-Player2.c)<10&&(Math.abs(y-Player2.z)<10))) {
				 try {
						Thread.sleep(500);
						if (Math.abs(x-Bot5.x)<10&&(Math.abs(y-Bot5.y)<10))	{
							Bot5.x+=10;
							Bot5.y+=10;
						}
						else if	(Math.abs(x-Bot1.x)<10&&(Math.abs(y-Bot1.y)<10))	{
							Bot1.x+=10;
							Bot1.y+=10;
						}
						else if	(Math.abs(x-Bot3.x)<10&&(Math.abs(y-Bot3.y)<10))	{
							Bot3.x+=10;
							Bot3.y+=10;
						}
						else if	(Math.abs(x-Bot2.x)<10&&(Math.abs(y-Bot2.y)<10))	{
							Bot2.x+=10;
							Bot2.y+=10;
						}
						else if	(Math.abs(x-Player1.x)<10&&(Math.abs(y-Player1.y)<10))	{
							Player1.x+=10;
							Player1.y+=10;
						}
						else if	(Math.abs(x-Player2.c)<10&&(Math.abs(y-Player2.z)<10))	{
							Player.x+=10;
							Player.y+=10;
						}
						x=x-10;
						y=y-10;
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				 }
				 else {
				 x-=CarRace.n;
			 }
			 }
			 if(r==1) {
				 if((Math.abs(x-Bot5.x)<10&&(Math.abs(y-Bot5.y)<10))||(Math.abs(x-Bot1.x)<10&&(Math.abs(y-Bot1.y)<10))||(Math.abs(x-Bot3.x)<10&&(Math.abs(y+CarRace.n-Bot3.y)<10))||(Math.abs(x-Bot2.x)<10&&(Math.abs(y-Bot2.y)<10))||(Math.abs(x-Player1.x)<10&&(Math.abs(y-Player1.y)<10))||(Math.abs(x-Player2.c)<10&&(Math.abs(y-Player2.z)<10))) {				 
				 try {
							Thread.sleep(500);
							if (Math.abs(x-Bot5.x)<10&&(Math.abs(y-Bot5.y)<10))	{
								Bot5.x+=10;
								Bot5.y+=10;
							}
							else if	(Math.abs(x-Bot1.x)<10&&(Math.abs(y-Bot1.y)<10))	{
								Bot1.x+=10;
								Bot1.y+=10;
							}
							else if	(Math.abs(x-Bot3.x)<10&&(Math.abs(y-Bot3.y)<10))	{
								Bot3.x+=10;
								Bot3.y+=10;
							}
							else if	(Math.abs(x-Bot2.x)<10&&(Math.abs(y-Bot2.y)<10))	{
								Bot2.x+=10;
								Bot2.y+=10;
							}
							else if	(Math.abs(x-Player1.x)<10&&(Math.abs(y-Player1.y)<10))	{
								Player1.x+=10;
								Player1.y+=10;
							}
							else if	(Math.abs(x-Player2.c)<10&&(Math.abs(y-Player2.z)<10))	{
								Player.x+=10;
								Player.y+=10;
							}
							x=x-10;
							y=y-10;
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
			}
				 else {
			 y+=CarRace.n;
				 }
			 }
		 }
		 } 
		 else if((x>=20-CarRace.n||x>=10)&&x<365&&y>385&&(y<730+CarRace.n||y<=740)) {
			 if(Math.abs((x-365)*(x-365))+Math.abs((y-385)*(y-385))<42050){
				 try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			 		x=x-CarRace.n;
			 		y=y+CarRace.n;
			 }
		 else if(Math.abs((x-365)*(x-365))+Math.abs((y-385)*(y-385))>119000){
			 try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 x=x+CarRace.n;
		 		y=y-CarRace.n;
		 		
		 }else {
			 if(r==0) {
				 if((Math.abs(x-Bot5.x)<10&&(Math.abs(y-Bot5.y)<10))||(Math.abs(x-Bot1.x)<10&&(Math.abs(y-Bot1.y)<10))||(Math.abs(x-Bot3.x)<10&&(Math.abs(y+CarRace.n-Bot3.y)<10))||(Math.abs(x-Bot2.x)<10&&(Math.abs(y-Bot2.y)<10))||(Math.abs(x-Player1.x)<10&&(Math.abs(y-Player1.y)<10))||(Math.abs(x-Player2.c)<10&&(Math.abs(y-Player2.z)<10))) {
				 try {
						Thread.sleep(500);
						if (Math.abs(x-Bot5.x)<10&&(Math.abs(y-Bot5.y)<10))	{
							Bot5.x+=10;
							Bot5.y+=10;
						}
						else if	(Math.abs(x-Bot1.x)<10&&(Math.abs(y-Bot1.y)<10))	{
							Bot1.x+=10;
							Bot1.y+=10;
						}
						else if	(Math.abs(x-Bot3.x)<10&&(Math.abs(y-Bot3.y)<10))	{
							Bot3.x+=10;
							Bot3.y+=10;
						}
						else if	(Math.abs(x-Bot2.x)<10&&(Math.abs(y-Bot2.y)<10))	{
							Bot2.x+=10;
							Bot2.y+=10;
						}
						else if	(Math.abs(x-Player1.x)<10&&(Math.abs(y-Player1.y)<10))	{
							Player1.x+=10;
							Player1.y+=10;
						}
						else if	(Math.abs(x-Player2.c)<10&&(Math.abs(y-Player2.z)<10))	{
							Player.x+=10;
							Player.y+=10;
						}
						x=x-10;
						y=y-10;
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				 }
				 else {
				 x-=CarRace.n;
			 }
			 }
			 if(r==1) {
				 if((Math.abs(x-Bot5.x)<10&&(Math.abs(y-Bot5.y)<10))||(Math.abs(x-Bot1.x)<10&&(Math.abs(y-Bot1.y)<10))||(Math.abs(x-Bot3.x)<10&&(Math.abs(y+CarRace.n-Bot3.y)<10))||(Math.abs(x-Bot2.x)<10&&(Math.abs(y-Bot2.y)<10))||(Math.abs(x-Player1.x)<10&&(Math.abs(y-Player1.y)<10))||(Math.abs(x-Player2.c)<10&&(Math.abs(y-Player2.z)<10))) {
				 try {
							Thread.sleep(500);
							if (Math.abs(x-Bot5.x)<10&&(Math.abs(y-Bot5.y)<10))	{
								Bot5.x+=10;
								Bot5.y+=10;
							}
							else if	(Math.abs(x-Bot1.x)<10&&(Math.abs(y-Bot1.y)<10))	{
								Bot1.x+=10;
								Bot1.y+=10;
							}
							else if	(Math.abs(x-Bot3.x)<10&&(Math.abs(y-Bot3.y)<10))	{
								Bot3.x+=10;
								Bot3.y+=10;
							}
							else if	(Math.abs(x-Bot2.x)<10&&(Math.abs(y-Bot2.y)<10))	{
								Bot2.x+=10;
								Bot2.y+=10;
							}
							else if	(Math.abs(x-Player1.x)<10&&(Math.abs(y-Player1.y)<10))	{
								Player1.x+=10;
								Player1.y+=10;
							}
							else if	(Math.abs(x-Player2.c)<10&&(Math.abs(y-Player2.z)<10))	{
								Player.x+=10;
								Player.y+=10;
							}
							x=x-10;
							y=y-10;
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
			}
				 else {
			 y-=CarRace.n;
				 }
			 }
		 
		 }
		 }
		
		 run();
}
}
	