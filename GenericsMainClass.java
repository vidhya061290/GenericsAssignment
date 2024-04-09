package generics;

import java.util.ArrayList;


public class GenericsMainClass {
	public static void main(String[] args) {
		Vehicle car1 = new Car("Fiesta" ,"234" , 180);
		Vehicle car2 = new Car("EcoSport" ,"222" , 180);
		Vehicle car3= new Car("Fusion" ,"111" , 180);
		
		Vehicle truck1 = new Truck("Raptor","390",250);
		Vehicle truck2 = new Truck("Bonoco","567",250);
		Vehicle truck3 = new Truck("XLT","123",250);
		
		ArrayList<Vehicle> inventory= new ArrayList<>();
		inventory.add(car1);
		inventory.add(car3);
		inventory.add(truck1);
		inventory.add(truck2);
		inventory.add(truck3);
			
		Inventory<Vehicle> inventoryClass = new Inventory<>(inventory);
		inventoryClass.addToInventory(car2);
		inventoryClass.removeFromInventory(inventory,"567");
		System.out.println(inventoryClass);
		Vehicle vehicle1=new Vehicle("Fiesta" ,"234" , 180);
		Vehicle vehicle2 = new Vehicle("EcoSport" ,"222" , 180);
		Vehicle vehicle3 =new Vehicle("Bonoco","567",250);
    	System.out.println(vehicle1.getHorsePower());
    	System.out.println(vehicle2.getVin());
    	System.out.println(vehicle3.getHorsePower());
		
		
		
		
	}

}
