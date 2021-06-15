package creational_patterns.factory_method;

public class SeaLogistics implements Logistics{

	public void planDelivery() {
		System.out.println("We shall deliver on sea");
	}

	public Transport createTransport() {
		return new Ship();
	}

}
