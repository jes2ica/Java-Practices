package producerConsumer;

public class Warehouse {
	
	private int base = 0;
	private int top = 0;
	private Product[] products = new Product[10];
	
	public synchronized void push (Product product) {
		if(top == products.length) {
			try{
				System.out.println("The warehouse is full.");
				wait();
			} catch (InterruptedException e) {
				System.out.println("Stop push product because other reasons.");
			}
		}
		products[top] = product;
		top++;
		notify();
	}
	
	public synchronized Product pop() {
		Product product = null;
		notify();
		while(top == base){
			try {
				System.out.println("The warehouse is empty");
				wait();
			} catch(InterruptedException e) {
				System.out.println("Stop push product because other reasons");
			}
		}
		top--;
		product = products[top];
		products[top] = null;
		return product;
	}
	

}
