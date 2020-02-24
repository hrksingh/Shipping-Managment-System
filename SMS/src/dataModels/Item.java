package dataModels;

public class Item implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private int itemId;
	private int price;
	private String name;
	private String expdate;
	
	public Item(int itemId, int price,String name, String expdate) {
		super();
		this.itemId = itemId;
		this.name = name;
		this.price = price;
		this.expdate = expdate;
	}
	

	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getExpdate() {
		return expdate;
	}
	public void setExpdate(String expdate) {
		this.expdate = expdate;
	}
	
}
