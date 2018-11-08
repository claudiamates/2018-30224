
public class Room {
	private String name;
	private SmartDevice[] device;
	
	public Room()
	{
		device = new SmartDevice[5];
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public SmartDevice[] getSmartDevices() {
		return device;
	}

	public boolean addSmartDevice(SmartDevice d) {
		
		int i;
		if ( device[4] != null )
			return false;
		for ( i = 0; (i < 5) && (device[i] != null); i++)
		{
			
		}


		device[i] = d;
		return true;
	}
	
	public String getStatus()
	{	
		String s = new String();
		s += ("Room name: " + name + "\n");
		for ( int i = 0; (i < 5) && (device[i] != null); i++)
		{
			s += ("			");
			s += device[i].getStatus();
		}
		return s;
	} 
	


}
