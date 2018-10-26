package vehicle;

public class Car extends Vehicle {

	public Car() {
		super(4);
		System.out.println("Creating a car..");
	}

	public void carMethodOnly() {
		System.out.println("I can do something buses can't!");
	}
}
