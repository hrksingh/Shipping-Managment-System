package dataClass;

import java.util.ArrayList;

import dataModels.Box;

public class BoxData {
	private static ArrayList<Box>  boxList = new ArrayList<>();
	

	BoxData() {
		ItemData itemData = new ItemData();
		boxList.add(new Box(1,10,10,10,50,itemData.getRandomItemList()));
		boxList.add(new Box(2,15,10,10,70,itemData.getRandomItemList()));
		boxList.add(new Box(3,5,15,15,30,itemData.getRandomItemList()));
		boxList.add(new Box(4,20,10,20,40,itemData.getRandomItemList()));
		boxList.add(new Box(5,10,20,30,100,itemData.getRandomItemList()));
		boxList.add(new Box(6,15,15,10,70,itemData.getRandomItemList()));
		boxList.add(new Box(7,30,10,20,80,itemData.getRandomItemList()));
		boxList.add(new Box(8,20,5,20,20,itemData.getRandomItemList()));
		boxList.add(new Box(9,15,30,10,90,itemData.getRandomItemList()));
		boxList.add(new Box(10,25,20,30,150,itemData.getRandomItemList()));
	}
	
	private int  getRandomIndex(){
		int index = (int)(((Math.random()*boxList.size()+1))-1) ;
		return index;
	}
	
    
    public ArrayList<Box> getRandomBoxes(){
    	ArrayList<Box> boxes = new ArrayList<>();
    	for (int i = 0; i < 3; i++) {
			boxes.add(boxList.get(getRandomIndex()));
		}
		return boxes;
    }
	
	
	

}
