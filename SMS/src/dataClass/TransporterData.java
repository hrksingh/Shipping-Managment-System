package dataClass;

import java.util.ArrayList;

import dataModels.Transporter;

public class TransporterData {
	ArrayList<Transporter> transporterList = new ArrayList<>();

	public TransporterData() {
		transporterList.add(new Transporter(1, "Ram", 400, 500, 3));
		transporterList.add(new Transporter(2, "Shayam", 300, 600, 5));
		transporterList.add(new Transporter(3, "Hari", 500, 800, 7));
		transporterList.add(new Transporter(4, "Vishal", 300, 700, 2));
	
	}
	
	
	

}
