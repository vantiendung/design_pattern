package creational_patterns.factory_method;

public class DeliveryOrder {
	private Logistics logisticsUnit;
	private Transport transporter;
	
	public void log() {
		logisticsUnit.planDelivery();
		transporter.deliver();
	}
	
	public DeliveryOrder(Logistics logistics) {
		this.logisticsUnit = logistics;
		transporter = logistics.createTransport();
	}

	public Logistics getLogisticsUnit() {
		return logisticsUnit;
	}

	public void setLogisticsUnit(Logistics logisticsUnit) {
		this.logisticsUnit = logisticsUnit;
	}

	public Transport getTransporter() {
		return transporter;
	}

	public void setTransporter(Transport transporter) {
		this.transporter = transporter;
	}
}
