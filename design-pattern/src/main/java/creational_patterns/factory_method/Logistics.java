package creational_patterns.factory_method;

public interface Logistics {
	void planDelivery();
	Transport createTransport();
}
