package dataModels;

public class Status implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	
	public Status() {}
	private int statusId;
	private static String statusCreated = "Created";
	private static String statusDispactched = "Dispactched";
	private static String statusDelivered = "Delivered";
	private static String statusReturned = "Returned";
	
	

	public int getStatusId() {
		return statusId;
	}
	public void setStatusId(int statusId) {
		this.statusId = statusId;
	}
	public static String Created() {
		return statusCreated;
	}
	public static String Dispactched() {
		return statusDispactched;
	}
	public static String Delivered() {
		return statusDelivered;
	}
	public static String Returned() {
		return statusReturned;
	}
	
	

}
