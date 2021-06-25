
public class MainThread {

	public static void main(String[] args) throws InterruptedException {
		
		ThreadSum s = new ThreadSum();
		s.start();
		
		synchronized(s) {
		s.wait();
		System.out.println("Total sum is " + s.total);
		}
	}
	
}
