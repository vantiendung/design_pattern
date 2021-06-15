package creational_patterns.factory_method;

public class FactoryMethodApp {
	public static void main(String[] args) {
		DeliveryOrder order = new DeliveryOrder(new SeaLogistics());
		order.log();
	}
}
