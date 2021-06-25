
public class Demo extends Thread{
	
	public void run() {
		for(int i= 1; i<=10; i++) {
			System.out.println(i);
		}	
	}

	public static void main(String[] args) throws InterruptedException {
		
		Demo t1 = new Demo();
		t1.setPriority(MAX_PRIORITY);
		System.out.println(t1.getName());
		t1.start();
		
		for(int j=1; j<=10; j++) {
			System.out.println("j: "+ j );
		}
		
	}

}
