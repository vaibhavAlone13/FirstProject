
public class ThreadSum extends Thread{
	
	int total;
	public void run() {
	
	synchronized(this) {
		for(int i=1; i<=900; i++) {
			total += i;
		}
		this.notify();
	}
 }
}
