
public class MainClass {
	public static void main(String args[]){
		MainController aaah = new MainController();
		Room room1 = new Room();
		SmartDevice d1 = new SmartLightBulb();
		d1.turnOn();
		System.out.println(d1.isTurnedOn());
		d1.turnOff();
		System.out.println(d1.isTurnedOn());
		d1.turnOn();
		room1.addSmartDevice(d1);
		aaah.addRoom(room1);
		System.out.println(aaah.turnOffAllSmartDevices());
		System.out.println(aaah.turnOnAllSmartDevices());
		System.out.println(aaah.turnOffAllSmartDevices());
		System.out.println(aaah.getStatus());
		}
}
