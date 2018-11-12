
public class SmartDevice {
	private int id;
	private String name;
	private boolean turnedOn;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isTurnedOn() {
		return turnedOn;
	}
	public void turnOff() {
		this.turnedOn = false;
	}
	public void turnOn() {
		this.turnedOn = true;
	}
	
	public String getStatus()
	{
		String s = new String();
		s += ("Name: " + name +  ", is On :" + turnedOn);
		return s;
	} 
	
	

}
