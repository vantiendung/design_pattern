package creational_patterns.factory_method;

public class RoadLogistics implements Logistics{

	public void planDelivery() {
		System.out.println("We shall deliver on road");
	}

	public Transport createTransport() {
		return new Truck();
	}

}
