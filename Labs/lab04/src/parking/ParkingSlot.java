package parking;

import vehicle.Vehicle;

public class ParkingSlot {

	// UML
	// public    -> +
	// protected -> #
	// private   -> -

	private int number;
	private boolean available;
	private double price;

	private final int CONSTANT = 0;

	public int publicAttribute;
	protected int protectedAttribute;

	private Vehicle parkedVehicle;
	private Vehicle[] vehicles;

	public int getNumber() {
		return number;
	}

	public boolean isAvailable() {
		return available;
	}

	private void privateMethod() {

	}

	public void setAvailable(boolean available) {
		this.available = available;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Vehicle getParkedVehicle() {
		return parkedVehicle;
	}

	public boolean park(Vehicle vehicle) {
		if (isAvailable()) {
			this.parkedVehicle = vehicle;
			setAvailable(false);
			return true;
		}
		return false;
	}
}
