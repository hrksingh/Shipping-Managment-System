package dataClass;

import dataModels.Order;
import dataModels.Status;

import java.util.ArrayList;

import dataClass.BoxData;

public class OrderData {
	Status status =new Status();
	BoxData box = new BoxData();
	TransporterData td = new TransporterData();
	ArrayList<Order> orderList = new ArrayList<>();
	
	Order order1 =new Order(1,1000,1200,"22/02/2020","24/02/2020",Status.Created(),null,box.getRandomBoxes());
	Order order2 =new Order(2,1200,1300,"21/02/2020","25/02/2020",Status.Dispactched(),td.transporterList.get(0),box.getRandomBoxes());
	Order order3 =new Order(3,500,800,"22/02/2020","23/02/2020",Status.Delivered(),td.transporterList.get(1),box.getRandomBoxes());
	Order order4 =new Order(4,10000,11000,"24/02/2020","26/02/2020",Status.Delivered(),td.transporterList.get(2),box.getRandomBoxes());
	Order order5 =new Order(5,100,150,"20/02/2020","24/02/2020",Status.Returned(),td.transporterList.get(3),box.getRandomBoxes());
	
	
	public OrderData() {
		orderList.add(order1);
		orderList.add(order2);
		orderList.add(order3);
		orderList.add(order4);
		orderList.add(order5);
	}
	
	public int Ordersize() {
		return orderList.size();
	}
	
	public ArrayList<Order> getOrderList(){
		return orderList;
	}
	
	

}
