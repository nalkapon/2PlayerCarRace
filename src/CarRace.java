
public class CarRace {
	static int n;
	 public void game(int x) {
		 n=x;
		 Map p=new Map();
		 Thread b8=new Thread(p);

		 Player1 p1=new Player1();
		 Player2 p2=new Player2();
		 Bot1 b1=new Bot1();
		 Bot2 b2=new Bot2();
		 Bot3 b3=new Bot3();
		 Bot4 b4=new Bot4();
		 Bot5 b5=new Bot5();
		 b8.start();
		 p1.start();
		 p2.start();
		 b1.start();
		 b2.start();
		 b3.start();
		 b4.start();
		 b5.start();

		 try {
		 	b8.join();
		 	p1.join();
		 	p2.join();
		 	b1.join();
		 	b2.join();
		 	b3.join();
		 	b4.join();
		 	b5.join();
		 } catch (InterruptedException e) {
		 	// TODO Auto-generated catch block
		 	e.printStackTrace();
		 }
	 }
	



}
