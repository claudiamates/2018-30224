
public class SmartThermometer extends SmartDevice{
	private double temperature;

	public double getTemperature() {
		return temperature;
	}

	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}
	
	public String getStatus()
	{
		String s;
		s = super.getStatus();
		s += ("Thermometer. temperature: " + temperature + "\n");
		return s;
	} 

}
