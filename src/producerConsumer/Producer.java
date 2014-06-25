package producerConsumer;


public class Producer implements Runnable { 
	
	private String producerName;
	private Warehouse warehouse;
	
	public Producer(String producerName, Warehouse warehouse) {
		this.producerName = producerName;
		this.warehouse = warehouse;
	}

	public String getProducerName() {
		return producerName;
	}

	public void setProducerName(String producerName) {
		this.producerName = producerName;
	}

	public Warehouse getWarehouse() {
		return warehouse;
	}

	public void setWarehouse(Warehouse warehouse) {
		this.warehouse = warehouse;
	}
	
	public void run() {
		execProduct();
	}
	
	private void execProduct() {
		int i = 0;
		while(true) {
			i++;
			Product pro = new Product(i);
			warehouse.push(pro);
			System.out.println(getProducerName() + " has produce " + pro);
			try{
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				return;
			}
		}
	}
	

}
