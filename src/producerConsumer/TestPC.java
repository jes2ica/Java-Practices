package producerConsumer;

public class TestPC {
	
	public static void main (String args[]) {
		Warehouse warehouse = new Warehouse();
		Producer producer = new Producer("ProducerA",warehouse);
		Consumer consumer = new Consumer("ConsumerA", warehouse);
		Thread t1 = new Thread(producer);
		Thread t2 = new Thread(consumer);
		t1.start();
		t2.start();
	}

}
