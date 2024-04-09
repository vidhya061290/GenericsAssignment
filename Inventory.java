package generics;

import java.util.ArrayList;

public class Inventory<T> extends Vehicle {
	ArrayList<T> inventory;
	
	public Inventory(String model , String vin , int horsePower,ArrayList<T>inventory) {
		super(model,vin,horsePower);
		this.inventory = inventory;
	}
	public Inventory(ArrayList<T>inventory) {
		super();
		this.inventory = inventory;
		
	}

	public ArrayList<T> getInventory() {
		return inventory;
	}

	public void setInventory(ArrayList<T> inventory) {
		this.inventory = inventory;
	}
	
	@Override
	public String toString() {
		return "Inventory [inventory=" + inventory + "]";
	}
	
	public void addToInventory(Vehicle vehicle) {
		ArrayList<Vehicle> inventory = new ArrayList<>();
        inventory.add(vehicle);
        System.out.println("Added successfully");
}
	public void removeFromInventory(ArrayList<Vehicle>inventory,String vin) {	
		for(int i =0 ; i < inventory.size();i++) {
			if((inventory.get(i).vin).equals(vin)) {
				inventory.remove(i);
				System.out.println("removed Successfully");
			}
			
		}
	
		}
}