package dataModels;

import java.util.List;

public class Box implements java.io.Serializable{

	private static final long serialVersionUID = 1L;
	
	private int boxId;
	private int length;
	private int width;
	private int height;
	private int weight;
	private List<Item> item;
	
	


	public Box(int boxId, int length, int width, int height, int weight, List<Item> item) {
		super();
		this.boxId = boxId;
		this.length = length;
		this.width = width;
		this.height = height;
		this.weight = weight;
		this.item = item;
	}
	public int getBoxId() {
		return boxId;
	}
	public void setBoxId(int boxId) {
		this.boxId = boxId;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public List<Item> getItem() {
		return item;
	}
	public void setItem(List<Item> item) {
		this.item = item;
	}
	

}
