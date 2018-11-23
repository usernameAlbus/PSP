public class Numbers {

	public static void main(String[] args) {

		/*NumberThread n1, n2, n3, n4, n5, n6;

		

		n1 = new NumberThread(1); n1.start(); //.start es parte de la clase Thread

		n2 = new NumberThread(2); n2.start();

		n3 = new NumberThread(3); n3.start();

		n4 = new NumberThread(4); n4.start();

		n5 = new NumberThread(5); n5.start();

		n6 = new NumberThread(6); n6.start();*/

		

		Thread nt1, nt2, nt3, nt4, nt5, nt6;

		

		nt1 = new Thread(new NumberRunnable(71)); nt1.start();

		nt2 = new Thread(new NumberRunnable(69)); nt2.start();

		nt3 = new Thread(new NumberRunnable(13)); nt3.start();

		nt4 = new Thread(new NumberRunnable(37)); nt4.start();

		nt5 = new Thread(new NumberRunnable(12)); nt5.start();

		nt6 = new Thread(new NumberRunnable(1)); nt6.start();

		

	}

}