import java.util.*;

import dataClass.OrderData;
import dataModels.Box;
import dataModels.Item;
import dataModels.Order;

public class DriverMain {

	public static void main(String[] args) {
		OrderData od = new OrderData();
		
		
		//Group Order by status State
		Map<String,ArrayList<String>> orderStatusMap= new HashMap<>();
		ArrayList<String> dlist = new ArrayList<>();
		ArrayList<String> clist = new ArrayList<>();
		ArrayList<String> dilist = new ArrayList<>();
		ArrayList<String> rlist = new ArrayList<>();
			System.out.println("All Order Status: ");
			
			Iterator<Order> itr  = od.getOrderList().iterator();
			
			while(itr.hasNext()) {
				Order order = (Order) itr.next();
				if(order.getStatus() == "Delivered") {
					for (Box box: order.getBoxes()) {
						box.getItem().forEach(item->dlist.add(item.getName()));
					}
					
					orderStatusMap.put("Delivered", dlist);
					
				}
				
				if(order.getStatus() == "Created") {
					for (Box box: order.getBoxes()) {
						for (Item item : box.getItem()) {
							clist.add(item.getName());
						}
					}
					orderStatusMap.put("Created", clist);
					
				}
				
				if(order.getStatus() == "Dispactched") {
					for (Box box: order.getBoxes()) {
						for (Item item : box.getItem()) {
							dilist.add(item.getName());
						}
					}
					orderStatusMap.put("Dispactched", dilist);
					
				}
				
				if(order.getStatus() == "Returned") {
					for (Box box: order.getBoxes()) {
						for (Item item : box.getItem()) {
							rlist.add(item.getName());
						}
					}
					orderStatusMap.put("Returned", rlist);
					
				}
				
				
				
			}
			
	
		System.out.println(orderStatusMap);
			
				
			}

	}


