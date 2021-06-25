
public class MultithreadingMethods implements Runnable {

	@Override
	public void run() {
		for(int i=1; i<=10; i++) {
			System.out.println("Hello World!!!");
		}
		
	}
	
	public static void main(String[] args) {
		MultithreadingMethods m1 = new MultithreadingMethods();
		
		Thread t1 = new Thread(m1);
		t1.start();
		
		ThreadOne t = new ThreadOne();
		Thread t2 = new Thread(t);
		t2.start();
	}

}
