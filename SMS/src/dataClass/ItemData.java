package dataClass;

import java.util.ArrayList;

import dataModels.Item;

public class ItemData {
   
	private static ArrayList<Item>  totalItemList = new ArrayList<>();
	
	private String getRandomDate() {
		String day =  Integer.toString((int)(Math.random()*31+1));
		String month =  Integer.toString((int)(Math.random()*12+1));
		String year =  Integer.toString((int)(2020 + (Math.random() * ((2099 - 2020) + 1))));
		String date = day+"/"+month+"/"+year;
		return date;
	}
	
	ItemData() {
		totalItemList.add(new Item(1,300,"Chair",getRandomDate()));
		totalItemList.add(new Item(2,250,"Lamp",getRandomDate()));
		totalItemList.add(new Item(3,1000,"Table",getRandomDate()));
		totalItemList.add(new Item(4,150,"Mug",getRandomDate()));
		totalItemList.add(new Item(5,100,"Rug",getRandomDate()));
		totalItemList.add(new Item(6,50,"Bottle",getRandomDate()));
		totalItemList.add(new Item(7,50000,"Laptop",getRandomDate()));
		totalItemList.add(new Item(8,1000,"Bag",getRandomDate()));
		totalItemList.add(new Item(9,10,"Pen",getRandomDate()));
		totalItemList.add(new Item(10,30,"Notebook",getRandomDate()));
		totalItemList.add(new Item(11,100,"Towels",getRandomDate()));
		totalItemList.add(new Item(12,5,"Candle",getRandomDate()));
		totalItemList.add(new Item(13,700,"Shirt",getRandomDate()));
		totalItemList.add(new Item(14,950,"Pant",getRandomDate()));
		totalItemList.add(new Item(15,1000,"Jacket",getRandomDate()));
		totalItemList.add(new Item(16,1100,"Shoes",getRandomDate()));
		totalItemList.add(new Item(17,100,"Belt",getRandomDate()));
		totalItemList.add(new Item(18,45,"Maggie",getRandomDate()));
		totalItemList.add(new Item(19,70,"Mangoes",getRandomDate()));
		totalItemList.add(new Item(20,300,"Cake",getRandomDate()));
	
		
	
}
	
	private int  getRandomIndex(){
		int index = (int)(((Math.random()*totalItemList.size()+1))-1) ;
		return index;
	}
	
    
    public ArrayList<Item> getRandomItemList(){
    	ArrayList<Item> itemList = new ArrayList<>();
    	for (int i = 0; i < 3; i++) {
			
			itemList.add(totalItemList.get(getRandomIndex()));
		}
		return itemList;
    }

	}
