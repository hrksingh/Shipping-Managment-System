package dataModels;

import java.util.List;

public class Order implements java.io.Serializable  {
	
	private static final long serialVersionUID = 1L;
	
	private int orderId;
	private int price;
	private int totalShippingPrice;
	private String dispatchDate;
	private String deliveryDate;
	private String status;
	private Transporter transporter;
	private List<Box> boxes;
	
	

	public Order(int orderId, int price, int totalShippingPrice, String dispatchDate, String deliveryDate, String status,
			Transporter transporter, List<Box> boxes) {
		
		this.orderId = orderId;
		this.price = price;
		this.totalShippingPrice = totalShippingPrice;
		this.dispatchDate = dispatchDate;
		this.deliveryDate = deliveryDate;
		this.status = status;
		this.transporter = transporter;
		this.boxes = boxes;
	}
	public Order() {
		
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getTotalShippingPrice() {
		return totalShippingPrice;
	}
	public void setTotalShippingPrice(int totalShippingPrice) {
		this.totalShippingPrice = totalShippingPrice;
	}
	public String getDispatchDate() {
		return dispatchDate;
	}
	public void setDispatchDate(String dispatchDate) {
		this.dispatchDate = dispatchDate;
	}
	public String getDeliveryDate() {
		return deliveryDate;
	}
	public void setDeliveryDate(String deliveryDate) {
		this.deliveryDate = deliveryDate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Transporter getTransporter() {
		return transporter;
	}
	public void setTransporter(Transporter transporter) {
		this.transporter = transporter;
	}
	public List<Box> getBoxes() {
		return boxes;
	}
	public void setBoxes(List<Box> boxes) {
		this.boxes = boxes;
	}
		

}
