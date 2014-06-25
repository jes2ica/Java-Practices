package thread;
public class ThreadExample extends Thread {
	public int count = 0;
	
	public void run() {
		System.out.println("Thread starting.");
		try {
			while (count < 5) {
				Thread.sleep(500);
				System.out.println("In Thread, count is " + count);
				count++;
			}
		} catch(InterruptedException exc) {
			System.out.println("Thead interrupted");
		}
		System.out.println("Thread terminating");
	}
	
	public static void main(String args[]) {
		ThreadExample instance = new ThreadExample();
		instance.start();
		
		while(instance.count != 5) {
			try{
				Thread.sleep(250);
			} catch (InterruptedException exc) {
				exc.printStackTrace();
			}
		}
	}
}