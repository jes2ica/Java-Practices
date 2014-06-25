package producerConsumer;

public class Consumer implements Runnable{
	private String consumerName;
	private Warehouse warehouse;
	
	public Consumer(String consumerName, Warehouse warehouse) {
		this.consumerName = consumerName;
		this.warehouse = warehouse;
	}

	public String getConsumerName() {
		return consumerName;
	}

	public void setConsumerName(String consumerName) {
		this.consumerName = consumerName;
	}

	public Warehouse getWarehouse() {
		return warehouse;
	}

	public void setWarehouse(Warehouse warehouse) {
		this.warehouse = warehouse;
	}
	
	public void run() {
		execConsume();
	}
	
	public void execConsume () {
		while(true) {
			System.out.println(getConsumerName() + " consumes " + warehouse.pop());
			try {
				Thread.sleep(5000);
			} catch(InterruptedException e) {
				return;
			}
		}
	}
}
