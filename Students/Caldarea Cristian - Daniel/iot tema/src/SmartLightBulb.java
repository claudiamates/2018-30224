
public class SmartLightBulb extends SmartDevice{
	private String color;
	Integer intensity;
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Integer getIntensity() {
		return intensity;
	}
	public void setIntensity(Integer intensity) {
		this.intensity = intensity;
	}
	
	public String getStatus()
	{
		String s = super.getStatus();
		s +=("Light Bulb color: " + color +  ", intensity:" + intensity + "\n");
		return s;
	} 
}
