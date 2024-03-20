import java.util.Random;

public class Bot  extends Thread{ 
	
 Random random = new Random();
 static int i=0;
static int b1x;
static int b1y;
static boolean b1;

static int b2x;
static int b2y;
static boolean b2;

static int b3x;
static int b3y;
static boolean b3;

static int b4x;
static int b4y;
static boolean b4;

static int b5x;
static int b5y;
static boolean b5;

/*public synchronized void run() {

	
	 int r1 = random.nextInt(4);
	 int r2 = random.nextInt(4);
	 int r3 = random.nextInt(4);
	 int r4= random.nextInt(4);
	 int r = random.nextInt(2);
	
	 if(b1x<=370&&b1y>0) {
		 if(r==0) {
			 if(b1x+5==b2x||b1x+5==b3x||b1x+5==b4x||b1x+5==b5x||b1x+5==b5x||b1x+5==Player1.x||b1x+5==Player2.c) {
				try {
					Thread.sleep(200);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			 }
			 else {
			 b1x+=5;
		 }
		 if(r==1) {
		 b1y-=5;
		 }
		 
	 }
	 } 
	 else if(b1x>370&&b1y>0) {
		 if(r==0) {
			 b1x+=5;
		 }
		 if(r==1) {
		 b1y+=5;
		 }
	 } 
	 
	 else if(b1x<570&&b1y>590) {
		 if(r==0) {
			 b1x-=5;
		 }
		 if(r==1) {
		 b1y-=5;
		 }
	 } else if(b1x<570&&b1y>390) {
		 if(r==0) {
			 b1x-=5;
		 }
		 if(r==1) {
		 b1y+=5;
		 }
	 }
	 
 if(r1==0) {
	 b2x+=5;
 }
if(r1==1) {
 b2x-=5;
 }
if(r1==2) {
 b2y+=5;
}
if(r1==3) {
 b2y-=5; 
}

if(r2==0) {
	 b3x+=5;
}
if(r2==1) {
b3x-=5;
}
if(r2==2) {
b3y+=5;
}
if(r2==3) {
b3y-=5; 
}

if(r3==0) {
	 b4x+=5;
}
if(r3==1) {
b4x-=5;
}
if(r3==2) {
b4y+=5;
}
if(r3==3) {
b4y-=5; 
}

if(r4==0) {
	 b5x+=5;
}
if(r4==1) {
b5x-=5;
}
if(r4==2) {
b5y+=5;
}
if(r4==3) {
b5y-=5; 
}
	
	run();
}
*/
}
