package generics;

public class Vehicle {
static String make = "Ford";
String model;
String vin;
int horsePower;

public Vehicle(String model, String vin2, int horsePower) {
	this.model = model;
	this.vin = vin2;
	this.horsePower = horsePower;
	
}
public Vehicle() {
	
}

public String getModel() {
	return model;
}

public void setModel(String model) {
	this.model = model;
}

public String getVin() {
	return vin;
}

public void setVin(String vin) {
	this.vin = vin;
}

public int getHorsePower() {
	return horsePower;
}

public void setHorsePower(int horsePower) {
	this.horsePower = horsePower;
}

@Override
public String toString() {
	return "Vehicle [model=" + model + ", vin=" + vin + ", horsePower=" + horsePower + "]";
}




}
