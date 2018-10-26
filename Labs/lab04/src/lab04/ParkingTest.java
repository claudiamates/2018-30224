package lab04;

import org.junit.Assert;
import org.junit.Test;

import parking.CarParkingSlot;
import parking.ParkingSlot;
import vehicle.Bus;
import vehicle.Car;
import vehicle.Vehicle;

public class ParkingTest {

	@Test
	public void testParking() {
		CarParkingSlot carParkingSlot = new CarParkingSlot();
		carParkingSlot.setAvailable(true);

		Car car = new Car();
		Bus bus = new Bus();

		boolean result = carParkingSlot.park(car);

		Assert.assertTrue(result);

		result = carParkingSlot.park(car);

		Assert.assertFalse(result);

		carParkingSlot.park(bus);
	}

	@Test
	public void testDrive() {
		ParkingSlot carParkingSlot = new CarParkingSlot();

		Assert.assertTrue(carParkingSlot instanceof CarParkingSlot);
		Assert.assertTrue(carParkingSlot instanceof ParkingSlot);
	}

	@Test
	public void testArrays() {
		Vehicle[] vehicles = new Vehicle[20];

		for (int i = 0; i < 10; i++) {
			vehicles[i] = new Car();
			vehicles[10 + i] = new Bus();
		}

		for (int i = 0; i < vehicles.length; i++) {
			Vehicle currentVehicle = vehicles[i];
			System.out.println(currentVehicle.getNumberOfWheels());
			if (currentVehicle instanceof Car) {
				((Car) currentVehicle).carMethodOnly();
			}
		}
	}
}
