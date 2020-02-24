package dataModels;

public class Transporter implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	
	private int transporterId;
	private String name;
	private int perUnitVolumePrice;
	private int perUnitWeightPrice;
	private int deliveryTime;
	
	
	
	public Transporter(int transporterId, String name, int perUnitVolumePrice, int perUnitWeightPrice, int deliveryTime) {
		this.transporterId = transporterId;
		this.name = name;
		this.perUnitVolumePrice = perUnitVolumePrice;
		this.perUnitWeightPrice = perUnitWeightPrice;
		this.deliveryTime = deliveryTime;
	}


	public int getTransporterId() {
		return transporterId;
	}
	public void setTransporterId(int transporterId) {
		this.transporterId = transporterId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPerUnitVolumePrice() {
		return perUnitVolumePrice;
	}
	public void setPerUnitVolumePrice(int perUnitVolumePrice) {
		this.perUnitVolumePrice = perUnitVolumePrice;
	}
	public int getPerUnitWeightPrice() {
		return perUnitWeightPrice;
	}
	public void setPerUnitWeightPrice(int perUnitWeightPrice) {
		this.perUnitWeightPrice = perUnitWeightPrice;
	}
	public int getDeliveryTime() {
		return deliveryTime;
	}
	public void setDeliveryTime(int deliveryTime) {
		this.deliveryTime = deliveryTime;
	}
	
	

}
